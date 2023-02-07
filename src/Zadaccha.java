import java.util.Scanner;

public class Zadaccha {
        public static void main(String [] args) {
            Scanner scan = new Scanner(System.in);

            System.out.println("number1");
            int numb1 = scan.nextInt();

            System.out.println("number2");
            int numb2 = scan.nextInt();

            System.out.println("number3");
            int numb3 = scan.nextInt();

            if (numb1 <= numb2 && numb1 <= numb3){
                System.out.println("Min " + numb1);
            }else if(numb2 < numb1 && numb2 < numb3)
                System.out.println("Min " + numb2);
            else
                System.out.println("Min " + numb3);

            if (numb1 >= numb2 && numb1 >= numb3){
                System.out.println("Max " + numb1);
            }else if(numb2 > numb1 && numb2 > numb3)
                System.out.println("Max " + numb2);
            else
                System.out.println("Max " + numb3);
        }
}
