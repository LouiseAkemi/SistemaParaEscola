package views.validation;
import model.Students;
import repository.StudentsRepository;

public class RegisterValidate {
    public static boolean verifyExistenceRegister(String register){
        for (Students students : StudentsRepository.getStudentsList()) {
            if (students.getRegister().equals(register)){
                return true;
            }
        }
        return false;
    }
}
