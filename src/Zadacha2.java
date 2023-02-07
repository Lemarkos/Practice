import java.util.Scanner;

public class Zadacha2 {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number");
        int num = scan.nextInt();


        if (num % 2 ==0){
            int result = ((num%10)+((num/10)%10)+((num/100)%10));
            System.out.println(result);
        }
        else {
            int result2 = ((num % 10) * ((num / 10) % 10) * ((num / 100) % 10));
            System.out.println(result2);
        }
    }
}
