import Controller.EventController;
import View.EventView;

public class Main {

    public static void main(String[] args) {

        EventController controller = new EventController();

        EventView view = new EventView(controller);

        view.start();
    }
}