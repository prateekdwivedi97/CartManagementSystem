package com.capg.repository;
import java.util.TreeSet;

import com.capg.dao.*;
import com.capg.exception.UserNonExistentException;
public class UserRepository {

	 TreeSet<String> cartUser=new TreeSet<String>();
	  
	  public void InitialiseUserRepository() {
		 
		  cartUser.add("Shyam");
		  cartUser.add("Ram");
		  cartUser.add("Chizu");
	  }
	 public boolean CheckIfPresent(String userId) throws UserNonExistentException
	 {
		 boolean t=false;
		if(cartUser.contains(userId)) {
			t=true;
		}else {
			System.out.println("Item cannot be added to the cart Reason:Incorrect USER-ID");
			t=false;
			throw new UserNonExistentException();
		}
		return t;
	 }
	 public UserRepository()
	 {
		 InitialiseUserRepository();
	 }
}
