/*
 * Generated by Telosys ( https://www.telosys.org/ )
 * 2022-04-12 (15:13:48)
 */
package org.demo.orders.rest.dto;

import java.io.Serializable;


/**
 * REST DTO for entity "Category"
 * 
 * @author Telosys
 *
 */
public class CategoryRestDto implements Serializable
{
    private static final long serialVersionUID = 1L;

    private short code; // ID
    private String name; 


    /**
     * Default constructor
     */
    public CategoryRestDto() {
        super();
    }
    
    /**
     * Set the "code" field value
     * @param code
     */
	public void setCode( short code ) {
        this.code = code ;
    }
    /**
     * Get the "code" field value
     * @return the field value
     */
	public short getCode() {
        return this.code;
    }

    /**
     * Set the "name" field value
     * @param name
     */
	public void setName( String name ) {
        this.name = name ;
    }
    /**
     * Get the "name" field value
     * @return the field value
     */
	public String getName() {
        return this.name;
    }



    @Override
    public String toString() { 
        StringBuilder sb = new StringBuilder(); 
        sb.append(code);
        sb.append("|");
        sb.append(name);
        return sb.toString(); 
    } 

}
