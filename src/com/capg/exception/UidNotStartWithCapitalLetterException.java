
package com.capg.exception;
public class UidNotStartWithCapitalLetterException  extends Exception{
	public String errorMessage()
	{
	 return "USER ID not starts with capital letter. Please try again!";
    }
}
