package views.validation;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class OptionEnumValidate{
    public static <T extends Enum<T>> int run(Scanner sc, T[] selectedEnum){
        int option= 0;
        try{
            option = sc.nextInt();
            if (option < 1 || option >= Arrays.asList(selectedEnum).size()+1) {
                System.out.println("Resposta invalida! Tente novamente.");
                System.out.println("-----------------------------------------------------------------");
                return -1;
            }
        }catch(InputMismatchException Exception){
            System.out.println("Resposta invalida! Tente novamente.");
            System.out.println("-----------------------------------------------------------------");
            sc.nextLine();
            return -1;
        }
        return option-1;
    }
}
