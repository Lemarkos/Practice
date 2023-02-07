import java.util.Scanner;

public class PracticeWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        while(num < 100){
            System.out.println("eshe raz");
            num = scan.nextInt();
        }
        System.out.println("bolshe 100");

        /*int num = 0;
        while(num % 2 == 0){
            System.out.println("enter");
            num = scan.nextInt();
            System.out.println("whiule");
        }*/

        /*char alf = 90;
        while (alf >=65){
            if(alf == 88){
                alf--;
                continue;
            }else
                System.out.println(alf + " ");
        }alf--;*/

        //int sum = 0;
        //int i = 0;

        /*while (sum <= 1000){
            System.out.println("i = " + i);
            sum+=i;
            System.out.println("sum = " +sum);
            i++;
        }
        System.out.println("summa" + sum);*/


    }
}
