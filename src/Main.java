public class Main {
    public static void main(String[] args) {
        IntComparator c = new IntComparator();
        MyPQ pq = new MyPQ(c);

        pq.insert(new Integer(30), null);
        pq.insert(new Integer(10), null);
        pq.insert(new Integer(20), null);

        System.out.println((Integer)pq.removemin().getKey());
        System.out.println((Integer)pq.removemin().getKey());
        System.out.println((Integer)pq.removemin().getKey());

    }
}
