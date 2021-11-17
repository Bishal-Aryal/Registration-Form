public class AcademicCourse extends Course // inherit encapsulated variable from parentclass named course
{
    private String lecturerName;
    private String level;
    private int credit;
    private String startingDate;
    private String completionDate;
    private int numberOfAssessments;
    private boolean isRegistered;
    private boolean courseRemovedStatus;
    
    public AcademicCourse(String courseID, String courseName, int courseDuration, String level, int credit, int numberOfAssessments) // parameterized constructor with six parameters
    {
        // A Call is made from super class3 Course
        super(courseID,courseName,courseDuration);
        // initialization of variables 
        lecturerName="";
        this.level=level;
        this.credit=credit;
        startingDate="";
        completionDate="";
        this.numberOfAssessments=numberOfAssessments;
        isRegistered=false; 
    }
    
    // public getter method for accessing private variables from any class
    public String getLectuterName()
    {
        return lecturerName;
    }
    
    public String getLevel()
    {
        return level;
    }
    
    public int getCredit()
    {
        return credit;
    }
    
    public String getStartingDate()
    {
        return startingDate;
    }
    
    public String getCompletionDate()
    {
        return completionDate;
    }
    
    public int getNumberOfAssessments()
    {
        return numberOfAssessments;
    }
    
    public boolean getIsRegistered()
    {
        return isRegistered;
    }
    
    // set value for private variable from outside the class
    public void setLecturerName(String lecturerName)
    {
        this.lecturerName=lecturerName;
    }
    
    public void setNumberOfAssessments(int numberOfAssessments)
    {
        this.numberOfAssessments=numberOfAssessments;
    }
    
    // register method to check if the course is registered or not
    public void register(String courseLeader, String lecturerName, String startingDate, String completionDate)
    {
        if(isRegistered == true){            
            System.out.println("The insturctor name is:" + lecturerName);
            System.out.println("The starting date is:" + startingDate);
            System.out.println("The completion date is:" + completionDate);
        }
        
        else{            
            this.lecturerName=lecturerName;
            this.startingDate=startingDate;
            this.completionDate=completionDate;
            super.setCourseLeader(courseLeader);
            isRegistered=true;
            courseRemovedStatus=false;
        }      
    }
    
    // dislay method to display values if registered
    public void display()
    {
        super.display();
        if(isRegistered == true){            
            System.out.println("The lecturer name is:" + lecturerName);
            System.out.println("The level is:" + level);
            System.out.println("The credit is:" + credit);
            System.out.println("The starting date is:" + startingDate);
            System.out.println("The completion date is:" + completionDate);
            System.out.println("The number of assessments are:" + numberOfAssessments);
        }
            
    }
}
