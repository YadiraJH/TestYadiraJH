package controllers;

import com.avaje.ebean.Model;
import models.Student;
import play.data.Form;
import play.mvc.*;
import views.html.*;
import java.util.List;
import static play.libs.Json.*;
import play.data.*;

public class Application extends Controller {
	
	public Result index() {
		//List<Student> students = Student.findall();
        return ok(index.render("Hello world"));
    }

    public Result addStudent(){
        Student student = Form.form(Student.class).bindFromRequest().get();
        student.save();
        return  redirect(routes.Application.index());
    }

    public Result delStudent(){
        List<Student> students = new Model.Finder(String.class,Student.class).all();
        for(Student student : students) {
            if (student != null) {
                student.delete();
                break;
            }
        }
        return  redirect(routes.Application.index());
    }
	
	public Result getStudents(){
        List<Student> students = new Model.Finder(String.class,Student.class).all();
        return  ok(toJson(students));
    }
}
