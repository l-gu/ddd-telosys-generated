/*
 * Generated by Telosys ( https://www.telosys.org/ )
 * 2022-04-12 (15:15:28)
 */

package org.demo.orders.application.service.impl;

import java.util.List;
import java.util.Optional;
import javax.inject.Inject;
import org.springframework.stereotype.Component;

import org.demo.orders.rest.dto.response.ProductRestResponse;
import org.demo.orders.domain.model.Product;
import org.demo.orders.domain.repository.ProductRepository;
import org.demo.orders.application.mapper.ProductMapper;
import org.demo.orders.rest.dto.ProductRestDto;
import org.demo.orders.application.service.ProductQueryService;

/**
 * Service for "QUERIES" (database read operations)
 * Entity Product
 *
 * @author Telosys
 */
@Component
public class ProductQueryServiceImpl implements ProductQueryService {

	@Inject
	private ProductRepository productRepository;
	
	@Inject
	private ProductMapper productMapper;

	/**
	 * Get and return a Product instance for the given id
	 * @param code id
	 * @return entity found (or null if not found)
	 */
 	@Override
	public ProductRestDto getProduct(String code) {
		Optional<Product> product = productRepository.findById(code);
		if (product.isPresent()) {
			return productMapper.toDTO(product.get());
		}
		else {
			return null;
		}
	}
	
	/**
	 * Get a page of Product 
	 * @param page page number (from 1 to N)
	 * @param size page size
	 * @param sort
	 * @param order
	 * @return
	 */
 	@Override
	public ProductRestResponse findProduct(Integer page, Integer size, String sort, String order) {

		// Find all in database
		List<Product> productList = productRepository.findAll(page-1, size, sort, order);

		// Count all in database
		long totalElements = productRepository.count();
		
		// Build API response object
		//return buildResponse(productList, totalElements, size);
		List<ProductRestDto> list = productMapper.toDTOList(productList);
		return new ProductRestResponse(list, totalElements, size);
	}

}
