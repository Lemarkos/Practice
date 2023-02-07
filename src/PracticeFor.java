import java.util.Random;
import java.util.Scanner;

public class PracticeFor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        int randomNumber = random.nextInt(10);
        boolean checkNum = true;
        for (int i = 0; i < 10; i++){
            System.out.println("Otgaday chislo");
            int numberFromUser = scan.nextInt();

            if(randomNumber == numberFromUser){
                System.out.println("Otgadali");
                checkNum = false;
                break;
            }else if(numberFromUser < randomNumber){
                System.out.println("Vvedennoe chislo menshe");
            }else if (numberFromUser > randomNumber){
                System.out.println("Vvedennoe chislo bolshe");
            }else {
                System.out.println("Vvedennoe chislo menshe 0");
            }
        }



    }
}
