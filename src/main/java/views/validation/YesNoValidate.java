package views.validation;
import views.menus.SelectTypeOfDeliveryMenu;
import java.util.Scanner;

public class YesNoValidate {
    public static boolean run(Scanner sc){
        String answer = sc.nextLine();
        if (answer.equalsIgnoreCase("s") || answer.equalsIgnoreCase("sim")){
            return true;
        } else if (answer.equalsIgnoreCase("n") || answer.equalsIgnoreCase("não")){
            return false;
        } else{
            System.out.println("Resposta invalida! Tente novamente.");
            new SelectTypeOfDeliveryMenu().run(sc);
        }
        return false;
    }
}
