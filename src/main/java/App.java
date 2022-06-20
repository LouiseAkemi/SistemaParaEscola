import controller.menuController.MainMenuController;
import repository.GradesRepository;
import repository.StudentsRepository;

public class App {
    public static void main(String[] args) {
        StudentsRepository.initialize();
        GradesRepository.initialize();
        MainMenuController.run();

    }
}
