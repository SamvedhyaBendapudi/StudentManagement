import java.util.ArrayList;

public class Student {
    public ArrayList<Details> students = new ArrayList<>();

    public void addStudent(Details student){
        students.add(student);
    }
    
    public Details getDetails(String roll){
        for(Details detail : students){
            if (detail.getRoll().equals(roll))
                return detail;
        }
        return null;
    }

    public int getsubjectMarks(String roll, String subjectName){
        for (Details detail : students) {
            if (detail.getRoll().equals(roll)) {
                return detail.getsubjectMarks(subjectName);
            }
        }
        System.out.println("Student not found");
        return -1;
    }
    
    }



    

    


