import java.util.Scanner;

public class ObmenValut {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean isActive = true;

        while (isActive) {

            System.out.println("Choose operation..."
                    + "\n" + "1 -> Sell"
                    + "\n" + "2 -> Buy"
                    + "\n" + "3 -> Leave");
            int chooseOperation = scan.nextInt();
            if (chooseOperation ==3){
                System.out.println("Bye");
                break;
            }
            System.out.println("Choose currency..."
                            + "\n" +"1 -> Dollar"
                            + "\n" + "2 -> Euro"
                    /*+ "\n" + "3 -> Som"*/);
            int chooseCurrency = scan.nextInt();

            if (chooseOperation == 1 && chooseCurrency == 1) {
                System.out.println("Sell operation --- ");
                System.out.println("Enter amount of Dollars to sell: ");
                int amountToSellD = scan.nextInt();
                System.out.printf("You will get: " + (float)amountToSellD * 86.5 + " som");
            }else if
            (chooseOperation == 1 && chooseCurrency == 2){
                System.out.println("Sell operation --- ");
                System.out.println("Enter amount of Euro to sell: ");
                int amountToSellE = scan.nextInt();
                System.out.printf("You will get: " + (float)amountToSellE * 100 + " som");
            }

            if (chooseOperation == 2 && chooseCurrency == 1){
                System.out.println("Buy operation ---");
                System.out.println("Enter amount of Som to buy Dollars: ");
                int amountToBuyD = scan.nextInt();
                System.out.println("You will get: " + (float)amountToBuyD / 86.5 + " US Dollar");
            }else if
            (chooseOperation == 2 && chooseCurrency == 2){
                System.out.println("Buy operation ---");
                System.out.println("Enter amount of Som to buy Euro: ");
                int amountToBuyE = scan.nextInt();
                System.out.println("You will get: " + (float)amountToBuyE / 100 + " Euro");
            }

        }
    }
}