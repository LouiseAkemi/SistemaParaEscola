package views.menus;
import java.util.Scanner;

public class MainMenu extends BasicMenu<String> {

    @Override
    public String run(Scanner sc){
        System.out.println("------------- Bem vindo ao menu principal -------------");
        System.out.println("0 - Sair");
        System.out.println("1 - Lançamento das notas por disciplina");
        System.out.println("2 - Visualizar notas por disciplina");
        System.out.println("3 - Visualizar o boletim por aluno e enviar aos pais");
        System.out.println("4 - Cadastrar novo aluno");
        System.out.println("-------------------------------------------------------");
        System.out.print("Opção: ");

        return sc.nextLine();
    }

    public static void exit(){
        System.out.println("Saindo do sistema.");
    }
}
