package Day2;

import java.util.Scanner;

public class TE1 {
    public void fun1()
    {
        Scanner input = new Scanner(System.in);
        int x = 1;
         do {
             try {
                System.out.println("Enter the first number");
                int n1 = input.nextInt();
                System.out.println("Enter the second number");
                int n2 = input.nextInt();
                int sum = n2 / n1;
                System.out.println(n1 + n2);
                System.out.println(sum);
                x = 2;
                }

             catch(Exception e)
            {
                System.out.println("You can't do that here");
            }

            }
         while(x == 1);
    }

    }
