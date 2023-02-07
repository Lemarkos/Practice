import java.util.Scanner;

public class PracticeWhile1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //((a%10)+((a/10)%10)+((a/100)%10))
        /*System.out.println("chislo1");
        int a = scan.nextInt();
        int digit = 0;
        int sum = 0;
        while(a>0){
            digit = a % 10;
            a = a/10;
            sum = sum + digit;
        ////////////////////////////
        }System.out.println(sum);*/
        /*System.out.println("chislo1");
        int a = scan.nextInt();
        int digit = 0;
        int odd = 0;
        int even = 0;
        while(a>0){
            digit = a % 10;
            if (digit % 2 ==0){
                odd = odd + digit;

            } else {
                even = even + digit;
            }
            a = a/10;

        }System.out.println(odd);
        System.out.println(even);*/

//////////////////////////////////////////////
        //int num = (int)(Math.random() + 1000);
        int n = scan.nextInt();
        int random = 0;
        int evenCount = 0;
            for(int i = 0; i < n; i++){
                random = (int)(Math.random()*1000);
                if(random % 2 == 0){
                    evenCount++;
                }
        }
        System.out.println("even : " + evenCount);
        System.out.println("odd : " + (n - evenCount));
        System.out.println("even in percent : " + (100 * evenCount)/(float)n);

    }
}



//Вывести все квадраты натуральных чисел, не превосходящие данного числа N.
//Например, если N = 50, то на экран должен быть выведен ряд 1 4 9 16 25 36 49.
