/*
 * Generated by Telosys ( https://www.telosys.org/ )
 * 2022-04-12 (15:15:28)
 */
package org.demo.orders.application.mapper;

import java.util.List; 
import org.mapstruct.Mapper;

import org.demo.orders.domain.model.CustomerAddress;
import org.demo.orders.rest.dto.CustomerAddressRestDto;
/**
 * Mapper for entity "CustomerAddress" 
 * Conversion from domain object to DTO 
 * 
 * @author Telosys
 */
@Mapper(componentModel = "spring")
public interface CustomerAddressMapper {

	/**
	 * Converts the given domain object to DTO
	 * @param customerAddress object to convert
	 * @return
	 */	
	public CustomerAddressRestDto toDTO(CustomerAddress customerAddress);
	
	/**
	 * Converts the given domain list to DTO list
	 * @param customerAddressList list to convert
	 * @return
	 */	
	public List<CustomerAddressRestDto> toDTOList(List<CustomerAddress> customerAddressList);

}

