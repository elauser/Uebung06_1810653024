import java.util.ArrayList;
public class StudentAufruf {
    public static void main(String[]args){
        ArrayList<Student> studenten = new ArrayList<>();
        studenten.add(new Student("hias", 1810653024, "Web18"));
        studenten.add(new Student("student1", 154545545, "Web17"));
        studenten.add(new Student("student2", 182938989, "weg10"));

        for(Student object: studenten){
            System.out.println(object.toString());
        }
    }

}
