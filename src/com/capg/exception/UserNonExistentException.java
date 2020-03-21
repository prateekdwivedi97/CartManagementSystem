package com.capg.exception;
public class UserNonExistentException extends Exception{
	public String errorMessage()
	{
	 return "Not an existing USER ID. Please try again!";
    }
}
