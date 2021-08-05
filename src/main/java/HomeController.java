import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
public class HomeController {

    ArrayList<Department> departments = new ArrayList<>();
    departments.add()

    @RequestMapping("/")
    public String index() {

        return "index";
    }

    @GetMapping("/departmentform")
    public String getDepartmentForm(Model model) {
        return "departmentform";
    }

    @PostMapping("/departmentform")
    public String getFromDepartment(){

        return "redirect:/departmentlist";
    }

    @GetMapping("/employeeform")
    public String getEmployeeForm() {
        model.addAtt
        return "employeeform";
    }
    @PostMapping("/employeeform")
    public String getFromEmployee() {

        return "employeeform";
    }

    @RequestMapping("departmentlist")
    public String viewAllDepartments() {
        return "departmentlist";
    }
    @RequestMapping("/employeelist")
    public String viewAllEmployees() {
        return "employeelist";
    }
}
