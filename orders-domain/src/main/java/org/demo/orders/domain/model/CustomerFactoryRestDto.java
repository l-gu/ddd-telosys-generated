/*
 * Generated by Telosys ( https://www.telosys.org/ )
 * 2022-04-12 (15:13:48)
 */
package org.demo.orders.domain.model;

import java.util.ArrayList;
import java.util.List;
import org.demo.orders.rest.dto.CustomerRestDto;
import org.demo.orders.rest.dto.CustomerAddressRestDto;
/**
 * Domain factory for aggregate "Customer" 
 * based on REST DTO input
 *
 * @author Telosys
 */
//-----------------------------------
// referencesInDepth : 
// - CustomerAddress : 
//    . toOne  : true 
//    . toMany : false 
public final class CustomerFactoryRestDto {

	/**
	 * Create a new instance of "Customer" from "Data Transfer Object"
	 * @param dto the DTO 
	 * @return created instance
	 */

	public static Customer createCustomer(CustomerRestDto dto) {
		if (dto == null) {
			throw new IllegalArgumentException("CustomerRestDto is null");
		}
//		Customer customer = new Customer(
		return new Customer(
			dto.getId(),
			dto.getFirstName(),
			dto.getLastName(),
			createCustomerAddress(dto.getAddress())
			);	
//		return customer;
	}
	private static CustomerAddress createCustomerAddress(CustomerAddressRestDto dto) {
		if (dto == null) {
			throw new IllegalArgumentException("CustomerAddressRestDto is null");
		}
//		CustomerAddress customerAddress = new CustomerAddress(
		return new CustomerAddress(
			dto.getId(),
			dto.getStreet(),
			dto.getComplement(),
			dto.getZipCode(),
			dto.getCity(),
			dto.getState(),
			dto.getCustomerId()
			);	
//		return customerAddress;
	}
}
