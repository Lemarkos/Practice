import java.util.Random;
import java.util.Scanner;

public class LoopPractice2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите натуральное число: ");
        int numberFromUser = scanner.nextInt();
        int maxNumber = 0;
        for (; numberFromUser > 0 ;){
            int num = numberFromUser % 10;
            System.out.println("Num: " + num);
            numberFromUser/=10;
            System.out.println("Number from user: " + numberFromUser);
            if (num > maxNumber)
                maxNumber = num;
        }

        System.out.println("Max number: " + maxNumber);


    }
}

/*
С клавиатуры вводится натуральное число. Найти его наибольшую цифру.
Например, введено число 764580. Наибольшая цифра в нем 8.
 */
