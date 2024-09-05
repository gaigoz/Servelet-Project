package service;

import bean.Student;
import dao.StudentDao;

public class StudentService {

    StudentDao sd = new StudentDao();

    public String storeStudent(Student student) {

        if (student == null) {
            return "not valid student";
        } else if (sd.storeStudent(student) > 0) {
            return "success";
        } else {
            return "Product details didn't store";
        }
    }

    public String deleteStudent(int id){
        if(sd.deleteStudent(id) > 0){
            return "success";
        }else{
            return "fail";
        }
    }

    public String updateStudent(Student student){
        if(sd.updateStudent(student) > 0){
            return "success";
        }else{
            return "fail";
        }
    }
}
