package com.capg.testcases;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import com.capg.dao.OrderAndCartDaoImpl;
import com.capg.exception.*;
import com.capg.dto.CartDto;
public class OrderAndCartDaoTest {
OrderAndCartDaoImpl oacdi;
CartDto d=new CartDto();

	@Before
	public void setUp() throws Exception {
		oacdi=new OrderAndCartDaoImpl();
		
	}

	@Test(expected = UserNonExistentException.class)
	public void test() throws UserNonExistentException, ProductIdTypeMismatchException, InvalidProductIdException,UidNotStartWithCapitalLetterException {
		d.setUserId("Dheeru");
		d.setProductId(1);
		d.setQuantity(4);
		System.out.print("Test Case 1: ");
		oacdi.addItemToCart(d);
		
	}
	
	@Test(expected = InvalidProductIdException.class)
	public void test1() throws  InvalidProductIdException, ProductIdTypeMismatchException, UserNonExistentException,UidNotStartWithCapitalLetterException{
		d.setUserId("Ram");
		d.setProductId(11);
		d.setQuantity(4);
		System.out.print("Test Case 2: ");
		oacdi.addItemToCart(d);
		
	}
	@Test(expected = QuantityNotInStockException.class)
	public void test2() throws  InvalidProductIdException, ProductIdTypeMismatchException, UserNonExistentException,QuantityNotInStockException,UidNotStartWithCapitalLetterException{
		d.setUserId("Ram");
		d.setProductId(1);
		d.setQuantity(6);
		System.out.print("Test Case 3: ");
		oacdi.addItemToCart(d);
		
	}
	
	@Test
	public void test3() throws  InvalidProductIdException, ProductIdTypeMismatchException, UserNonExistentException,QuantityNotInStockException,UidNotStartWithCapitalLetterException {
		d.setUserId("Ram");
		d.setProductId(1);
		d.setQuantity(4);
		System.out.print("Test Case 4: ");
		oacdi.addItemToCart(d);
		
	}

}