package com.capg.dao; 
import java.io.*;
import java.util.*;

import com.capg.dto.CartDto;
import com.capg.exception.InvalidProductIdException;
import com.capg.exception.ProductIdTypeMismatchException;
import com.capg.exception.QuantityNotInStockException;
import com.capg.exception.UserNonExistentException;
import com.capg.main.*;
import com.capg.repository.*;
import com.capg.service.*;

public class OrderAndCartDaoImpl implements OrderAndCartDao{
	public OrderAndCartDaoImpl()
	{
		
	}
	UserRepository ur1=new UserRepository();
	ProductRepository pr1=new ProductRepository();
	@Override
	public boolean addItemToCart(CartDto cartdto) throws UserNonExistentException,ProductIdTypeMismatchException, InvalidProductIdException,QuantityNotInStockException {
	
		// TODO Auto-generated method stub
		
	    try {
	    	System.out.println((ur1.CheckIfPresent(cartdto.getUserId())));
	    	System.out.println((pr1.CheckIfPresent(cartdto.getProductId(),cartdto)));
			return ((ur1.CheckIfPresent(cartdto.getUserId())) && (pr1.CheckIfPresent(cartdto.getProductId(),cartdto)));
		} catch (UserNonExistentException e) {
			throw e;
		}
	    catch(ProductIdTypeMismatchException e1) {
	    	throw e1;
	    }catch(InvalidProductIdException e2) {
	    	throw e2;
	    }catch(QuantityNotInStockException e3)
	    {
	    	throw e3;
	    }
	    
	}
}
