/*importing all the java tools to which helps to develop a GUI*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.font.*;
import java.util.ArrayList;

// INGCollege Class implements ActionListener 
public class INGCollege implements ActionListener
{
    //initialization of variables or GUI components
    JFrame frame;
    JPanel p1,p2;
    JLabel Title1, Title2, CourseID1, CourseName1, Duration1, level, credit, numberOfAssessment, CourseID2, lecturerName, courseLeader1, startingDate1, completionDate1, courseName2, duration2, prerequisite, instructorName, courseLeader2, startingDate2, completionDate2, examDate, Text, Text1;
    JTextField fieldID, fieldLeader, fieldDuration, fieldCredit, fieldStart, fieldCouName, fieldLecName, fieldLevel, fieldNum, fieldComplete, fieldID1, fieldLeader1, fieldDuration1, fieldStart1, fieldCouName1, fieldInstructor,fieldPrerequisite, fieldComplete1, fieldExam;
    JButton Add, Register, Display, Clear, NextPage, Add1, Register1, Display1, Clear1, Remove,PreviousPage;
    Font f1, f2, f3;  
    
    //Creating Arraylist
    ArrayList<Course>AL = new ArrayList<Course>();
    AcademicCourse AC;
    NonAcademicCourse NAC;
    
    //Defining constructor INGCollege
    public INGCollege()
    {
        //Assigning values to the initialized variables 
        frame = new JFrame("Course Registration");
        p1 = new JPanel();
        p2 = new JPanel();
        f1 = new Font(Font.SANS_SERIF,  Font.BOLD, 20);
        f2 = new Font(Font.SANS_SERIF,  Font.ITALIC, 15);
        f3 = new Font(Font.SANS_SERIF,  Font.ITALIC, 20);
        
        Title1 = new JLabel("ACADEMIC COURSE");
        CourseID1 = new JLabel("CourseID: ");
        CourseName1 = new JLabel("Course Name: ");
        courseLeader1 = new JLabel("Course Leader: ");
        lecturerName = new JLabel("Lecturer Name: ");
        Duration1 = new JLabel("Duration: ");        
        level = new JLabel("Level:");
        credit = new JLabel("Credit: ");
        startingDate1 = new JLabel("Starting Date: ");
        completionDate1 = new JLabel("Completion Date: ");
        numberOfAssessment = new JLabel("Number of asssessments: ");
        Text = new JLabel("If you want to to register Non-Academic Course: ");
        
        Title2 = new JLabel("NON-ACADEMIC COURSE"); 
        CourseID2 = new JLabel("CourseID: ");
        courseName2 = new JLabel("Course Name: ");
        duration2 = new JLabel("Duration: ");
        prerequisite = new JLabel("Prerequisite: ");
        instructorName = new JLabel("Instructor Name: ");
        courseLeader2 = new JLabel("Course Leader: ");
        startingDate2 = new JLabel("Starting Date: "); 
        completionDate2 = new JLabel("Completion Date: "); 
        examDate = new JLabel("Exam Date: ");
        Text1 = new JLabel("If you want to to register Academic Course: ");
        
        fieldID = new JTextField();
        fieldLeader = new JTextField();
        fieldDuration = new JTextField();
        fieldCredit = new JTextField();
        fieldStart = new JTextField();
        fieldCouName = new JTextField(); 
        fieldLecName = new JTextField();
        fieldLevel = new JTextField();
        fieldNum = new JTextField();
        fieldComplete = new JTextField();
        
        fieldID1 = new JTextField();
        fieldLeader1 = new JTextField();
        fieldDuration1 = new JTextField();
        fieldStart1 = new JTextField();
        fieldCouName1 = new JTextField();
        fieldInstructor = new JTextField();
        fieldPrerequisite = new JTextField();
        fieldComplete1 = new JTextField();
        fieldExam = new JTextField();
       
        Add = new JButton("Add");
        Register = new JButton("Register");
        Display = new JButton("Display");
        Clear = new JButton("Clear");
        NextPage = new JButton("Non-academic Course");
        
        Add1 = new JButton("Add");
        Register1 = new JButton("Register");
        Display1 = new JButton("Display");
        Clear1 = new JButton("Clear");
        Remove = new JButton("Remove");
        PreviousPage = new JButton("Academic Course");
        
        //Setting the bounds which is occupied by particular components in the frame
        Title1.setBounds(400,10,200,100);        
        CourseID1.setBounds(50,60,200,100);
        CourseName1.setBounds(500,60,200,100);
        courseLeader1.setBounds(50,120,200,100);
        lecturerName.setBounds(500,120,200,100);
        Duration1.setBounds(50,180,200,100);
        level.setBounds(500,180,200,100);
        credit.setBounds(50,240,200,100);
        numberOfAssessment.setBounds(500,240,200,100);
        startingDate1.setBounds(50,300,200,100);
        completionDate1.setBounds(500,300,200,100);
        Text.setBounds(200,460,500,100);
        
        Title2.setBounds(400,10,300,100);        
        CourseID2.setBounds(50,60,200,100);
        courseName2.setBounds(500,60,200,100);
        courseLeader2.setBounds(50,120,200,100);
        instructorName.setBounds(500,120,200,100);
        duration2.setBounds(50,180,200,100);
        prerequisite.setBounds(500,180,200,100);
        startingDate2.setBounds(50,240,200,100);
        completionDate2.setBounds(500,240,200,100);
        examDate.setBounds(350,300,200,100);
        Text1.setBounds(200,460,500,100);
        
        fieldID.setBounds(210,98,180,25);
        fieldLeader.setBounds(210,158,180,25);
        fieldDuration.setBounds(210,218,180,25);
        fieldCredit.setBounds(210,278,180,25);
        fieldStart.setBounds(210,338,180,25);
        fieldCouName.setBounds(720,98,180,25);
        fieldLecName.setBounds(720,158,180,25);
        fieldLevel.setBounds(720,218,180,25);
        fieldNum.setBounds(720,278,180,25);
        fieldComplete.setBounds(720,338,180,25);
        
        fieldID1.setBounds(210,98,180,25);
        fieldLeader1.setBounds(210,158,180,25);
        fieldDuration1.setBounds(210,218,180,25);
        fieldStart1.setBounds(210,278,180,25);
        fieldCouName1.setBounds(450,338,180,25);
        fieldInstructor.setBounds(720,98,180,25);
        fieldPrerequisite.setBounds(720,158,180,25);
        fieldComplete1.setBounds(720,218,180,25);
        fieldExam.setBounds(720,278,180,25);
        
        Add.setBounds(210,400,100,25);
        Register.setBounds(720,400,100,25);
        Display.setBounds(400,450,100,25);
        Clear.setBounds(520,450,100,25);
        NextPage.setBounds(650,500,200,25);
        
        Add1.setBounds(210,400,100,25);
        Register1.setBounds(720,400,100,25);
        Display1.setBounds(335,450,100,25);
        Clear1.setBounds(470,450,100,25);
        Remove.setBounds(600,450,100,25);
        PreviousPage.setBounds(650,500,200,25);
        
        //Unique Fonts are set to the components
        Title1.setFont(f1);
        CourseID1.setFont(f2);
        CourseName1.setFont(f2);
        courseLeader1.setFont(f2);
        lecturerName.setFont(f2);
        Duration1.setFont(f2);
        level.setFont(f2);
        credit.setFont(f2);
        startingDate1.setFont(f2);
        completionDate1.setFont(f2);
        numberOfAssessment.setFont(f2);
        NextPage.setFont(f2);
        Add.setFont(f2);
        Register.setFont(f2);
        Display.setFont(f2);
        Clear.setFont(f2);
        Text.setFont(f3);
        
        Title2.setFont(f1);
        CourseID2.setFont(f2);
        courseName2.setFont(f2);
        duration2.setFont(f2);
        prerequisite.setFont(f2);
        instructorName.setFont(f2);
        courseLeader2.setFont(f2);
        startingDate2.setFont(f2);
        completionDate2.setFont(f2);
        examDate.setFont(f2);
        PreviousPage.setFont(f2);
        Add1.setFont(f2);
        Register1.setFont(f2);
        Display1.setFont(f2);
        Clear1.setFont(f2);
        Remove.setFont(f2);
        Text1.setFont(f3);
            
        //adding components to the panel
        p1.add(Title1);
        p1.add(CourseID1);
        p1.add(CourseName1);
        p1.add(courseLeader1);
        p1.add(lecturerName);
        p1.add(Duration1);
        p1.add(level);
        p1.add(credit);
        p1.add(startingDate1);
        p1.add(completionDate1);
        p1.add(numberOfAssessment);
        p1.add(Text);
        p1.add(NextPage);
        p1.add(fieldID);
        p1.add(fieldLeader);
        p1.add(fieldDuration);
        p1.add(fieldCredit);
        p1.add(fieldStart);
        p1.add(fieldCouName);
        p1.add(fieldLecName);
        p1.add(fieldLevel);
        p1.add(fieldNum);
        p1.add(fieldComplete); 
        p1.add(Add);
        p1.add(Register);
        p1.add(Display);
        p1.add(Clear);
        
        p2.add(Title2);
        p2.add(CourseID2);
        p2.add(courseName2);
        p2.add(courseLeader2);
        p2.add(instructorName);
        p2.add(duration2);
        p2.add(prerequisite);
        p2.add(examDate);
        p2.add(startingDate2);
        p2.add(completionDate2);
        p2.add(Text1);
        p2.add(PreviousPage);
        p2.add(fieldID1);
        p2.add(fieldLeader1);
        p2.add(fieldDuration1);
        p2.add(fieldStart1);
        p2.add(fieldCouName1);
        p2.add(fieldInstructor);
        p2.add(fieldPrerequisite);
        p2.add(fieldComplete1);
        p2.add(fieldExam);
        p2.add(Add1);
        p2.add(Register1);
        p2.add(Display1);
        p2.add(Clear1);
        p2.add(Remove);
        
        //setting acction listener to the methods using this keyword
        Add.addActionListener(this);
        Add1.addActionListener(this);
        Register.addActionListener(this);
        Register1.addActionListener(this);
        Display.addActionListener(this);
        Display1.addActionListener(this);
        Remove.addActionListener(this);
        Clear.addActionListener(this);
        Clear1.addActionListener(this);
        NextPage.addActionListener(this);
        PreviousPage.addActionListener(this);       
        
        //panel has been addedd to the frame
        frame.add(p1);        
        p1.setLayout(null);
        frame.setVisible(true);
        frame.setSize(1000,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
        //Method actionperformed is created to add action to various when clicked
        public void actionPerformed(ActionEvent AP){
            //conditional statement for clear button
        if(AP.getSource()==Clear || AP.getSource()==Clear1 )
        {
            fieldID.setText("");
            fieldLeader.setText("");
            fieldDuration.setText("");
            fieldCredit.setText("");
            fieldStart.setText("");
            fieldCouName.setText("");
            fieldLecName.setText("");
            fieldLevel.setText("");
            fieldNum.setText("");
            fieldComplete.setText("");        
            fieldID1.setText("");
            fieldLeader1.setText("");
            fieldDuration1.setText("");
            fieldStart1.setText("");
            fieldCouName1.setText("");
            fieldInstructor.setText("");
            fieldPrerequisite.setText("");
            fieldComplete1.setText("");
            fieldExam.setText("");
            
        }
        
        if(AP.getSource()==Add)
        {
            String CourseID="";
            String CourseName="";
            int Duration = 0;
            String Level = "";
            int Credit = 0;
            int credit = Integer.valueOf(Credit);
            int NumberOfAssessments = 0;  
            try
            {
                CourseID = fieldID.getText();
                CourseName = fieldCouName.getText();
                Duration = Integer.parseInt(fieldDuration.getText());
                Level = fieldLevel.getText();
                credit = Integer.parseInt(fieldCredit.getText());
                NumberOfAssessments = Integer.parseInt(fieldNum.getText());
                boolean SameAC = false;
                for(Course C:AL)
                {
                    if (C.getCourseID().equals(CourseID))
                    {
                        SameAC = true;          
                    }
                }   
                if(SameAC==false)
                {
                    AC = new AcademicCourse(CourseID,CourseName,Duration,Level,credit,NumberOfAssessments);
                    AL.add(AC);
                    JOptionPane.showMessageDialog(frame,"The Academic Course has been added.");
                }
                else
                {
                    JOptionPane.showMessageDialog(frame,"The Academic Course has already been added.");
                }
            }
        
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(frame,"Please fill up the form properly !");
            }
        }
        else if (AP.getSource()==Add1)
        {            
            String CourseID = "";
            String CourseName = "";
            int Duration=0;
            String Prerequisite = "";
            try
            {
                CourseID = fieldID1.getText();
                CourseName = fieldCouName1.getText();
                Duration = Integer.parseInt(fieldDuration1.getText());
                Prerequisite = fieldPrerequisite.getText();  
                boolean SameNAC = false;
                for(Course C:AL)
                {
                    if(C.getCourseID().equals(CourseID))
                    {
                        SameNAC = true;    
                    }
                }
                if(SameNAC == false)
                {
                    NAC = new NonAcademicCourse(CourseID, CourseName, Duration, Prerequisite);
                    AL.add(NAC);
                    JOptionPane.showMessageDialog(frame,"The Non-Academic Course is added.");
                }
                else
                {
                    JOptionPane.showMessageDialog(frame,"The Non-Academic Course has already been added");
                }
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(frame,"Please fill up the form properly !");
            }
        }
         else if (AP.getSource()==Register)
        {
            String courseID = "";
            String CourseLeader = "";
            String LecturerName = "";
            String StartingDate = "";
            String CompletionDate = "";
            try
            {
                courseID = fieldID.getText();
                CourseLeader = fieldLeader.getText();
                LecturerName = fieldLecName.getText();
                StartingDate = fieldStart.getText();
                CompletionDate = fieldComplete.getText();
                boolean SameAC1 = false;
                for(Course CO:AL)
                {
                    if(CO.getCourseID().equals(courseID))
                    {
                        SameAC1 = true;
                        if (CO instanceof AcademicCourse)
                        {
                            AC = (AcademicCourse) CO;
                            if (AC.getIsRegistered()==true)
                            {
                                JOptionPane.showMessageDialog(frame,"Academic Course has already been registered.");
                            }
                            else
                            {
                                AC.register(CourseLeader, LecturerName, StartingDate, CompletionDate);
                                JOptionPane.showMessageDialog(frame,"The academic course has been registered.");                                
                            }
                        }
                    }
                    else
                    {
                       JOptionPane.showMessageDialog(frame,"The CourseID do not match.");
                       break;
                    }
                }
            }

            catch (Exception E)
            {
                JOptionPane.showMessageDialog(p1,"Please fill up the forms properly !");
            }
        }

        else if (AP.getSource()==Register1)
        {
            String courseID = "";
            String CourseLeader = "";
            String InstructorName = "";
            String StartingDate = "";
            String CompletionDate = "";
            String ExamDate = "";
            try
            {
                courseID = fieldID1.getText();
                CourseLeader = fieldLeader1.getText();
                InstructorName = fieldInstructor.getText();
                StartingDate = fieldStart1.getText();
                CompletionDate = fieldComplete1.getText();
                ExamDate = fieldExam.getText();
                boolean SameNAC1 = false;
                for(Course CO:AL)
                {
                    if(CO.getCourseID().equals(courseID))
                    {
                        SameNAC1 = true;
                        if (CO instanceof NonAcademicCourse)
                        {
                            NAC = (NonAcademicCourse) CO;
                            if (NAC.getIsRegistered()==true)
                            {
                                JOptionPane.showMessageDialog(frame,"Non-Academic Course has already been registered.");
                            }
                            else
                            {
                                NAC.register(CourseLeader, InstructorName, StartingDate, CompletionDate, ExamDate);
                                JOptionPane.showMessageDialog(frame,"The non-academic course has been registered.");   
                            }
                        }
                    }
                    else 
                    {
                        JOptionPane.showMessageDialog(frame,"The CourseID do not match.");
                        break;
                    }    
                }
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(frame,"Please fill up the form properly !");
            }
        }
        else if (AP.getSource()==Remove)
        {
            String CourseID = fieldID1.getText();
            try{
                for(Course C:AL){
                    if(C.getCourseID().equals(CourseID))
                    {
                        if(C instanceof NonAcademicCourse)
                        {
                            NAC=(NonAcademicCourse)C;
                            if(NAC.getIsRemoved()==false)
                            {
                                NAC.remove();
                                JOptionPane.showMessageDialog(frame,"The Course has been removed.");
                                
                            }
                            else if(NAC.getIsRemoved()==true)
                            {
                                JOptionPane.showMessageDialog(frame,"The Course has been already removed.");
                            }
                        }
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(frame,"Enter valid CourseID");
                        break;
                    }
                }
            }
            catch (Exception e)
            {
                JOptionPane.showMessageDialog(frame,"Please fill up the form properly !");
            }
        }
        //Event is added to the display butto, when clicked display method from Academic class is invoked
        else if (AP.getSource()==Display)
        {
            for(Course C1:AL)
            {
                if(C1 instanceof AcademicCourse)
                {
                    AcademicCourse AC = (AcademicCourse)C1;

                    AC.display();
                }
            }                         
        }
        //Event is added to the display button, when clicked display method from Non-Academic class is invoked
        else if (AP.getSource()==Display1)
        {
            for(Course C1:AL)
            {
                if(C1 instanceof NonAcademicCourse)
                {
                    NonAcademicCourse NAC = (NonAcademicCourse)C1;

                    NAC.display();
                }
            }
        }
        //conditonal statement to swtich pages in the frame
        if(AP.getSource()==NextPage)
        {
            p1.setVisible(false);
            p2.setVisible(true);
            frame.add(p2);
            p2.setLayout(null);
        } 
        else if (AP.getSource()==PreviousPage)
        {
            p2.setVisible(false);
            p1.setVisible(true);
        }

        
    }
    //main method 
    public static void main(String[]args)
    {
        new INGCollege();
    }

    
}