import java.util.Scanner;

public class MaximDobinda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introdu numele: ");
        String nume = scanner.nextLine();

        System.out.print("Introdu prenumele: ");
        String prenume = scanner.nextLine();

        System.out.print("Introdu varsta: ");
        int varsta = scanner.nextInt();

        System.out.println("Nume: " + nume);
        System.out.println("Prenume: " + prenume);
        System.out.println("Varsta: " + varsta);

        scanner.close();
    }
}