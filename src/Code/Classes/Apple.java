package Code.Classes;

import java.util.function.Predicate;

public class Apple implements Countable  {

    private String colour;

    public Apple() {

    }

    public Apple(String colour) {
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getCount(Predicate predicate) {
        return predicate.test(this) ? 1 : 0;
    }

}
