public class Course // class named course created
{ 
    //declaration of private variables for encapsulation
    private String courseID;
    private String courseName;    
    private int courseDuration;
    private String courseLeader;
  
    public Course(String courseID, String courseName, int courseDuration) // constructor having three parameters
    {
        // initial values are set
        this.courseID = courseID;
        this.courseName = courseName;
        this.courseDuration = courseDuration;
        courseLeader = "";
    }  
    
    // public getter method for accessing private variables in subclass
    public String getCourseID()
    {
        return courseID;
    }
    
    public String getCourseName()
    {
        return courseName;
    }
    
    public int getcourseDuration()
    {
        return courseDuration;
    }
    
    public String getCourseLeader()
    {
        
        return courseLeader;
    }
    
    // set value for private variable from outside the class
    public void setCourseLeader(String courseLeader)
    {
        
        this.courseLeader = courseLeader;
    }
    // method to display values
    public void display()
    {
        
        System.out.println("The course ID is:" + courseID);
        System.out.println("The course name is:" + courseName);
        System.out.println("The course courseDuration is:" + courseDuration + "yr(s)");  
        
        if(!courseLeader.isEmpty()){
                 
                System.out.println("The name of coure leader is:" + courseLeader);
        }
    }
}
