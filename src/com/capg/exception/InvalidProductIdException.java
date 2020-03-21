
package com.capg.exception;

import java.util.InputMismatchException;

public class InvalidProductIdException extends Exception
{
	   public String errorMessage()
	   {
	      return "You did not enter a valid value for the PRODUCT-ID. Please try again!";
	   }
}
