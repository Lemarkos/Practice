import java.util.Scanner;
public class Practice2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("How much money you got: ");
        int urMoney = scan.nextInt();
        System.out.println("Phone price");
        int tele = scan.nextInt();
        int trassa = 15;
        if (urMoney > tele){
            System.out.println("U tebya hvataet");
        }
        if (urMoney < tele || urMoney + trassa >= tele){
            System.out.print("Ne hvataet");
        }
    }
}
