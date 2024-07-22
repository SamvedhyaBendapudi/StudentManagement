public class Details{

    private String name;
    private String roll;
    private String attendance;
    private int sMaths;
    private int sPhy;
    private int sChem;

    public Details(String name, String roll, String attendance , int sMaths , int sPhy , int sChem){
        this.name = name;
        this.roll = roll;
        this.attendance = attendance;
        this.sMaths = sMaths;
        this.sPhy = sPhy;
        this.sChem = sChem;
    }

    public String getName(){
        return name;
    }

    public String getRoll(){
        return roll;
    }

    public String getAttendance(){
        return attendance;
    }

    public int getMaths(){
        return sMaths;
    }

    public int getPhy(){
        return sPhy;
    }

    public int getChem(){
        return sChem;
    }

    public int getsubjectMarks(String subjectName){
        if ("Maths".equals(subjectName)){
            return getMaths();
        }
        if ("Physics".equals(subjectName)){
            return getPhy();
        }
        if ("Chemistry".equals(subjectName)){
            return getChem();
        }
        System.out.println("Subject not found");
        return -1;
        }
        
    }

    





