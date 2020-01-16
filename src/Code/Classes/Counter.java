package Code.Classes;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Counter<T extends Countable> {

    private Predicate predicate;
    private List<T> counterList = new ArrayList<T>();

    public Counter(Predicate predicate) {
        this.predicate = predicate;
    }

    public int getCount() {
        return counterList.stream().map(o -> o.getCount(predicate)).mapToInt(Integer::intValue).sum();
    }

    public void add (T countable) {
        counterList.add(countable);
    }
}
