package repository;
import model.Grades;
import model.SubjectsEnum;
import java.util.*;

public class GradesRepository {
    private static Map<SubjectsEnum, List<Grades>> mapGrades;

    public static void initialize() {
        mapGrades = new TreeMap<>();

        Grades student1_math = new Grades(StudentsRepository.getMapStudents().get("0001"), 10f);
        Grades student2_math = new Grades(StudentsRepository.getMapStudents().get("0002"), 8.5f);
        Grades student3_math = new Grades(StudentsRepository.getMapStudents().get("0003"), 9.3f);
        Grades student4_math = new Grades(StudentsRepository.getMapStudents().get("0004"), 10.f);

        Grades student1_port = new Grades(StudentsRepository.getMapStudents().get("0001"), 8f);
        Grades student2_port = new Grades(StudentsRepository.getMapStudents().get("0002"), 8.4f);
        Grades student3_port = new Grades(StudentsRepository.getMapStudents().get("0003"), 9.5f);
        Grades student4_port = new Grades(StudentsRepository.getMapStudents().get("0004"), 7.f);

        Grades student1_engl = new Grades(StudentsRepository.getMapStudents().get("0001"), 5f);
        Grades student2_engl = new Grades(StudentsRepository.getMapStudents().get("0002"), 9.5f);
        Grades student3_engl = new Grades(StudentsRepository.getMapStudents().get("0003"), 9.0f);
        Grades student4_engl = new Grades(StudentsRepository.getMapStudents().get("0004"), 6.f);

        save(SubjectsEnum.MATH, student1_math);
        save(SubjectsEnum.PORTUGUESE,student1_port);
        save(SubjectsEnum.ENGLISH,student1_engl);

        save(SubjectsEnum.MATH,student2_math);
        save(SubjectsEnum.PORTUGUESE,student2_port);
        save(SubjectsEnum.ENGLISH,student2_engl);

        save(SubjectsEnum.MATH,student3_math);
        save(SubjectsEnum.PORTUGUESE,student3_port);
        save(SubjectsEnum.ENGLISH,student3_engl);

        save(SubjectsEnum.MATH,student4_math);
        save(SubjectsEnum.PORTUGUESE,student4_port);
        save(SubjectsEnum.ENGLISH,student4_engl);
    }

    public static void save (SubjectsEnum subject, Grades grade){
        List<Grades> gradesList = Objects.isNull(getGradesList(subject)) ?
                    new ArrayList<>() : getGradesList(subject);
        gradesList.add(grade);
        mapGrades.put(subject,gradesList);
    }

    public static List<Grades> getGradesList(SubjectsEnum key) {
        return mapGrades.get(key);
    }

    public static Map<SubjectsEnum, List<Grades>> getMapGrade() {
        return mapGrades;
    }

    public static void clean (SubjectsEnum subject){
        if(!Objects.isNull(getGradesList(subject))){
            mapGrades.replace(subject,new ArrayList<>());
        }
    }
}
