package Code.Classes;

import java.util.ArrayList;
import java.util.List;

public class Counter<T extends Countable> implements Countable {

    private List<T> counterList = new ArrayList<T>();

    public int getCount() {

        int count = 0;

        for (T items : counterList) {
            count += items.getCount();
        }

        return count;
    }

    public void add (T items) {
        counterList.add(items);
    }
}
