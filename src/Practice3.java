import java.util.Scanner;

public class Practice3 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        //String userName = "admin";
        //String pass = "qwerty";

        System.out.println("number: ");
        String number = scan.nextLine();

        System.out.println("numberr: ");
        int num  = scan.nextInt();

        /*if (userName.equals(user) && pass.equals(password)){
            System.out.println("Username and passwrod is correct");
        }
        else {
            System.out.println("Not correcct");
        }*/

        /*switch(user){
            case "admin":
                System.out.println("login correct");
                break;
        }
        switch(password){
            case "qwerty":
                System.out.println("pass correct");
        }*/

        switch (number){
            case "sto":
                System.out.println("vy vveli chiso 100");
                break;
            case "pyat":
                System.out.println("vy vveli chislo 5");
        }

        if (num == 100){
            System.out.println("vy vveli chislo sto");
        }else if(num == 5){
            System.out.println("vy vvelli chislo pyat");
        }

    }
}
