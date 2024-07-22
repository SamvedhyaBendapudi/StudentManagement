import java.util.Scanner;

public class StudentManagement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Student student = new Student();

        do {
            System.out.println("Select options");
            System.out.println("Option 1 : Add student");
            System.out.println("Option 2 : View student details");
            System.out.println("Option 3 : View student subject marks: ");

            int option = input.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Enter name:");
                    String name = input.next();
                    System.out.println("Enter roll:");
                    String roll = input.next();
                    System.out.println("Enter attendance:");
                    String attendance = input.next();
                    System.out.println("Enter marks for Maths:");
                    int sMaths = input.nextInt();
                    System.out.println("Enter marks for Physics:");
                    int sPhy = input.nextInt();
                    System.out.println("Enter marks for Chemistry:");
                    int sChem = input.nextInt();
                    // Details studentDetails = new Details(name, roll, attendance, sMaths, sPhy, sChem);
                    // student.addStudent(studentDetails);
                    student.addStudent(new Details(name, roll, attendance, sMaths, sPhy, sChem));
                    break;

                case 2:
                    System.out.println("Enter roll:");
                    String rollview = input.next();
                    Details viewdetail = student.getDetails(rollview);
                    if (viewdetail != null) {
                        System.out.println("Name: " + viewdetail.getName());
                        System.out.println("Roll: " + viewdetail.getRoll());
                        System.out.println("Attendance: " + viewdetail.getAttendance());
                        System.out.println("Mathematics Marks: " + viewdetail.getMaths());
                        System.out.println("Physics Marks: " + viewdetail.getPhy());
                        System.out.println("Chemistry Marks: " + viewdetail.getChem());
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;
                
                case 3:
                    
                    System.out.println("Enter roll:");
                    String rollsubjectview = input.next();

                    System.out.println("Enter subject name: ");
                    String subjectview = input.next();
                    int marks = student.getsubjectMarks(rollsubjectview,subjectview);
                    
                    

                
        

                default:
                    System.out.println("Invalid option");
                    break;
                
        
            }
        } while (true); 
        
        
    }
   
    
}
