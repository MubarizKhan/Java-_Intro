package mak;

//import javax.management.relation.Relation;

public class Line implements Relation {
    private int  x1, x2, y1, y2;

    public Line(int x1, int x2, int y1, int y2)
    {
        super();
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    public double getLength()
    {
        return Math.sqrt( (x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
    }

    @Override
    public boolean isEqual(Object b) {
        double l1 = getLength();
        double l2 = ((Line)b).getLength();
        if (l1 == l2)
        {
            return true;
        }

        return false;
    }


    public boolean isLess(Object b)
    {
        double l1 = getLength();
        double l2 = ((Line)b).getLength();

        if (l1 < l2)
        {
            return true;

        }
        return false;
    }

    public boolean isGreater(Object b)
    {
        double l1 = getLength();
        double l2 = ((Line)b).getLength();
        if (l1 > l2)
        {
            return true;
        }
        return false;
    }
}
