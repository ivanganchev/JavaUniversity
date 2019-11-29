package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);

        System.out.println("Enter currency");
        String currency = obj.nextLine();

        System.out.println("Enter money");
        int money = obj.nextInt();

        moneyConverter(currency, money);


    }

    public static void moneyConverter(String userName, int money){

        switch(userName){
            case "bgn":
                System.out.println(money * 1.77);
                break;
            case "eur":
                System.out.println(money * 0.90);
                break;
            case "try":
                System.out.println(money * 5.70);
                break;
            default:
                return;
        }
    }





}
