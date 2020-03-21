package com.capg.presentation;

import com.capg.dao.OrderAndCartDao;
import com.capg.dao.OrderAndCartDaoImpl;
import com.capg.dto.CartDto;
import com.capg.exception.InvalidProductIdException;
import com.capg.exception.ProductIdTypeMismatchException;
import com.capg.exception.QuantityNotInStockException;
import com.capg.exception.UserNonExistentException;
import com.capg.service.OrderAndCartService;
import com.capg.service.OrderAndCartServiceImpl;

public class OrderAndCartPresentationImpl implements OrderAndCartPresentation{
	OrderAndCartService oacs=new OrderAndCartServiceImpl();
	public OrderAndCartPresentationImpl()
	{		
	}
	public boolean addItemToCart(CartDto cartDto){
		
		try {
			return oacs.addItemToCart(cartDto);
		} catch (UserNonExistentException e) {
			
			System.out.println(e.errorMessage());
		} catch (InvalidProductIdException e) {
			// TODO Auto-generated catch block
			
			System.out.println(e.errorMessage());
		}catch(QuantityNotInStockException e)
		{
			
			System.out.println(e.errorMessage());
		}
		return false;
	}
	
}
