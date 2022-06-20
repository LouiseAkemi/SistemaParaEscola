package views.menus;
import java.util.Scanner;

public abstract class BasicMenu <T>{
    public abstract T run(Scanner sc);

    public static void exit() {
        System.out.println("Voltando para o menu principal");
    };

    public static void invalidOption(){
        System.out.println("Opcão inválida, digite novamente!");
    }

}
