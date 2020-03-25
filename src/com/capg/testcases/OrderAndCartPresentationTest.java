package com.capg.testcases;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import com.capg.presentation.OrderAndCartPresentationImpl;
import com.capg.dto.CartDto;
import com.capg.exception.*;

public class OrderAndCartPresentationTest {
	OrderAndCartPresentationImpl oacpti;
	CartDto d=new CartDto();
	
	@Before
	public void setUp() throws Exception {
		oacpti=new OrderAndCartPresentationImpl();
	}

	@Test
	public void test() {
		d.setUserId("Veeru");
		d.setProductId(1);
		d.setQuantity(4);
		System.out.print("Test Case 1: ");
		 oacpti.addItemToCart(d);
		System.out.println();
	}
 
	@Test
	public void test1() {
		d.setUserId("Ram");
		d.setProductId(17);
		d.setQuantity(4);
		System.out.print("Test Case 2: ");
		 oacpti.addItemToCart(d);
		 System.out.println();
	}
	
	@Test
	public void test2() {
		d.setUserId("Ram");
		d.setProductId(1);
		d.setQuantity(8);
		System.out.print("Test Case 3: ");
		oacpti.addItemToCart(d);
		System.out.println();
	}
	
	@Test
	public void test3() {
		d.setUserId("Ram");
		d.setProductId(1);
		d.setQuantity(4);
		System.out.print("Test Case 4: ");
		oacpti.addItemToCart(d);
		System.out.println();
	}
	@Test
	public void test4()  {
		d.setUserId("ram");
		d.setProductId(1);
		d.setQuantity(4);
		System.out.print("Test Case 5: ");
		oacpti.addItemToCart(d);
		
	}
	
	@After
	public void tearDown() throws Exception {
		oacpti=null;
	}
}
