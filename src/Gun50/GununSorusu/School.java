package Gun50.GununSorusu;

import java.util.ArrayList;

public class School {

    private String name;
    private int maxStudents;
    private ArrayList<Student> studentslist = new ArrayList<>();
    private ArrayList<Employee> employeeslist = new ArrayList<>();

    public School(String name, int maxStudents) {
        this.name = name;
        this.maxStudents = maxStudents;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxStudents() {
        return maxStudents;
    }

    public void setMaxStudents(int maxStudents) {

        this.maxStudents = maxStudents;
    }

    public ArrayList<Student> getStudentslist() {
        return studentslist;
    }

    public void setStudentslist(ArrayList<Student> studentslist) {

        this.studentslist = studentslist;
    }

    public ArrayList<Employee> getEmployeeslist() {
        return employeeslist;
    }

    public void setEmployeeslist(ArrayList<Employee> employeeslist) {
        this.employeeslist = employeeslist;
    }
}
