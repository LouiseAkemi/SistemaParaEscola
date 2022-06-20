package views.menus;
import model.SubjectsEnum;
import views.validation.OptionEnumValidate;
import java.util.Scanner;

public class SelectSubjectMenu extends BasicMenu<Integer> {
    @Override
    public Integer run(Scanner sc) {
        System.out.println("Selecione a disciplina: ");
        for(int i = 0; i < SubjectsEnum.values().length; i++){
            System.out.printf("\t%d - %s %n", i+1, SubjectsEnum.values()[i].getLabel());
        }

        int option = -1;
        do {
            System.out.print("Digite o codigo da disciplina: ");
            option = OptionEnumValidate.run(sc,SubjectsEnum.values());
        }while(option < 0 || option >= SubjectsEnum.values().length);

        return option;
    }
}
