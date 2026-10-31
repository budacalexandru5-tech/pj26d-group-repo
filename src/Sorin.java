import java.util.Scanner;

public class Sorin {
    public static void main(String[] args) {

        // reate Scanner object
        Scanner scanner = new Scanner(System.in);

        // display question to the user
        System.out.print("Enter your name:");
        // create a var to store name
        String name = scanner.next();

        // display question to the user
        System.out.print("Enter your age:");
        // create a var to store name
        int age = scanner.nextInt();

        // display user info
        System.out.println("Name: " + name);
        System.out.println("Age:  " + age);



    }
}