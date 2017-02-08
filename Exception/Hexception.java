package Exception;

import java.util.Scanner;

/**
 * Created by Android on 2/8/2017.
 */
public class Hexception {
    public static void  main(String [] args)
    {
        int a;
        int b;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the value of A");
        a=scan.nextInt();
        System.out.println("Enter the value of B");
        b=scan.nextInt();
        try{
            double div=a/b;
            System.out.println("Result="+(float)div);
        }
        catch (ArithmeticException e){
            System.out.println("You can't divide by Zero");

        }


    }
}
