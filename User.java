package org.sample.COMPX341_A3;

public class User 
{
    private UserType userType;

    //Sets our user to the inputted user type in the usertest class
    public void setUserType(int userTypeValue) 
    {
    	//if its not any of these, we consider it invalid
        if (userTypeValue != UserType.encostUnverified.getValue() &&
        	userTypeValue != UserType.encostVerified.getValue() &&
        	userTypeValue != UserType.community.getValue()) {
            throw new IllegalArgumentException("Invalid user type.");
        }
        //otherwise, set our user for our feature access
        userType.setValue(userTypeValue);
    }

    //Used to reference and get our usertype, returns our type
    public UserType getUserType() {
        return userType;
    }
}
