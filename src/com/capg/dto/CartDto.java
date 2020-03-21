package com.capg.dto;

public class CartDto {
	private String userId;
	   private int productId;
	   private int quantity;
    public CartDto() {
    	
    }
	   public CartDto(String userId,int productId,int quantity){
	      this.userId = userId;
	      this.productId = productId;
	      this.quantity=quantity;
	   }   
	   public String getUserId() {
	      return userId;
	   }

	   public void setUserId(String userId) {
	      this.userId = userId;
	   }

	   public int getProductId() {
	      return productId;
	   }

	   public void setProductId(int productId) {
	      this.productId = productId;
	   }
	   
	   public int getQuantity() {
		      return quantity;
		   }

		   public void setQuantity(int quantity) {
		      this.quantity = quantity;
		   }

}
