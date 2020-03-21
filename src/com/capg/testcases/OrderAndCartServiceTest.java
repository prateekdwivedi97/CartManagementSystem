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
CartDto d1=new CartDto();
CartDto d2=new CartDto();
	@Before
	public void setUp() throws Exception {
		oacsi=new OrderAndCartServiceImpl();
		
	}

	@Test(expected = UserNonExistentException.class)
	public void test() throws UserNonExistentException, ProductIdTypeMismatchException, InvalidProductIdException {
		d.setUserId("Dheeru");
		d.setProductId(1);
		d.setQuantity(4);
		oacsi.addItemToCart(d);
		
	}
	
	@Test(expected = InvalidProductIdException.class)
	public void test1() throws  InvalidProductIdException, ProductIdTypeMismatchException, UserNonExistentException {
		d1.setUserId("Ram");
		d1.setProductId(11);
		d1.setQuantity(4);
		oacsi.addItemToCart(d1);
	}
	@Test(expected = QuantityNotInStockException.class)
	public void test2() throws  InvalidProductIdException, ProductIdTypeMismatchException, UserNonExistentException,QuantityNotInStockException {
		d2.setUserId("Ram");
		d2.setProductId(1);
		d2.setQuantity(6);
		oacsi.addItemToCart(d2);
	}
	@After
	public void cleanUp() {
	 oacsi=null;	
	}

	

}
