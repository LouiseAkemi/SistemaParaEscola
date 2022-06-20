package views.validation;
import java.util.Scanner;

public class GradeValidate {
    public static float run(Scanner sc){
        float grade = -1f;
        try{
            grade = sc.nextFloat();
            if (grade < 0f || grade > 10f) {
                System.out.println("Resposta invalida! Tente novamente.");
                System.out.println("-----------------------------------------------------------------");
                return -1f;
            }
        }catch(Exception NumberFormatException ){
            System.out.println("Resposta invalida! Tente novamente.");
            System.out.println("-----------------------------------------------------------------");
            sc.nextLine();
            return -1f;
        }
        return grade;
    }
}
