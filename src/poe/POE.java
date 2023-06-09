package poe;
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.lang.Object;
//import java.lang.Integer;

public class POE {
public static void main(String[] args) {
    Login myLogin = new Login();
    Tasks myTasks = new Tasks();
        //Other Declarations
        Scanner in = new Scanner(System.in);
//Username//       
    //Output username message to user        
        String message1 = """ 
               Please enter your username.\n
               Your username must contain an underscore and must not be more than 5 characters in length.
               """; //This is a text block because the string is very long (Wingerden, 2022)
        System.out.println(message1);
       //To input username
       String usernameInput =in.nextLine();  
       
    //Final username output messages
    if(myLogin.checkUsername(usernameInput)){//This calls the boolean method for check username
          System.out.println("Username successfully captured");
       }
          else{ 
            System.out.println("Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length.");
                }

//Password//
    //Output password message to user        
        String message2 = """ 
               Please enter your password.\n
               The password must meet the following criteria:\n
               1. Must be at least 8 characters long\n
               2. Must include a upper case letter.\n
               3. Must include a digit.\n
               4. Must include a special characters
               """; //This is a text block because the string is very long (Wingerden, 2022)
        System.out.println(message2);
       //To input password
       String passwordInput =in.nextLine();  
       
    //Final password output messages
    if(myLogin.checkPasswordComplexity(passwordInput)){//This calls the boolean method for checkpassword
          System.out.println("Password successfully captured");
       }
          else{ 
            System.out.println("Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a number and a special character.");
                }
//Registration message - while loop//
   myLogin.registerUser();

//Prompt user to enter username and password to login
    in.nextLine();
     String loginusernameInput="",loginpasswordInput="";
    System.out.println("Please input username to login");
    loginusernameInput = in.nextLine();
    System.out.println("Please input password to login");
    loginpasswordInput =in.nextLine();

    boolean loginUser=true;
    if (loginUser==true){
    //Login Status(loginUser Boolean is called inside of this method)
    myLogin.returnLoginStatus();
    System.out.println("Welcome <user first name> ,<user last name> it is great to see you again.");

//JOptionPane Welcome to EasyKanban message
        JOptionPane.showMessageDialog(null, "Welcome to EasyKanban");
//JOption select an option
        String input = "";
        String taskName="Add Login Feature";
        input = JOptionPane.showInputDialog(null,"Select one of the following options:\n1) Add tasks\n2) Show report\n3) Quit");//(McKenzie, 2022)(Farrell, 2019)
        
        if ("1".equals(input)){
            JOptionPane.showMessageDialog(null, "You have chosen to add a task");
            // The number of tasks 
            String numberOfTasks="";
            numberOfTasks = JOptionPane.showInputDialog(null,"How many tasks do you want to do?");
            myTasks.setNumberOfTasks(numberOfTasks);
            int numberOfTasksInt= Integer.parseInt(numberOfTasks);//(Jack, 2010)
            
            


//The name of the task to be performed is "Add Login Feature" - According to page 10 in the POE assignment
            
            JOptionPane.showMessageDialog(null, "The task name is "+taskName);
            myTasks.setTaskName(taskName);
 //Task Status    
            String taskStatus="";
                taskStatus = JOptionPane.showInputDialog(null,"Select and type out the task status:\nTo Do \nDone \nDoing");
                myTasks.setTaskStatus(taskStatus);
//Ask for Description and check if it is shorter than 50 characters 
            String taskDescription = JOptionPane.showInputDialog(null,"What is the description of the task? No more than 50 characters in length.");//(Farrell, 2019)
                if (myTasks.checkTaskDescription(taskDescription)) {
                JOptionPane.showMessageDialog(null, "Task successfully captured");
                myTasks.setTaskDescription(taskDescription);
                } 
                else {
                taskDescription = JOptionPane.showInputDialog(null,"Please enter a task description of less than 50 characters");
                        if (myTasks.checkTaskDescription(taskDescription)) {
                JOptionPane.showMessageDialog(null, "Task successfully captured");
                myTasks.setTaskDescription(taskDescription);
                }
                }

//Duration of the task    
            String taskDuration="";
            int taskDurationInt=0;
            taskDuration = JOptionPane.showInputDialog(null,"What is the task duration (in hours)?");
            myTasks.setTaskDuration(taskDuration);
            taskDurationInt= Integer.parseInt(taskDuration);//(Jack, 2010)
            
//The details of the devoloper assigned to the task
            String firstName = JOptionPane.showInputDialog(null,"What is the first name of the devoloper assigned to the task?");//(Farrell, 2019)
            myTasks.setFirstName(firstName);
            String lastName = JOptionPane.showInputDialog(null,"What is the last name of the devoloper assigned to the task?");//(Farrell, 2019)
            myTasks.setLastName(lastName);
            String developerDetails=(firstName +" "+ lastName);
            myTasks.setDeveloperDetails(developerDetails);
            
            
//Create the task ID
myTasks.createTaskID();         
            
//Print full details of Task
myTasks.printTaskDetails();
        }
        
                else if ("2".equals(input)){
            JOptionPane.showMessageDialog(null, "Coming Soon");
        }
        else if ("3".equals(input)){
            JOptionPane.showMessageDialog(null, "Exiting the program...");
                    System.exit(0);//(Detome, 2017)
        }
        else {
            JOptionPane.showMessageDialog(null, "Invalid choice. Try again.");
                    //myTasks.displayMenu();
        }                 
}    
    else{
        System.out.println("Username or password incorrect, please try again");
    }

}
}


/*References:
Detome, K., 2017. 63. JOptionPane: Terminate your program completely with System.exit() - Learn Java. [Online] 
Available at: https://www.youtube.com/watch?v=fo7aNsnv3GQ&t=1s
[Accessed 1 June 2023].
Farrell, J., 2019. Java Programming. Boston: Cengage.
Jack, 2010. JOptionPane Input to int. [Online] 
Available at: https://stackoverflow.com/questions/3120922/joptionpane-input-to-int
[Accessed 5 June 2023].
McKenzie, C., 2022. Java's JOptionPane showOptionDialog by Example. [Online] 
Available at: https://www.theserverside.com/blog/Coffee-Talk-Java-News-Stories-and-Opinions/Javas-JOptionPane-showOptionDialog-by-Example
[Accessed 1 June 2023].
Singh, C., 2023. Java String charAt() Method example. [Online] 
Available at: https://beginnersbook.com/2013/12/java-string-charat-method-example/
[Accessed 8 June 2023].
Vernon, C. L., 2018. How do I get the last character of a string?. [Online] 
Available at: https://stackoverflow.com/questions/5163785/how-do-i-get-the-last-character-of-a-string
[Accessed 8 June 2023].
Wingerden, M. v., 2022. Java Text Blocks. [Online] 
Available at: https://www.baeldung.com/java-text-blocks
[Accessed 15 April 2023].



*/


