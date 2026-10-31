import java.util.Scanner;

public class Cristiana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduceți numele: ");
        String nume = scanner.nextLine();

        System.out.print("Introduceți vârsta: ");
        int varsta = scanner.nextInt();

        System.out.println("\n--- Datele introduse ---");
        System.out.println("Numele tau este: " + nume);
        System.out.println("Vârsta ta este: " + varsta + " ani");

        scanner.close();
    }
}
