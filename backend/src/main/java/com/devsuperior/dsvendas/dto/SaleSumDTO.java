package com.devsuperior.dsvendas.dto;

import java.io.Serializable;

import com.devsuperior.dsvendas.entities.Seller;

public class SaleSumDTO implements Serializable{
  private static final long serialVersionUID = 1L;

  private String sellerName;
  private Double sum;

  public SaleSumDTO() {
  }

  public SaleSumDTO (Seller seller, Double sum) {
    this.sellerName = seller.getName();
    this.sum = sum;
  }

  
  /**
   * Get sellerName.
   *
   * @return sellerName as String.
   */
  public String getSellerName()
  {
      return sellerName;
  }
  
  /**
   * Set sellerName.
   *
   * @param sellerName the value to set.
   */
  public void setSellerName(String sellerName)
  {
      this.sellerName = sellerName;
  }
  
  /**
   * Get sum.
   *
   * @return sum as Double.
   */
  public Double getSum()
  {
      return sum;
  }
  
  /**
   * Set sum.
   *
   * @param sum the value to set.
   */
  public void setSum(Double sum)
  {
      this.sum = sum;
  }
}
