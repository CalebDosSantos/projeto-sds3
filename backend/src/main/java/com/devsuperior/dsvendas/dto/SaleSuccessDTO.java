package com.devsuperior.dsvendas.dto;

import java.io.Serializable;

import com.devsuperior.dsvendas.entities.Seller;

public class SaleSuccessDTO implements Serializable{
  private static final long serialVersionUID = 1L;

  private String sellerName;
  private Long visited;
  private Long deals;

  public SaleSuccessDTO() {
  }

  public SaleSuccessDTO (Seller seller, Long visited, Long deals) {
    sellerName = seller.getName();
    this.visited = visited;
    this.deals = deals;
  }

  
  /**
   * Get visited.
   *
   * @return visited as Long.
   */
  public Long getVisited()
  {
      return visited;
  }
  
  /**
   * Set visited.
   *
   * @param visited the value to set.
   */
  public void setVisited(Long visited)
  {
      this.visited = visited;
  }
  
  /**
   * Get deals.
   *
   * @return deals as Long.
   */
  public Long getDeals()
  {
      return deals;
  }
  
  /**
   * Set deals.
   *
   * @param deals the value to set.
   */
  public void setDeals(Long deals)
  {
      this.deals = deals;
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
}
