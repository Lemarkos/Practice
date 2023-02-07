import java.util.Scanner;

public class Pbm {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Viberyte pol: " + "M" + " or " + "F");
        String muj = scan.nextLine();
        String jen = scan.nextLine();
        String gender = muj + jen;
        System.out.println("Vvedite ves");
        int kg = scan.nextInt();

        System.out.println("Vvedite rost");
        int sm = scan.nextInt();

        System.out.println("Vvedite vozrast");
        int vozr = scan.nextInt();
        int result = 0;
        switch (gender) {
            case "m" -> {
                result = (int) (66.5 + (13.75 * kg) + (5.003 * sm) - (6.775 * vozr));
                System.out.println(result);
            }
            case "f" -> {
                result = (int) (655.1 + (9.563 * kg) + (1.85 * sm) - (4.676 * vozr));
                System.out.println(result);
            }
        }

        System.out.println("Vyberite uroven aktivnosti: ");
        System.out.println("-- 1. Minimalniy");
        System.out.println("-- 2. Nizkiy");
        System.out.println("-- 3. Umerenniy");
        System.out.println("-- 4. Visokiy");
        System.out.println("-- 5. Extrem");
        int aktiv = scan.nextInt();

        switch (aktiv) {
            case 1 -> System.out.println(result * 1.2);
            case 2 -> System.out.println(result * 1.375);
            case 3 -> System.out.println(result * 1.55);
            case 4 -> System.out.println(result * 1.7);
            case 5 -> System.out.println(result * 1.9);
        }
    }
}
