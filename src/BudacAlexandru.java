import java.util.Scanner;

public class BudacAlexandru {
    public static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("Introdu numele");
        String nume = input.nextLine();
        System.out.println("Introdu varsta");
        int varsta = input.nextInt();
        System.out.println(nume + " ai " + varsta + " ani.");
    }
}
