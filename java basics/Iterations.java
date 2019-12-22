package mak;

public class Iterations {

    int x = 7;
    void loops()
    {
//        for(int i =0; i < 10; i++)
//        {
//            System.out.println(i);
//        }

        for(int i = 0; i <= 30; i++)
        {
            if(i % 2 != 0)
                continue;

            System.out.println(i);
        }

    }
}
