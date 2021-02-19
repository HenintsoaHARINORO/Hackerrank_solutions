import java.util.ArrayList;
import java.util.List;

public class Comparator {
    public static void main(String [] args){
        List<Student> students= new ArrayList<>();
        Student s1= new Student("John",4);
        students.add(s1);
        Comparator <Student> desc =new Comparator <Student>(){

            public int compare(Student s1,Student s2){
                if(s1.marks ==s2.marks){
                    return s2.name.compareTo(s1.name);
                }
                return s1.marks>s2.marks?-1:1;
            }
        };
    }
}
