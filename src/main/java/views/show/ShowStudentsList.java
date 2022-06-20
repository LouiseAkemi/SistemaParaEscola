package views.show;
import java.util.List;

public class ShowStudentsList {
    public static <T> void run(List<T> studentsList){
        System.out.println();
        studentsList.forEach(System.out::print);
        System.out.println();
    }
}
