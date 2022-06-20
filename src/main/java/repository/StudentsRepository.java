package repository;
import model.Grades;
import model.Students;
import model.SubjectsEnum;

import java.util.*;

public class StudentsRepository {
    private static Map<String, Students> mapStudents;

    public static void initialize(){
        mapStudents = new TreeMap<>();

        Students student1 = new Students("Ana","Bolena","98765432102","0001");
        Students student2 = new Students("Camilo","Iato","98765432103","0002");
        Students student3 = new Students("Wiliam","Barbosa","98765432104","0003");
        Students student4 = new Students("José","Gonçalves","98765432105","0004");

        save(student1);
        save(student2);
        save(student3);
        save(student4);
    }

    public static void save(Students student) {
        mapStudents.put(student.getRegister(),student);
    }

    public static List<Students> getStudentsList() {
        return new ArrayList<>(mapStudents.values());
    }

    public static Map<String, Students> getMapStudents() {
        return mapStudents;
    }

    public static Students getStudentsByKey(String key) {
        return mapStudents.get(key);
    }

}
