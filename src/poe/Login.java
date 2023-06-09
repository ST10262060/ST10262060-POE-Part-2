package poe;

public class Login {
    // Constant Declarations for Username
        final static int NUM_UNDERSCORE=1;
        final static String UNDERSCORE = "_";
    // Constant Declarations for Password
        final static int NUM_UPPERCASE=1;
        final static int NUM_DIGIT=1;
        final static int NUM_SPECIAL=1;    
        final static String SPECIAL_CHARS = "`~!@#$%^&*()_-=+[]{}\"|,<.>/?';:'";
       


//Method for Username - Boolean   
    public boolean checkUsername(String username){
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
            
            if (UNDERSCORE.indexOf(ch)!=-1){
               underscore++; 
            }
        }
//Are the requirements met
    return underscore ==NUM_UNDERSCORE;
}
        
//Method for Password - Boolean   
    public boolean checkPasswordComplexity(String password){
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
            else if (SPECIAL_CHARS.indexOf(ch) !=-1){ //whatever is inside the while's braces ({}) will be executed over and over again
                special++;
            }
        }
    //Are the requirements met
    return uppercase >=NUM_UPPERCASE && digit>=NUM_DIGIT && special>=NUM_SPECIAL;
    }

//Method for register user - String
public String registerUser(){
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
    public boolean loginUser(String loginUsername,String loginPassword){
        //Declarations for method
       String username="";
       String password="";
    
    
     while ((loginUsername.equals(username)) && (loginPassword.equals(password))){
            return true;
                    }
               return false;
    }

//Method for returnLoginStatus - String
    public String returnLoginStatus(){ 
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
