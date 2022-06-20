package views.creation;
import views.validation.CpfValidate;
import views.validation.RegisterValidate;
import repository.StudentsRepository;
import model.Students;
import java.util.Random;
import java.util.Scanner;

public class CreateRegistration {
    public static void run(Scanner sc){

        System.out.println("Olá, seja bem vindo! Vamos iniciar o cadastro do novo aluno.");
        System.out.print("Nome: ");
        String name = sc.nextLine();
        System.out.print("Sobrenome: ");
        String surname = sc.nextLine();

        System.out.print("CPF: ");
        String cpf = CpfValidate.validateCPF(sc);
        CpfValidate.verifyExistenceCPF(cpf);

        String register;
        do{
            register = String.format("%04d", new Random().nextInt(9999));
        } while(RegisterValidate.verifyExistenceRegister(register));

        Students student = new Students(name, surname, cpf, register);
        StudentsRepository.save(student);

        System.out.println("-------------------------------------------------------");
        System.out.println("Aluno cadastrado com sucesso!");
        System.out.printf("Nome: %s %n",student.getName());
        System.out.printf("Sobrenome: %s %n",student.getSurname());
        System.out.printf("Cpf: %s %n",student.getCpf());
        System.out.printf("Matricula: %s %n",student.getRegister());
        System.out.println("-------------------------------------------------------");
    }
}
