import java.util.Scanner;

public class PracticeObshiy {
    public static void main(String[] args) {
//        int[] numbers = {1, 2, 4, 55, 2, 4, 2, 8, 5, 10};
//        for (int i = 0; i < numbers.length/2; i++) {
//            int buffer = numbers[i];
//            numbers[i] = numbers[numbers.length - 1-i-1];
//            numbers[numbers.length - i-1] = buffer;
//        }
//        for (int number : numbers) {
//            System.out.println(number);
//        }
        Scanner scan = new Scanner(System.in);

        int[] month = new int[10];
        for (int i = 0; i < month.length; i++){
            month[i] = (int)(Math.random()*10);
            System.out.print(month[i]+" ");
        }
        System.out.println();

        boolean isChange = false;

        while (!isChange){
            isChange=true;
            for (int i = 0; i < month.length; i++){
                int buffer = 0;
                if (i == month.length-1){
                    break;
                }else if (month[i] > month[i+1]){
                    isChange=false;
                    buffer = month[i];
                    month[i] = month[i+1];
                    month[i+1] = buffer;
                }
            }
        }
        for (int num : month){
            System.out.print(num + " ");
        }
    }
}