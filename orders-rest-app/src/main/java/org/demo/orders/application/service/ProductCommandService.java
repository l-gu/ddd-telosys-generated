/*
 * Generated by Telosys ( https://www.telosys.org/ )
 * 2022-04-12 (15:15:28)
 */

package org.demo.orders.application.service;

import org.demo.orders.rest.dto.ProductRestDto;

/**
 * Service for "COMMANDS" (database write operations)
 * Entity Product
 *
 * @author @{AUTHOR}
 */

public interface ProductCommandService {

	/**
	 * Insert a new Product 
	 * @param productRestDto Data Transfer Object
	 * @return created aggregate
	 */
	public ProductRestDto insertProduct(ProductRestDto productRestDto);

	/**
	 * Delete Product with the given id
	 * @param code id
	 */
	public void deleteProduct(String code);
	
	/**
	 * Save Product (update or create)
	 * @param code id
	 * @param productRestDto Data Transfer Object
	 * @return true if created (else false)
	 */
	public boolean saveProduct(String code, ProductRestDto productRestDto);

}
