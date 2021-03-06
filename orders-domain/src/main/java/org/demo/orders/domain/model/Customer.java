/*
 * Generated by Telosys ( https://www.telosys.org/ )
 * 2022-04-12 (15:11:34)
 */
package org.demo.orders.domain.model;


/**
 * Domain class for "Customer"
 *
 * @author Telosys
 *
 */
public final class Customer extends CustomerParent {

	/**
	 * Constructor 
	 * @param id
	 * @param firstName
	 * @param lastName
	 * @param address
	 */
	Customer(
            Integer id,
            String firstName,
            String lastName,
            CustomerAddress address
            ) {
        super(
		    id,		
		    firstName,		
		    lastName,		
            address		
            );
	}


	/**
	 * Create aggregate business methods here...
	 */
	public void doSomethingWithThisAggregate() {
		// TODO
	}
}
