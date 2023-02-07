import java.util.Random;
import java.util.Scanner;

public class LoopPractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int randomNumber = random.nextInt(10);
        boolean checkNumber = true;
        for (int i = 0; i < 3; i ++){
            System.out.println("Отгадай случайное число: ");
            int numberFromUser = scanner.nextInt();

            if (randomNumber == numberFromUser){
                System.out.println("Вы отгадали!");
                checkNumber = false;
                break;
            } else if (numberFromUser < randomNumber) {
                System.out.println("Введенное число меньше");
            }else if (numberFromUser > randomNumber){
                System.out.println("Введенное число больше!");
            }else {
                System.out.println("Введенное число скорее всего меньше 0!");
            }
        }

        if (checkNumber)
            System.out.println("Рандомное число: " + randomNumber);
    }
}

/*
В программе генерируется случайное целое число от 0 до 100.
Пользователь должен его отгадать не более чем за 10 попыток.
После каждой неудачной попытки должно сообщаться больше или меньше введенное пользователем число,
чем то, что загадано.
Если за 10 попыток число не отгадано, то вывести загаданное число.
 */
