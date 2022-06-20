package views.show;
import model.Grades;
import model.SubjectsEnum;
import repository.GradesRepository;
import java.util.List;

public class ShowGradeBySubject {
    public static void run(SubjectsEnum subject){

        // header
        System.out.println("----------------------- Boletim -----------------------");
        System.out.printf("%-40s %-15s","Nome",subject.getLabel());
        System.out.println("\n-------------------------------------------------------");

        // grades
        List<Grades> gradeList = GradesRepository.getGradesList(subject);
        for (Grades grade : gradeList){
                System.out.printf("%-40s %-16.2f %n", grade.getStudent().getName()+ " " + grade.getStudent().getSurname(),
                        grade.getGrade());
        }
        System.out.println();
    }
}
