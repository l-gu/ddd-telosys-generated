/*
 * Generated by Telosys ( https://www.telosys.org/ )
 * 2022-04-12 (15:13:48)
 */
package org.demo.orders.rest.dto;

import java.io.Serializable;


/**
 * REST DTO for entity "CustomerAddress"
 * 
 * @author Telosys
 *
 */
public class CustomerAddressRestDto implements Serializable
{
    private static final long serialVersionUID = 1L;

    private int id; // ID
    private String street; 
    private String complement; 
    private String zipCode; 
    private String city; 
    private String state; 
    private Integer customerId; 


    /**
     * Default constructor
     */
    public CustomerAddressRestDto() {
        super();
    }
    
    /**
     * Set the "id" field value
     * @param id
     */
	public void setId( int id ) {
        this.id = id ;
    }
    /**
     * Get the "id" field value
     * @return the field value
     */
	public int getId() {
        return this.id;
    }

    /**
     * Set the "street" field value
     * @param street
     */
	public void setStreet( String street ) {
        this.street = street ;
    }
    /**
     * Get the "street" field value
     * @return the field value
     */
	public String getStreet() {
        return this.street;
    }

    /**
     * Set the "complement" field value
     * @param complement
     */
	public void setComplement( String complement ) {
        this.complement = complement ;
    }
    /**
     * Get the "complement" field value
     * @return the field value
     */
	public String getComplement() {
        return this.complement;
    }

    /**
     * Set the "zipCode" field value
     * @param zipCode
     */
	public void setZipCode( String zipCode ) {
        this.zipCode = zipCode ;
    }
    /**
     * Get the "zipCode" field value
     * @return the field value
     */
	public String getZipCode() {
        return this.zipCode;
    }

    /**
     * Set the "city" field value
     * @param city
     */
	public void setCity( String city ) {
        this.city = city ;
    }
    /**
     * Get the "city" field value
     * @return the field value
     */
	public String getCity() {
        return this.city;
    }

    /**
     * Set the "state" field value
     * @param state
     */
	public void setState( String state ) {
        this.state = state ;
    }
    /**
     * Get the "state" field value
     * @return the field value
     */
	public String getState() {
        return this.state;
    }

    /**
     * Set the "customerId" field value
     * @param customerId
     */
	public void setCustomerId( Integer customerId ) {
        this.customerId = customerId ;
    }
    /**
     * Get the "customerId" field value
     * @return the field value
     */
	public Integer getCustomerId() {
        return this.customerId;
    }



    @Override
    public String toString() { 
        StringBuilder sb = new StringBuilder(); 
        sb.append(id);
        sb.append("|");
        sb.append(street);
        sb.append("|");
        sb.append(complement);
        sb.append("|");
        sb.append(zipCode);
        sb.append("|");
        sb.append(city);
        sb.append("|");
        sb.append(state);
        sb.append("|");
        sb.append(customerId);
        return sb.toString(); 
    } 

}
