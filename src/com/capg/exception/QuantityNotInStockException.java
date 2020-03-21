
package com.capg.exception;

import java.util.InputMismatchException;

public class QuantityNotInStockException extends InputMismatchException
{
	   public String errorMessage()
	   {
	      return "You did not enter a valid quantity for the selected PRODUCT-ID. Please try again!";
	   }
}