package com.capg.service;

import com.capg.dao.*;
import com.capg.dto.CartDto;
import com.capg.exception.InvalidProductIdException;
import com.capg.exception.ProductIdTypeMismatchException;
import com.capg.exception.QuantityNotInStockException;
import com.capg.exception.UserNonExistentException;

public class OrderAndCartServiceImpl implements OrderAndCartService {
 
	OrderAndCartDao dao=new OrderAndCartDaoImpl();
	public OrderAndCartServiceImpl()
	{		
	}
	
	@Override
	public boolean addItemToCart(CartDto cartDto) throws UserNonExistentException,ProductIdTypeMismatchException,InvalidProductIdException,QuantityNotInStockException {
		try {
		return dao.addItemToCart(cartDto);
		}catch(UserNonExistentException e) {
			throw e;
		}catch(ProductIdTypeMismatchException e1) {
			throw e1;
		}catch(InvalidProductIdException e2) {
	    	throw e2;
	    }catch(QuantityNotInStockException e3)
		{
	    	throw e3;
		}
			
	}
  }

