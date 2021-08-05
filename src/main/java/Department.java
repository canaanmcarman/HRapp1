import java.util.ArrayList;

public class Department {

    private String name;
    private ArrayList<User> employees = new ArrayList<>();


    public Department() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<User> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<User> employees) {
        this.employees = employees;
    }
}
