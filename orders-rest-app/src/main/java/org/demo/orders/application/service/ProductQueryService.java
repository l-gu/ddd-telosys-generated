/*
 * Generated by Telosys ( https://www.telosys.org/ )
 * 2022-04-12 (15:15:28)
 */

package org.demo.orders.application.service;

import java.util.List;

import org.demo.orders.rest.dto.response.ProductRestResponse;
//import org.demo.orders.domain.model.Product;
import org.demo.orders.rest.dto.ProductRestDto;

/**
 * Service for "QUERIES" (database read operations)
 * Entity Product
 *
 * @author Telosys
 */
public interface ProductQueryService {

	/**
	 * Get and return a Product instance for the given id
	 * @param code id
	 * @return entity found (or null if not found)
	 */
	public ProductRestDto getProduct(String code);
	
	/**
	 * Get a page of Product 
	 * @param page page number (from 1 to N)
	 * @param size page size
	 * @param sort
	 * @param order
	 * @return
	 */
	 public ProductRestResponse findProduct(Integer page, Integer size, String sort, String order);

}
