import java.util.Scanner;

public class doWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /*int password = 12345;
        int passFromUser = 0;
        int count =0;
        do{
            System.out.println("Enter");
            passFromUser= scan.nextInt();
            count++;
            System.out.println("count " +count);
        }while (password != passFromUser && count < 3);
        */

        /*int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        //for (int i = 0; i < 3; i++){
            if(a+b>c && a+c>b && c+b>a){
                System.out.println("sushectvuet");
            }else
                System.out.println("ne sushestvuet");
        */


        int counter = 0;
        int sum = 0;
        float arif = 0;
        while (true){
            int num = scan.nextInt();
            sum = sum + num;
            counter++;
            arif = sum / counter;
            if(num == 0){
                System.out.println("Kol-vo chisel: " + counter);
                System.out.println("Summa chisel: " + sum);
                System.out.println(arif);
            }
        }
    }
}
