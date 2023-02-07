import java.util.Scanner;

public class Kotleta {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Kol-vo objar kotlet: ");
        int k = scan.nextInt();

        System.out.println("Vremya na objarku: ");
        int m = scan.nextInt();

        System.out.println("Obshee kol-vo kotlet: ");
        int n = scan.nextInt();
        int result = n / k * (m*2);

        if (n % k != 0) {
            int res = result + (m*2);
            System.out.println(res);
        }else
            System.out.println(result);
    }
}
