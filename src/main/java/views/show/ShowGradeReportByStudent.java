package views.show;
import model.Grades;
import model.SubjectsEnum;
import repository.GradesRepository;
import repository.StudentsRepository;

public class ShowGradeReportByStudent {
    public static void run(String register){
        // header
        System.out.println("----------------------- Boletim -----------------------");
        System.out.printf("Aluno: %s %s %n", StudentsRepository.getStudentsByKey(register).getName(),
                StudentsRepository.getStudentsByKey(register).getSurname());

        System.out.println("-------------------------------------------------------");
        for(int i=0; i < SubjectsEnum.values().length; i++){
            System.out.printf("%-15s ",SubjectsEnum.values()[i].getLabel());
        }
        System.out.println("\n-------------------------------------------------------");

        // grades
        for(SubjectsEnum subject: SubjectsEnum.values()) {
            for (Grades gradesStudents : GradesRepository.getGradesList(subject)) {
                if(gradesStudents.getStudent().getRegister().equals(register)){
                    System.out.printf("%-16.2f",gradesStudents.getGrade());
                }
            }
        }
        System.out.println("\n-------------------------------------------------------\n");
    }

}
