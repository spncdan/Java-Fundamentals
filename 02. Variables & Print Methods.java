// Displaying Messages and Numbers

/*

In the term System.out, "System" is a class

In the term System.out, "out" is an object of the 'PrintStream' Class and a field (inside) of the 'System' Class.
"out" refers to the standard output device (screen)
The "out" object is what has the print() and println() methods

print() is a method which displays its parameter on the console window but does not break to a new line
println() is a method which displays its parameter on the console window and then breaks to a new line
"ln" as seen in println means to break to a new line.

Remember that objects themselves can also contain methods just like a class.
If you wish to access the methods of an object be sure to put a "." after calling the object name then the method name.

E.G - System.out.println("Hello World!")

Strings in Java should be in double quotes (E.G: " ", "Hello", "123")
Numbers in Java can be inputted just as themselves (E.G: 40, -34, 39.43)

Variables are names used to refer to data stored in the memory very similar to C++

int myVar = 10;

So now myVar will refer to the integer value of 10 when called upon

*/

public class Main {

    // Displaying strings in the console
    public static void main(String[] args) {

        // Here is the println method using strings
        System.out.println("Hello World"); // Hello World will be displayed in the console
        System.out.println("123"); // 123 will be displayed in the console
        System.out.println(" "); // A space will be displayed in the console

        // Here is the print method using strings
        System.out.print("Hello");
        System.out.print(" ");
        System.out.print("World");
        // Hello World will be displayed in the console

        // Here is the println method using numbers and basic arithmetic
        System.out.println(4); // 4 will be displayed in the console
        System.out.println(5 + 5); // 10 will be displayed in the console
        System.out.println(50/10); // 5 will be displayed in the console

        int myNum = 10; // Creation of a variable
        int myNum2 = 6; // Creation of a second variable

        System.out.println(myNum + myNum2); // 16 will be displayed as it takes the two variables and adds their values

    }

}
