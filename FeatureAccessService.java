package org.sample.COMPX341_A3;

import java.util.Scanner;

public class FeatureAccessService 
{

	//This method handles displaying our features to the end user, making sure the right users, get the right options
    public void displayFeatureOptions(User user) 
    {
        switch (user.getUserType()) 
        {
            case community:
                System.out.println("1. Graph Visualization");
                break;
            case encostVerified:
                System.out.println("1. Graph Visualization");
                System.out.println("2. Upload Custom Dataset");
                System.out.println("3. View Summary Statistics");
                break;
            case encostUnverified:
                System.out.println("1. Graph Visualization");
                break;
        }

        //Reads the users input
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        //Prints out a message to the screen, verifiying the users input, doesn't currently display anything to the screen
        switch (user.getUserType()) 
        {
            case community:
                if ("1".equals(input)) 
                {
                    System.out.println("graph visualisation option message");
                } 
                else 
                {
                    System.out.println("invalid");
                }
                break;
            case encostVerified:
                if ("1".equals(input)) 
                {
                    System.out.println("graph visualisation option message");
                } 
                else if ("2".equals(input)) 
                {
                    System.out.println("custom dataset option message");
                } 
                else if ("3".equals(input)) 
                {
                    System.out.println("summary statistics option message");
                } 
                else 
                {
                    System.out.println("invalid");
                }
                break;
            case encostUnverified:
                if ("1".equals(input)) 
                {
                    System.out.println("graph visualisation option message");
                } 
                else 
                {
                    System.out.println("invalid");
                }
                break;
        }
    }
}

