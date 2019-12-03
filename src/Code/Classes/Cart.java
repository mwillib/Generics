package Code.Classes;

import java.util.ArrayList;
import java.util.List;

public class Cart implements Countable {

    private List<Box> cartList = new ArrayList();

    public int getCount() {

        int count = 0;

        for (Box box : cartList) {
            count += box.getCount();
        }

        return count;
    }

    public void add (Box box) {
        cartList.add(box);
    }


}
