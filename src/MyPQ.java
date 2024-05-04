import java.util.ArrayList;
import java.util.Comparator;

public class MyPQ {
    private ArrayList<Object> sortedList;
    private Comparator<Object> comp;
    MyPQ(Comparator comp){
        sortedList = new ArrayList<>();
        this.comp = comp;
    }
    MyPQ(int initialCapacity, Comparator comp){
        sortedList = new ArrayList<>(initialCapacity);
        this.comp = comp;
    }

    public int size(){
        return sortedList.size();
    }

    public boolean isEmpty(){
        return sortedList.isEmpty();
    }
    public MyEntry insert(Object key, Object value){
        MyEntry newEntry = new MyEntry(key, value);
        if(sortedList.isEmpty()){
            sortedList.add(newEntry);
            return newEntry;
        }
        for (int i = 0; i < sortedList.size(); i++) {
            if(comp.compare(newEntry.getKey(), ((MyEntry)sortedList.get(i)).getKey())<0){
                sortedList.add(i, newEntry);
                return newEntry;
            }
        }
        sortedList.add(newEntry);
        return newEntry;
    }
    public MyEntry removemin(){
        return (MyEntry) sortedList.remove(0);
    }
    public MyEntry min(){
        return (MyEntry) sortedList.get(0);
    }
}
