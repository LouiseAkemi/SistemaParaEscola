package model;

import repository.StudentsRepository;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class Students {

    private final String name;
    private final String surname;
    private String cpf;
    private final String register;

    public Students(String name, String surname, String cpf, String register) {
        this.name = name;
        this.surname = surname;
        this.cpf = cpf;
        this.register = register;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getRegister() {
        return register;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return String.format("%s - Nome: %s %s \n",register, name, surname);
    }

    public static List<Students> sortByABC(){
        List<Students> studentsSort = asListSorted(StudentsRepository.getStudentsList(),
                Comparator.comparing(Students::getName));
        return studentsSort;
    }

    private static List<Students> asListSorted(List<Students> studentsList,Comparator<Students> comparator){
        if(Objects.nonNull(comparator)) {
            Collections.sort(studentsList, comparator);
        }
        return studentsList;
    }

    @Override
    public int hashCode() {
        return this.register.hashCode();
    }

}
