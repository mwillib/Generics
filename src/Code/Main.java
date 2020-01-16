package Code;

import Code.Classes.Apple;
import Code.Classes.Box;
import Code.Classes.Counter;

public class Main {

    public static void main(String[] args) {
        Counter counterApples = new Counter<Apple>(o -> true);
        Counter counterRedApples = new Counter<Apple>(o -> ((Apple) o).getColour().equals("red"));

        Box box = new Box<Apple>();
        box.add(new Apple("red"));
        box.add(new Apple("green"));
        box.add(new Apple("green"));
        box.add(new Apple("green"));

        counterApples.add(box);
        counterRedApples.add(box);

        System.out.println("Apples: " + counterApples.getCount());
        System.out.println("Red apples: " + counterRedApples.getCount());
    }
}
