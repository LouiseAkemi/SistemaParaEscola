package views.servicesEntry;
import model.Grades;
import model.Students;
import model.SubjectsEnum;
import repository.GradesRepository;
import views.validation.GradeValidate;

import java.util.Scanner;

public class ReleaseGradeBySubject {
    public static void run(SubjectsEnum subject, Scanner sc){
        System.out.println("------------------- Lançamento das notas -------------------");
        System.out.printf("Disciplina: %s %n", subject.getLabel());
        System.out.println("------------------------------------------------------------");

        float grade = -1f;
        for (Students student : Students.sortByABC()){
            do {
                System.out.printf("\t %s %s --- nota: ", student.getName(), student.getSurname());
                grade = GradeValidate.run(sc);
            }while(grade<0f);
            Grades studentGrade = new Grades(student, grade);
            GradesRepository.save(subject, studentGrade);
        }
        System.out.println();
    }
}
