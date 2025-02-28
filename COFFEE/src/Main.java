public class Main {
        public static void main(String[] args) {
            //create 2 coffee objects
            Coffee coffee1 = new Coffee("Espresso", "Arabica", "Medium", 150, "Dark", "Colombia", false, 10, "Espresso Machine");
            Coffee coffee2 = new Coffee("Latte", "Robusta", "Large", 180, "Medium", "Brazil", false, 8, "French Press");

            //methods
            coffee1.addFlavor("Chocolate");
            coffee1.addFlavor("Caramel");
            coffee2.addFlavor("Vanilla");

            coffee1.updateStock(5);
            coffee2.discount(10);

            //print
            System.out.println(coffee1.describe());
            System.out.println(coffee2.describe());
        }


}
