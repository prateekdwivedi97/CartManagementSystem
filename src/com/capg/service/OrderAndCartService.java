package com.capg.service;

import com.capg.dto.CartDto;
import com.capg.exception.InvalidProductIdException;
import com.capg.exception.ProductIdTypeMismatchException;
import com.capg.exception.QuantityNotInStockException;
import com.capg.exception.UserNonExistentException;
public interface OrderAndCartService {
 public boolean addItemToCart(CartDto cartDto) throws UserNonExistentException, InvalidProductIdException,QuantityNotInStockException;
}
