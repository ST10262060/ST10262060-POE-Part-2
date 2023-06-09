package poe;
import javax.swing.JOptionPane;

public class Tasks {
    //Declarations
    private String taskName;
    private String taskNumber;
    private String numberOfTasks;
    private int numberOfTasksInt;
    private String taskDescription; 
    private String taskDuration;
    private int taskDurationInt;
    private String taskID;
    private String taskStatus;
    private String firstName;
    private String lastName;
    private String developerDetails;
    private int totalHours;
    private String firstTwo;
    private String lastThree;
    
    //Check if description does not exceed 50 characters
        public boolean checkTaskDescription(String taskDescription){
            return taskDescription.length() <= 50;
          }
    //set and get variables
        public void setTaskName(String taskName){
            this.taskName=taskName;
        }
        public String getTaskName(){
            return taskName;
        }
        public void setTaskStatus(String taskStatus){
            this.taskStatus=taskStatus;
        }
        public String getTaskStatus(){
            return taskStatus;
        }
        public void setFirstName(String firstName){
            this.firstName=firstName;
        }
        public String getFirstName(){
            return firstName;
        }
        public void setLastName(String lastName){
            this.lastName=lastName;
        }
        public String getLastName(){
            return lastName;
        }
        public void setDeveloperDetails(String developerDetails){
            this.developerDetails=developerDetails;
        }
        public String getDeveloperDetails(){
            return developerDetails;
        }
        public void setTaskDescription(String taskDescription){
            this.taskDescription=taskDescription;
        }
        public String getTaskDescription(){
            return taskDescription;
        }
        public void setTaskDuration(String taskDuration){
            this.taskDuration=taskDuration;
        }
        public String getTaskDuration(){
            return taskDuration;
        }
        public void setNumberOfTasks(String numberOfTasks){
            this.numberOfTasks=numberOfTasks;
        }
        public String getNumberOfTasks(){
            return numberOfTasks;
        }
        
    public String createTaskID(){
    //Print first 2 letters of task name:Print the Task number:Print the last 3 letters of deloper's name
    
	//This will return the first char of the string
	char ch1 = Character.toUpperCase(taskName.charAt(0));//(Singh, 2023)
		
	//This will return the 2nd char of the string
	char ch2 = Character.toUpperCase(taskName.charAt(1));//(Singh, 2023)
		
	
    //The last 3 letters of the last name of the developer
    //Display all caps
    String lastThree = lastName.toUpperCase();//(Vernon, 2018)
   
    //Task ID
    taskID=ch1+""+ch2 +":"+"taskNumber"+":"+lastThree.charAt(lastThree.length() - 3)+lastThree.charAt(lastThree.length() - 2)+lastThree.charAt(lastThree.length() - 1); //(Singh, 2023)(Vernon, 2018)
    //Display Task ID    
    JOptionPane.showMessageDialog(null, "Your Task ID is "+taskID);
        return taskID;
    }
    
    public String printTaskDetails(){
               
        JOptionPane.showMessageDialog(null, "Your Task details are:\nTask Status: "+taskStatus 
                +"\nDeveloper details: "+ developerDetails+"\nTask number:......."+"\nTask name: "+taskName
                +"\nTask description: "+taskDescription+"\nTask ID: "+taskID+"\nDuration: "+ taskDuration);
        return null;
    }
    
    public void returnTotalHours(){
        ///Add the duration of each task 
        totalHours=taskDurationInt;
        ////////////
    }
    
}