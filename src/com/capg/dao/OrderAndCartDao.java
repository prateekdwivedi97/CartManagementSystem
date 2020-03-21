package com.capg.dao;

import com.capg.dto.CartDto;
import com.capg.exception.InvalidProductIdException;
import com.capg.exception.ProductIdTypeMismatchException;
import com.capg.exception.QuantityNotInStockException;
import com.capg.exception.UserNonExistentException;

public interface OrderAndCartDao {
 public boolean addItemToCart(CartDto cartdto) throws UserNonExistentException,InvalidProductIdException,QuantityNotInStockException;
}
