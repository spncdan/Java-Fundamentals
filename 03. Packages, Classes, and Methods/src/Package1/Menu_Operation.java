package Package1; // This class "Menu_Operation", is within the package known as Package1

/* Benefits of Packages in Java:

 - Locally group related classes and interfaces
 - Allow different functionalities to be developed independently and then integrate them later
 - Makes maintaining and updating code easier
 - Java API is organized into packages giving clear structure for developers to use
 - Class organization which is beneficial for understanding relationship and dependencies among classes

 */

// This is the class of Menu_Operation
public class Menu_Operation {

    // Typing 'psvm' + enter will automatically make a main method like below
    // The main method will ALWAYS run even and at the end, the program will end
    public static void main(String[] args) {

        // Typing sout + enter will automatically make a "System.out.println()"
        // Here is an example of a menu as I would create one in my console based C++ games
        System.out.println("*************************************************");
        System.out.println(" ");
        System.out.println("          Welcome to This Java Program! ");
        System.out.println(" ");
        System.out.println("Please choose a number from the following options: ");
        System.out.println(" ");
        System.out.println("1. Do Thing");
        System.out.println("2. Do Other Thing");
        System.out.println("3. Exit");
        System.out.println(" ");
        System.out.println("*************************************************");
        System.out.println(" ");

        Advertisement(); // Calling Advertisement method in main method.
        // By specifying the package name and method you can call this outside of this package like in Main.java which is not within Package1
        // You would have to first import the package like import Package1.Menu_Operation; at the very top
        // Then you simply do Menu_Operation.Advertisement();
    }

    // You can only have ONE main method per class so for this method lets name is something different.
    // Because this is not the main method we must manually call it for it to run
    public static void Advertisement() {

        System.out.println("Hello, there is 40% sale on Jeans in-store Today!");

    }

}
