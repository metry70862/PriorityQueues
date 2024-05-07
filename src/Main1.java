import java.awt.Point;

public class Main1 {
    public static void main(String[] args) {
        IntComparator comparator = new IntComparator();
        MyPQ pq = new MyPQ(comparator);

        //실습 1번
        pq.insert(new Integer(30), null);
        pq.insert(new Integer(10), null);
        pq.insert(new Integer(20), null);

        System.out.println((Integer) pq.removemin().getKey());
        System.out.println((Integer) pq.removemin().getKey());
        System.out.println((Integer) pq.removemin().getKey());


    }


}
