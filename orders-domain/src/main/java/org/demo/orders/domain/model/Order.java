/*
 * Generated by Telosys ( https://www.telosys.org/ )
 * 2022-04-12 (15:11:34)
 */
package org.demo.orders.domain.model;

import java.time.LocalDate;
import java.util.List;

/**
 * Domain class for "Order"
 *
 * @author Telosys
 *
 */
public final class Order extends OrderParent {

	/**
	 * Constructor 
	 * @param num
	 * @param orderDate
	 * @param status
	 * @param comment
	 * @param customerId
	 * @param items
	 * @param deliveryAddress
	 */
	Order(
            Integer num,
            LocalDate orderDate,
            short status,
            String comment,
            Integer customerId,
            List<OrderItem> items,
            DeliveryAddress deliveryAddress
            ) {
        super(
		    num,		
		    orderDate,		
		    status,		
		    comment,		
		    customerId,		
            items,		
            deliveryAddress		
            );
	}


	/**
	 * Create aggregate business methods here...
	 */
	public void doSomethingWithThisAggregate() {
		// TODO
	}
}
