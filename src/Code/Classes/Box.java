package Code.Classes;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Countable> implements Countable {

    private List<T> boxList = new ArrayList();

    public int getCount(){
        return boxList.size();
    }

    public void add(T items) {
        boxList.add(items);
    }

}
