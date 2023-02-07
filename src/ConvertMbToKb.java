import java.util.Scanner;

public class ConvertMbToKb {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("From: ");
        String from = scan.nextLine();

        System.out.println("to: ");
        String to = scan.nextLine();

        System.out.println("Vvedte znachenie: ");
        int value = scan.nextInt();

        if (from.equals("mb") && to.equals(("kb"))){
            System.out.println("Result: " + value * 1024);
        }else if (from.equals("kb") && to.equals("mb")){
            System.out.println("Result: " + value / 1024);
        }else {
            System.out.println("Nepravilnoe zznachenie");
        }
    }
}
