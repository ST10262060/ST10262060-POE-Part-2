/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poe;

import java.util.Scanner;

/**
 *
 * @author lab_services_student
 */
public class Login {
// Constant Declarations for Username
        final static int NUM_UNDERSCORE=1;
        final static String Underscore = "_";
    // Constant Declarations for Password
        final static int NUM_UPPERCASE=1;
        final static int NUM_DIGIT=1;
        final static int NUM_SPECIAL=1;    
        final static String SpecialChars = "`~!@#$%^&*()_-=+[]{}\"|,<.>/?';:'";
       
public static void main(String[] args) {
        //Other Declarations
        Scanner in = new Scanner(System.in);
//Username////////////////////////////////////////////////////////////////////////////////////       
    //Output username message to user        
        String message1 = """ 
               Please enter your username.\n
               Your username must contain an underscore and must not be more than 5 characters in length.
               """; //This is a text block because the string is very long (Wingerden, 2022)
        System.out.println(message1);
       //To input username
       String usernameInput =in.nextLine();  
       
    //Final username output messages
    if(checkUsername(usernameInput)){//This calls the boolean method for check username
          System.out.println("Username successfully captured");
       }
          else{ 
            System.out.println("Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length.");
                }

//Password///////////////////////////////////////////////////////////////////////////////////////
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
    if(checkPasswordComplexity(passwordInput)){//This calls the boolean method for checkpassword
          System.out.println("Password successfully captured");
       }
          else{ 
            System.out.println("Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a number and a special character.");
                }
//Registration message - while loop/////////////////////////////////////////////////////////
   registerUser(in);
//loginUser Boolean method
//Prompt user to enter username and password to login
    System.out.println("Please input username to login");
    String loginusernameInput =in.nextLine();
    System.out.println("Please input password to login");
    String loginpasswordInput =in.nextLine();

    boolean loginUser=true;
    if (loginUser==true){
    System.out.println("Welcome <user first name> ,<user last name> it is great to see you again.");
        }
    else{
        System.out.println("Username or password incorrect, please try again");
    }

//Login Status(loginUser Boolean is called inside of this method) ///////////////////////////////////////////////////////////
   returnLoginStatus();
}

//Method for Username - Boolean   
    public static boolean checkUsername(String username){
        //Declations for method
        int underscore=0;
        int x;
        //Check if length is no more than 5
        if(username.length()>5){
            return false;
        }
//Check for 1 under score
    for(x=0;x<username.length();x++){
            char ch = username.charAt(x);
            
            if (Underscore.indexOf(ch)!=-1){
               underscore++; 
            }
        }
//Are the requirements met
    return underscore ==NUM_UNDERSCORE;
}
        
//Method for Password - Boolean   
    public static boolean checkPasswordComplexity(String password){
        //Delcarations for method
        int uppercase=0;
        int digit=0;
        int special=0; 
        int i;
        //Check if length is 8 or more
        if(password.length () <8){
            return false;
        }
        //Check each character for if it is an uppercse, a digit, or a special character
        for(i=0;i<password.length();i++){
            char ch = password.charAt(i);
            
            if (Character.isUpperCase(ch)){
                uppercase++;
            }
            else if (Character.isDigit(ch)){
                digit++;
            }
            else if (SpecialChars.indexOf(ch) !=-1){ //whatever is inside the while's braces ({}) will be executed over and over again
                special++;
            }
        }
    //Are the requirements met
    return uppercase >=NUM_UPPERCASE && digit>=NUM_DIGIT && special>=NUM_SPECIAL;
    }

//Method for register user - String
public static String registerUser(Scanner in){
//Declarations for method
String usernameInput = "";
String passwordInput = ""; 


    //Prompting user with wile loop
    while(true){
            if (checkUsername(usernameInput)){
                System.out.println("Username successfully captured");
                    break; // This breaks out of the loop if username input is valid
                    }
          else{ 
            System.out.println("Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length.");
                return null;}
               }

    while(true){
        
            if (checkPasswordComplexity(passwordInput)){
                System.out.println("Password successfully captured");
                    break; // This breaks out of the loop if username input is valid
            }
          else{ 
            System.out.println("Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a number and a special character.");
                return null;}
    }
     
return null;}

//Method for loginUser - Boolean
    public static boolean loginUser(String loginUsername,String loginPassword, Scanner in){
        //Declarations for method
       String username="";
       String password="";
    
    
     while ((loginUsername.equals(username)) && (loginPassword.equals(password))){
            return true;
                    }
               return false;
    }

//Method for returnLoginStatus - String
    public static String returnLoginStatus(){ 
        String loginUsername="";
        String loginPassword="";
        String username="";
       String password="";
    if ((loginUsername.equals(username)) && (loginPassword.equals(password))){
       System.out.println("Login was successful"); 
    }   
    else{
        System.out.println("Login failed");
    }
       
    return null;}
}


/*References:
Wingerden, M. v., 2022. Java Text Blocks. [Online] 
Available at: https://www.baeldung.com/java-text-blocks
[Accessed 15 April 2023].
*/


