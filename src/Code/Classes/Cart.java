package Code.Classes;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Cart implements Countable {

    private List<Box> cartList = new ArrayList();

    public int getCount(Predicate predicate) {
        return cartList.stream().map(o -> o.getCount(predicate)).mapToInt(Integer::intValue).sum();
    }

    public void add (Box box) {
        cartList.add(box);
    }


}
