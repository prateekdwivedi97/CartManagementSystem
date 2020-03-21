package com.capg.repository;
import java.util.HashMap;

import com.capg.dto.CartDto;
import com.capg.exception.InvalidProductIdException;
import com.capg.exception.ProductIdTypeMismatchException;
import com.capg.exception.QuantityNotInStockException;


public class ProductRepository {
	
	 HashMap<Integer,Integer> cartProd=new HashMap<Integer,Integer>();
	 
public void InitialiseProductRepository() {

	  cartProd.put(1,5);
	  cartProd.put(3,4);
	  cartProd.put(4,3);  
	  cartProd.put(5,4);
	  cartProd.put(7,5);
	  cartProd.put(8,3);
	  cartProd.put(10,4);
}

public boolean CheckIfPresent(int productId,CartDto d) throws ProductIdTypeMismatchException,InvalidProductIdException,QuantityNotInStockException
{ 
	boolean t=false;

	     if(((cartProd.containsKey(productId))==true) && d.getQuantity()<=cartProd.get(productId)) 
		 {
		 t=true;
	     }
	     else if(((cartProd.containsKey(productId))==false))
	     {
		 t=false;
		System.out.println("Product id is invalid!!Re-enter the data");
		throw new InvalidProductIdException();
	     }
	     else if(d.getQuantity()>cartProd.get(productId))
	     {
	    	 t=false;
	    	 System.out.println("Quantity demanded is not available in stock!!Re-enter the data");
	    	 throw new QuantityNotInStockException();
	     }
	     else
	     {
	    	 t=false;
	     }
		  return t;
}
      

   public ProductRepository() {
	   
	   InitialiseProductRepository();
   }


}

