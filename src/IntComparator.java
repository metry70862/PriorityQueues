import java.util.Comparator;

public class IntComparator implements Comparator {
    public int compare(Object o1, Object o2) {
        if (!(o1 instanceof Integer) || !(o2 instanceof Integer)) {
            throw new ClassCastException("Objects cannot be compared");
        }
        return (Integer) o1 - (Integer) o2;
    }
}
