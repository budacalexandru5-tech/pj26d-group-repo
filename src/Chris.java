import java.util.Scanner;

public class Chris {
    static void main(String[] args) {

        System.out.printf("Introduce numele tau: ");
        String nume = new Scanner(System.in).next();

        System.out.printf("Introduce varsta ta: ");
        int varstaTa = new Scanner(System.in).nextInt();

        System.out.println("--------------------");
        System.out.println("Varsta ta: " + varstaTa);
        System.out.println("Numele tau: " + nume);
    }
}
