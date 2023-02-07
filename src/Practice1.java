import java.util.Scanner;
public class Practice1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int random = (int) ((Math.random()) * 100);

        System.out.print("First try: ");
        int a = scan.nextInt();
        if (random > a){
            System.out.println("Correct number is bigger");
        }
        if (random < a){
            System.out.println("Correct number is lower");
        }
        System.out.print("Second try: ");
        int b = scan.nextInt();
        if (random != b){
            System.out.println("Wrong");
        }
        System.out.print("Third try: ");
        int c = scan.nextInt();
        if (random != c){
            System.out.println("Wrong");
        }
        if (random == a || random == b || random == c){
            System.out.println("Correct");
        }
        if (random != a || random != b || random != c){
            System.out.print("Correct number is: " + random);
        }

    }
}
