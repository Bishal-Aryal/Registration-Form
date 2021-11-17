public class NonAcademicCourse extends Course // inherit encapsulated variable from superclass named course
{
    private String instructorName;
    private String startDate;
    private String completionDate;
    private String examDate;
    private String prerequisite;
    private boolean isRegistered;
    private boolean isRemoved; 
    
    NonAcademicCourse(String courseID, String courseName, int courseDuration, String prerequisite) // parameterized constructor with formal parameters
    {
         super(courseID,courseName,courseDuration); // Callig variables from superclass course
         // initilazation
         this.prerequisite=prerequisite;
         startDate="";
         completionDate="";
         examDate="";
         isRegistered=false;
         isRemoved=false;       
    }
    
    // public getter method for accessing private variables from any class
    public String getInstructorName()
    {
        return instructorName;
        
    }
    
    public String getStartDate()
    {
        return startDate;
    }
    
    public String getCompletionDate()
    {
        return completionDate;
    }
    
    public String getExamDate()
    {
        return examDate;
    }
    
    public String getPrerequisite()
    {
        return prerequisite;
    }
    
    public boolean getIsRegistered()
    {
        return isRegistered;
    }
    
    public boolean getIsRemoved()
    {
        return isRemoved;
    }
    
    // setter method to set value for instructor name if the course has been registered
    public void setInstructorName(String instructorName)
    {        
        if(!isRegistered){
            this.instructorName=instructorName;
        }
        
        else{
            System.out.println("The name of instructor could not change because non-academic course already exist"); 
        }         
        
    }
    
    //set initial value of variable in superclass
    public void register(String courseLeader, String instructorName, String startDate, String completionDate, String examDate)
    {
        if(!isRegistered){
            setCourseLeader(courseLeader);
            setInstructorName(instructorName);
            this.startDate=startDate;
            this.completionDate=completionDate;
            this.examDate=examDate;
            isRegistered=true;            
        }
        else{
            System.out.println("The course has already been registered");
        }
    }
    
    // remove method for resetting values
    public void remove()
    {
        if(isRemoved == true){
            System.out.println("The course has already been removed");
        }
        else{
            super.setCourseLeader("");
            instructorName="";
            startDate="";
            completionDate="";
            examDate="";
            isRegistered=false;
            isRemoved=true;
        }
    }
       
    //display value if registered
    public void display()
    {
        super.display();
        if(isRegistered){
            System.out.println("The name of instructor is: "+instructorName);
            System.out.println("The Starting date is:"+startDate);
            System.out.println("The completion date is:"+completionDate);
            System.out.println("The exam date is:"+examDate);
        }
            
    }
}

