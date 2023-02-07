import java.util.Scanner;

public class TempArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] month = new int [31];

        for (int i = 0; i < month.length; i++){
            month[i] = (int)(Math.random()*(46-24)+25);
            System.out.print(month[i]+" ");
        }
        int high = 0;
        for (int i = 0; i < month.length; i++){
            if(month[i]>35){
            high++;
            }
        }
        System.out.println("\n"+"Kol-vo dney: " + high);
    }
}
