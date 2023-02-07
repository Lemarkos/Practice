import java.util.Scanner;

public class ArrayPrarctice1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

//        int[] numbers = new int[50];
//
//        for (int i = 0; i < numbers.length; i++){
//            numbers[i] = (int)(Math.random()*100);
//        }
//        for (int i = numbers.length-1; i>=0; i--){
//            if (numbers[i] % 4 == 0){
//                System.out.println(numbers[i] + "");
//            }
//        }
//        int[] numbers = new int [12];
//
//        for (int i = 0; i < numbers.length; i ++){
//            numbers[i] = (int)(Math.random()*10);
//            System.out.print(numbers[i] + " ");
//        }
//        for (int i = 0; i < numbers.length; i++){
//            numbers[i] = numbers[i]*2;
//            System.out.print(numbers[i] + " ");
//        }
//        int [] numbers = {2,5,1,8,5,3};
//        int max = numbers[0];
//        int min = numbers[0];
//        int indmax = 0;
//        int indmin = 0;
//        for (int i = 0; i < numbers.length; i++){
//            if(max < numbers[i]){
//                max = numbers[i];
//                indmax=i;
//            }
//            if (min > numbers[i]){
//                min = numbers[i];
//                indmin=i;
//            }
//        }
//        System.out.println(max);
//        System.out.println(min);
//        System.out.println(indmax);
//        System.out.println(indmin);

        int num = scan.nextInt();
        int arif = 0;
        int[] numbers = new int[num];
        for (int i=0;i<numbers.length;i++){
            numbers[i]=(int)(Math.random()*100);
            System.out.println(numbers[i]);
        }
        for (int i = 0; i < num; i++){
            arif=arif+numbers[i];
        }
        arif=arif/num;
        System.out.println(arif);
    }
}