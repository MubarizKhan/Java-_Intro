package mak;

public class StaticTest {
    private static int a;
    public int b;

    public StaticTest()
    {
        a = 12;
        b = 0;
    }

    void set_b(int val1)
    {
        b = val1;
    }

    void set_a(int var1)
    {
        a = var1;
    }

    public int get_b()
    {
        return b;
    }

    public int get_a()
    {
        return a;
    }

}
