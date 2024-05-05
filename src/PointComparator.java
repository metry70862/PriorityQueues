import java.awt.Point;
import java.util.Comparator;

public class PointComparator implements Comparator {
    public int compare(Object o1, Object o2) {
        Point p1 = (Point) o1;
        Point p2 = (Point) o2;
        double d1 = Math.sqrt(Math.pow(p1.getX(),2) + Math.pow(p1.getY(),2));
        double d2 = Math.sqrt(Math.pow(p2.getX(),2) + Math.pow(p2.getY(),2));
        return Double.compare(d1, d2);
    }
}
