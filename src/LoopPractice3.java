import java.util.Random;
import java.util.Scanner;

public class LoopPractice3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите натуральное число: ");
        int numberFromUser = scanner.nextInt();
        int maxNumber = 0;
        for (; numberFromUser > 0 ;){
            int num = numberFromUser % 10;
            System.out.println("Num: " + num);
            numberFromUser/=10;

            maxNumber =  (maxNumber * 10 ) + num ;
        }

        System.out.println("Max number: " + maxNumber);


    }
}

/*
Сформировать из введенного числа обратное по порядку входящих в него цифр и вывести на экран.
Например, если введено число 3486, то надо вывести число 6843.
 */
