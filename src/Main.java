import FifthTask.Button;
import FifthTask.Light;
import FifthTask.Switchable;
import FirstTask.User;
import FirstTask.EmailValidator;
import SecondTask.Shape;
import SecondTask.Rectangle;
import SecondTask.Circle;
import ThirdTask.Bird;
import ThirdTask.Flyable;
import ThirdTask.Penguin;
import ThirdTask.Sparrow;
import FourthTask.Eatable;
import FourthTask.HumanWorker;
import FourthTask.RobotWorker;
import FourthTask.Workable;

public class Main {
    public static void main(String[] args) {
        Switchable light = new Light();
        Button button = new Button(light);
        button.press();

// Main of First Task
//        User user = new User("Alice", "alice@example.com");
//        EmailValidator validator = new EmailValidator();
//
//        if (validator.isValid(user.getEmail())) {
//            System.out.println(user.getName() + "'s email is valid.");
//        } else {
//            System.out.println(user.getName() + "'s email is invalid.");
//        }

// Main of Second Task
//        Shape rectangle = new Rectangle(5, 3);
//        Shape circle = new Circle(4);
//
//        System.out.println("Rectangle area: " + rectangle.area());
//        System.out.println("Circle area: " + circle.area());

// Main of Third Task
//        Bird sparrow = new Sparrow();
//        ((Flyable) sparrow).fly();
//
//        Bird penguin = new Penguin();
//        penguin.eat();

// Main of Fourth Task
//        Workable humanWorker = new HumanWorker();
//        Workable robotWorker = new RobotWorker();
//
//        humanWorker.work();
//        ((Eatable) humanWorker).eat();
//
//        robotWorker.work();
    }
}