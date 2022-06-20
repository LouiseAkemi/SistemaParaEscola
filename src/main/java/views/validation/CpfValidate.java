package views.validation;
import controller.MainMenuController;
import model.Students;
import repository.StudentsRepository;
import java.util.Scanner;

public class CpfValidate {

    public static String validateCPF(Scanner sc){
        String cpf = sc.nextLine();
        if(cpf.length() != 11){
            System.out.println("CPF invalido, digite novamente!");
            System.out.print("Cpf: ");
            return validateCPF(sc);
        }

        if (!cpf.matches("[0-9]+")) {
            System.out.println("Digite apenas números");
            return validateCPF(sc);
        }
        return cpf;
    }

    public static void verifyExistenceCPF(String cpf){
        for (Students student : StudentsRepository.getStudentsList()) {
            if(student.getCpf().equals(cpf)){
                System.out.println();
                System.out.println("Aluno já cadastrado");
                System.out.println("Voltando ao menu principal");
                System.out.println();
                MainMenuController.run();
            }
        }
    }
}
