package org.sample.COMPX341_A3;

public enum UserType 
{
	//All of our enum types, and their corrosponding int values
    community(2), encostVerified(1), encostUnverified(0);

	private final int value;

	//Our constructor to set the usertype value
    UserType(int value) 
    {
        this.value = value;
    }

    //Used to reference and get our usertype, returns our type
    public int getValue() 
    {
        return value;
    }
    
    //Used to set our user value in the usertest class
    public UserType setValue(int value) 
    {
        for (UserType type : UserType.values()) 
        {
            if (type.getValue() == value) 
            {
                return type;
            }
        }
        
        throw new IllegalArgumentException("Invalid UserType value: " + value);
    }
}
