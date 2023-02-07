import java.util.Scanner;

public class Blow {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter y: ");
        int y = scan.nextInt();
        System.out.println("Enter x: ");
        int x = scan.nextInt();

        if (x > 0 && y > 0){
            System.out.println("1 chetvert'");
        } else if (x < 0 && y > 0){
            System.out.println("2 chetvert");
        }else if (x < 0 && y < 0){
            System.out.println("3 chetvert");
        }else if (x > 0 && y < 0){
            System.out.println("4 chetvert");
        }
    }
}
