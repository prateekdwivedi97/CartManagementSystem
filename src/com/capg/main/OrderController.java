package com.capg.main;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

import com.capg.dto.CartDto;
import com.capg.exception.ProductIdTypeMismatchException;
import com.capg.exception.UidNotStartWithCapitalLetterException;
import com.capg.presentation.OrderAndCartPresentationImpl;
import com.capg.repository.UserRepository;
import com.capg.service.OrderAndCartService;
import com.capg.service.OrderAndCartServiceImpl;

public class OrderController {
	public static List<CartDto> cart;

	public static void main(String[] args) throws ProductIdTypeMismatchException,UidNotStartWithCapitalLetterException {
		String ch = "N";
		cart = new ArrayList<CartDto>();

		Scanner sc = new Scanner(System.in);

		UserRepository u = new UserRepository();

		System.out.println("Do you wish to add a product to your cart choose: Y or N");
		ch = sc.nextLine();

		while (ch.equals("Y")) {
			String uid = null;
			int pid = 0;

			System.out.println("Enter the User-Id");
			uid = sc.nextLine();
			if(uid.charAt(0)>=97 && uid.charAt(0)<=122)
			{
				UidNotStartWithCapitalLetterException ui = new UidNotStartWithCapitalLetterException();
				System.out.println(ui.errorMessage());
				System.exit(0);
			}

			try {
				System.out.println("Enter the Product-Id");
				pid = sc.nextInt();
			} catch (InputMismatchException e) {
				ProductIdTypeMismatchException p = new ProductIdTypeMismatchException();
				System.out.println(p.errorMessage());
				System.exit(0);
			}
			sc.nextLine();
			System.out.println("Enter the Quantity");
			int quant = sc.nextInt();

			sc.nextLine();

			if (uid.equals("")) {
				System.out.println("please enter the user id");
				if (pid == 0) {
					System.out.println("please enter the product id");
					break;
				}
				break;
			}

			if (quant <= 0) {
				System.out.println("enter a valid quantity");
				break;
			} else {
				CartDto cart1 = new CartDto(uid, pid, quant);
				cart1.setUserId(uid);
				cart1.setProductId(pid);
				cart1.setQuantity(quant);

				OrderAndCartPresentationImpl oacp = new OrderAndCartPresentationImpl();

				if (oacp.addItemToCart(cart1) == (true)) {

					System.out.println("item added to cart successfully");
					cart.add(cart1);
					System.out.println(cart1.getUserId() + " " + cart1.getProductId() + " " + cart1.getQuantity());
				} else {
					System.out.println("Try  re-entering the details ");
				}
				System.out.println("Do you want to see all the items in your cart:Y or N ");
				String t = sc.nextLine();
				if (t.equals("Y")) {
					for(CartDto c: cart) {
						if(c.getUserId().contentEquals(uid)){
						System.out.println(c.getUserId()+" "+c.getProductId()+" "+c.getQuantity());
						}
					}
				}
				System.out.println("Do you wish to add more products to your cart choose: Y or N");
				String ch1 = sc.nextLine();
				ch = ch1;

			}
		}
	}
}
