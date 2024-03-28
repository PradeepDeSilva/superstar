package chapter2;

import java.util.Scanner;

public class GrossPayClculator {

    public static void main(String arg[]){
        //1.Get the number of hours worked
        System.out.println("Enter the number of hours worked");
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();

        //2.Get the hours pay rate
        System.out.println("Enter the hours pay rate");
        double rate = scanner.nextDouble();
        //scanner.close();

        //3.Multiply hours pay rate
        double grossPay = hours * rate;

        //4.Display results
        System.out.println("The employee's gross pay is £" + grossPay);

        System.out.println("Enter the season of the year");
        String season = scanner.next();

        System.out.println("Enter whole number");
        int number = scanner.nextInt();

        System.out.println("Enter an adjective");
        String adjective = scanner.next();
        scanner.close();

        System.out.println("On a " + adjective + " " + season + " day, I drink a minimum of " + number + " cups of cofee.");
    }
}
