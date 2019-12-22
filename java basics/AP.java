package mak;
import javax.swing.*;

public class AP {

    void fun1()
    {
        int[] a = new int[7];
        for (int i = 0; i < a.length; i++)
            {
                a[i] = i;
            }

        for(int i = 0; i < a.length; i++)
            {
                System.out.print(a[i]);
            }
    }

    void fun2()
        {
            int[] numbers;
            String[] names;
            String input = JOptionPane.showInputDialog("Enter the number of students");
            int size = Integer.parseInt(input);
            numbers = new int[size];
            names = new String[size];

            for (int i = 0; i < numbers.length; i++)
                {
                    names[i] = JOptionPane.showInputDialog("Enter Students name");
                    input = JOptionPane.showInputDialog("Enter student number");
                    numbers[i] = Integer.parseInt(input);
                }

            for (int i = 0; i < numbers.length; i++)
                {
                    System.out.println(names[i]);
                    System.out.println(numbers[i]);
                }
        }

        void fun3(String a)
            {
                for(int i = 0; i < a.length() ; i++)
                    {
                        System.out.println(a.charAt(i));
                    }
            }

}
