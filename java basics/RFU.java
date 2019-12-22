package mak;

import java.util.Scanner;




//To  use  BufferedReader  class,  you  need  to  deal  with  the  exception
//        it  throws  throughreadLine() method which is IOException,
//        for instance, we will do this by changing thedefinition of main() method to throw that exception.

public class RFU {

    void rfu()
    {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter an integer");
//    System.out.println
    int number = input.nextInt();
    System.out.println("You entered" + number);

    }

    void comp_a_b()
        {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter first integer");
            int a = input.nextInt();
            System.out.print("Enter second integer");
            int b = input.nextInt();

            if (a > b)
            {
                System.out.println(" a is greater than b ");
            }
            else
            {
                System.out.println("B is greater than A");
            }

            while (a <= b)
            {
                System.out.println(a);
                a++;
            }
//            System.out.

            System.out.println("You entered" + a + " & " + b);
        }


}
