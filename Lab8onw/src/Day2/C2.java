package Day2;

public class C2 {

    public void fun1()
    {
        int a[] = new int[2];
        try {
            System.out.println("Access Element at Index three" + a[3]);
        }catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Exception thrown at" + e);

        }
        System.out.println("out of the block");
    }
}
