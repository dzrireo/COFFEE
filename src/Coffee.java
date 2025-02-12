public class Coffee {
    String name;
    String type;
    String size;
    double price;
    String roastLevel;
    String origin;
    boolean isDecaf;
    int stock;
    String[] flavorNotes;
    String brewMethod;
    int flavorCount;

    //constructor
    public Coffee(String name, String type, String size, double price, String roastLevel, String origin,
                  boolean isDecaf, int stock, String brewMethod) {
        this.name = name;
        this.type = type;
        this.size = size;
        this.price = price;
        this.roastLevel = roastLevel;
        this.origin = origin;
        this.isDecaf = isDecaf;
        this.stock = stock;
        this.brewMethod = brewMethod;
        this.flavorNotes = new String[5]; // Max 5 flavor notes
        this.flavorCount = 0;
    }

    //calculate price based on size
    public double calculatePrice() {
        double multiplier = switch (size.toLowerCase()) {
            case "medium" -> 1.2;
            case "large" -> 1.5;
            default -> 1.0; // Small
        };
        return price * multiplier;
    }

    //check stock
    public boolean checkStock() {
        return stock > 0;
    }

    //add flavor note
    public void addFlavor(String note) {
        if (flavorCount < 5) {
            flavorNotes[flavorCount] = note;
            flavorCount++;
        }
    }

    //udate stock
    public void updateStock(int quantity) {
        stock += quantity;
    }

    //change roast level
    public void changeRoastLevel(String newRoastLevel) {
        this.roastLevel = newRoastLevel;
    }

    //apply discount
    public void discount(double percentage) {
        price -= price * (percentage / 100);
    }

    //describe kofi
    public String describe() {
        StringBuilder flavors = new StringBuilder();
        for (int i = 0; i < flavorCount; i++) {
            flavors.append(flavorNotes[i]);
            if (i < flavorCount - 1) {
                flavors.append(", ");
            }
        }
        return String.format("%s (%s) - %s Roast%nOrigin: %s%nNotes: %s%nPrice: ₱%.2f%nStock: %d%nBrew Method: %s",
                name, type, roastLevel, origin, (flavorCount > 0 ? flavors : "No flavor notes"), calculatePrice(), stock, brewMethod);
    }
}
