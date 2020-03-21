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
		if(cartUser.contains(userId)) {
			return true;
		}else {
			System.out.println("User id is invalid!!Re-enter the data");
			throw new UserNonExistentException();
		}
	 }
	 public UserRepository()
	 {
		 InitialiseUserRepository();
	 }
}
