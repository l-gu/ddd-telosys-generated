/*
 * Generated by Telosys ( https://www.telosys.org/ )
 * 2022-04-12 (15:13:48)
 */
package org.demo.orders.domain.model;

import org.demo.orders.rest.dto.CatalogRestDto;
/**
 * Domain factory for aggregate "Catalog" 
 * based on REST DTO input
 *
 * @author Telosys
 */
//-----------------------------------
// referencesInDepth : 
public final class CatalogFactoryRestDto {

	/**
	 * Create a new instance of "Catalog" from "Data Transfer Object"
	 * @param dto the DTO 
	 * @return created instance
	 */

	public static Catalog createCatalog(CatalogRestDto dto) {
		if (dto == null) {
			throw new IllegalArgumentException("CatalogRestDto is null");
		}
//		Catalog catalog = new Catalog(
		return new Catalog(
			dto.getYear(),
			dto.getQuarter(),
			dto.getTitle()
			);	
//		return catalog;
	}
}