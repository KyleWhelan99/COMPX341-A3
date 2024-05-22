package org.sample.COMPX341_A3;

import java.util.Scanner;

public class LoginService {

    
	//Displays a message to the end user, asking them to submit their username and password
    public void promptLogin() 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter username and password separated by delimiter:");
        
        //Gets the users input
        String input = scanner.nextLine();
        
        //Splits it based on our delimiter
        String[] credentials = input.split("[,\\s|]");
        
        //If its in the correct format, sends it off to make sure the data is correct
        if (credentials.length == 2) 
        {
            String username = credentials[0];
            String password = credentials[1];
            
            //Auths our user
            authenticateUser(username, password);
        } 
        //Lets the end user know they've made an issue inputting their login
        else 
        {
            System.out.println("Invalid input format. Please provide both username and password.");
        }
        scanner.close();
    }

    
    
    //Auths our user based on the provided uname and pass in the previous method, right now its assumed its authenticated by default
    public boolean authenticateUser(String username, String password) 
    {
    	//Sets it to automatically be authenticated as long as we have a uname
        boolean isAuthenticated = !username.isEmpty();
        
        //Lets the user know it was successfull and they've logged in
        if (isAuthenticated) 
        {
            System.out.println("Authentication successful. Proceeding to authenticate user: " + username);
        } 
        //Otherwise tells them it failed
        else 
        {
            System.out.println("Authentication failed. Invalid username or password.");
        }
        return isAuthenticated;
    }
}

