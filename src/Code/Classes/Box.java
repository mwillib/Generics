package Code.Classes;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Box<T extends Countable> implements Countable {

    private List<T> boxList = new ArrayList();

    public int getCount(Predicate predicate){
        return boxList.stream().map(t -> t.getCount(predicate)).mapToInt(Integer::intValue).sum();
    }

    public void add(T items) {
        boxList.add(items);
    }
}
