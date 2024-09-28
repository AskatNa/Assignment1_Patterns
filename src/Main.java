import FifthTask.Button;
import FifthTask.Light;
import FifthTask.Switchable;


public class Main {
    public static void main(String[] args) {
        Switchable light = new Light();
        Button button = new Button(light);
        button.press();

//        Workable humanWorker = new HumanWorker();
//        Workable robotWorker = new RobotWorker();
//
//        humanWorker.work();
//        ((Eatable) humanWorker).eat();
//
//        robotWorker.work();
    }
}