package Working_With_Abstraction_Lab.Student_System_03;

import java.util.HashMap;
import java.util.Map;

public class StudentRepository {
    private Map<String, Student> studentsByName;

    public StudentRepository() {
        this.studentsByName = new HashMap<>();
    }

    public void add(Student student) {
        this.studentsByName.put(student.getName(), student);
    }

    public Map<String, Student> getStudentsByName() {
        return studentsByName;
    }

    public Student get(String name) {
        return this.studentsByName.get(name);
    }
    
}
