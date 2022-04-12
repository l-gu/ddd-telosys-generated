/*
 * Generated by Telosys ( https://www.telosys.org/ )
 * 2022-04-12 (15:11:35)
 */
package org.demo.orders.domain.model;

import java.math.BigDecimal;
import org.demo.orders.domain.common.AggregateRoot;

/**
 * Domain parent abstract class for entity "Product"
 *
 * @author Telosys
 *
 */
public abstract class ProductParent extends AggregateRoot {

	private String code;
	private String name;
	private String description;
	private BigDecimal unitPrice;
	private Boolean inStock;
	private Boolean activeForSale;
	private Short categoryId;
	private Short catalogYear;
	private Short catalogQuarter;

    private Category category ;
	/**
	 * No default constructor 
	 * Default constructor is forbidden (explicitly private)
	 */
	private ProductParent() {
	}

	/**
	 * Constructor 
	 * @param code
	 * @param name
	 * @param description
	 * @param unitPrice
	 * @param inStock
	 * @param activeForSale
	 * @param categoryId
	 * @param catalogYear
	 * @param catalogQuarter
	 * @param category
	 */
	ProductParent(
                String code,
                String name,
                String description,
                BigDecimal unitPrice,
                Boolean inStock,
                Boolean activeForSale,
                Short categoryId,
                Short catalogYear,
                Short catalogQuarter,
                Category category
                ) {
		this.code = code;
		this.name = name;
		this.description = description;
		this.unitPrice = unitPrice;
		this.inStock = inStock;
		this.activeForSale = activeForSale;
		this.categoryId = categoryId;
		this.catalogYear = catalogYear;
		this.catalogQuarter = catalogQuarter;
        this.category = category;
	}

    /**
     * Get the "code" attribute value
     * @return the attribute value
     */
	public String getCode() {
        return this.code;
    }

    /**
     * Get the "name" attribute value
     * @return the attribute value
     */
	public String getName() {
        return this.name;
    }

    /**
     * Get the "description" attribute value
     * @return the attribute value
     */
	public String getDescription() {
        return this.description;
    }

    /**
     * Get the "unitPrice" attribute value
     * @return the attribute value
     */
	public BigDecimal getUnitPrice() {
        return this.unitPrice;
    }

    /**
     * Get the "inStock" attribute value
     * @return the attribute value
     */
	public Boolean getInStock() {
        return this.inStock;
    }

    /**
     * Get the "activeForSale" attribute value
     * @return the attribute value
     */
	public Boolean getActiveForSale() {
        return this.activeForSale;
    }

    /**
     * Get the "categoryId" attribute value
     * @return the attribute value
     */
	public Short getCategoryId() {
        return this.categoryId;
    }

    /**
     * Get the "catalogYear" attribute value
     * @return the attribute value
     */
	public Short getCatalogYear() {
        return this.catalogYear;
    }

    /**
     * Get the "catalogQuarter" attribute value
     * @return the attribute value
     */
	public Short getCatalogQuarter() {
        return this.catalogQuarter;
    }


	/**
     * Get the "category" 
     * @return
     */
    public Category getCategory() {
        return this.category;
    } 

	@Override
    public String toString() { 
        StringBuilder sb = new StringBuilder(); 
        sb.append(code);
        sb.append("|");
        sb.append(name);
        sb.append("|");
        sb.append(description);
        sb.append("|");
        sb.append(unitPrice);
        sb.append("|");
        sb.append(inStock);
        sb.append("|");
        sb.append(activeForSale);
        sb.append("|");
        sb.append(categoryId);
        sb.append("|");
        sb.append(catalogYear);
        sb.append("|");
        sb.append(catalogQuarter);
        return sb.toString(); 
    } 

}
