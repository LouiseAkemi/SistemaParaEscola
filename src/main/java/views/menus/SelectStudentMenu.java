package views.menus;
import controller.menuController.MainMenuController;
import views.validation.RegisterValidate;
import model.Students;
import views.show.ShowStudentsList;
import java.util.Scanner;

public class SelectStudentMenu extends BasicMenu<String> {

    @Override
    public String run(Scanner sc){
        System.out.println("Selecione o aluno que deseja ver o boletim.");
        ShowStudentsList.run(Students.sortByABC());
        System.out.print("Digite a matricula do aluno: ");
        String registerSelected = sc.nextLine();

        if(! RegisterValidate.verifyExistenceRegister(registerSelected)){
            System.out.print("Matricula inexistente. ");
            exit();
            MainMenuController.run();
        }

        return registerSelected;
    }
}
