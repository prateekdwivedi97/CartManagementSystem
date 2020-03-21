package com.capg.exception;

import java.util.InputMismatchException;

public class ProductIdTypeMismatchException extends InputMismatchException
{
	   public String errorMessage()
	   {
	      return "You did not enter a Integer value for the PRODUCT-ID. Please try again!";
	   }
}
