package ThirdTask;

import ThirdTask.Bird;
import ThirdTask.Flyable;

public class Sparrow extends Bird implements Flyable {
    @Override
    public void fly() {
        System.out.println("The ThirdTask.Sparrow is flying.");
    }
}
