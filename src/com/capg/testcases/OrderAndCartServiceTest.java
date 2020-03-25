package com.capg.testcases;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import com.capg.service.OrderAndCartServiceImpl;
import com.capg.exception.*;
import com.capg.dto.CartDto;
public class OrderAndCartServiceTest {
OrderAndCartServiceImpl oacsi;
CartDto d=new CartDto();

	@Before
	public void setUp() throws Exception {
		oacsi=new OrderAndCartServiceImpl();
		
	}

	@Test(expected = UserNonExistentException.class)
	public void test() throws UserNonExistentException, ProductIdTypeMismatchException, InvalidProductIdException {
		d.setUserId("Dheeru");
		d.setProductId(1);
		d.setQuantity(4);
		System.out.print("Test Case 1: ");
		oacsi.addItemToCart(d);
		
	}
	
	@Test(expected = InvalidProductIdException.class)
	public void test1() throws  InvalidProductIdException, ProductIdTypeMismatchException, UserNonExistentException {
		d.setUserId("Ram");
		d.setProductId(11);
		d.setQuantity(4);
		System.out.print("Test Case 2: ");
		oacsi.addItemToCart(d);
		
	}
	@Test(expected = QuantityNotInStockException.class)
	public void test2() throws  InvalidProductIdException, ProductIdTypeMismatchException, UserNonExistentException,QuantityNotInStockException {
		d.setUserId("Ram");
		d.setProductId(1);
		d.setQuantity(6);
		System.out.print("Test Case 3: ");
		oacsi.addItemToCart(d);
		
	}
	
	@After
	public void cleanUp() {
	 oacsi=null;	
	}

	

}
