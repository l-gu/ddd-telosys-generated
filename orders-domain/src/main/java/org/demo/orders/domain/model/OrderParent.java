/*
 * Generated by Telosys ( https://www.telosys.org/ )
 * 2022-04-12 (15:11:34)
 */
package org.demo.orders.domain.model;

import java.time.LocalDate;
import java.util.List;
import org.demo.orders.domain.common.AggregateRoot;

/**
 * Domain parent abstract class for entity "Order"
 *
 * @author Telosys
 *
 */
public abstract class OrderParent extends AggregateRoot {

	private Integer num;
	private LocalDate orderDate;
	private short status;
	private String comment;
	private Integer customerId;

    private List<OrderItem> items ;
    private DeliveryAddress deliveryAddress ;
	/**
	 * No default constructor 
	 * Default constructor is forbidden (explicitly private)
	 */
	private OrderParent() {
	}

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
	OrderParent(
                Integer num,
                LocalDate orderDate,
                short status,
                String comment,
                Integer customerId,
                List<OrderItem> items,
                DeliveryAddress deliveryAddress
                ) {
		this.num = num;
		this.orderDate = orderDate;
		this.status = status;
		this.comment = comment;
		this.customerId = customerId;
        this.items = items;
        this.deliveryAddress = deliveryAddress;
	}

    /**
     * Get the "num" attribute value
     * @return the attribute value
     */
	public Integer getNum() {
        return this.num;
    }

    /**
     * Get the "orderDate" attribute value
     * @return the attribute value
     */
	public LocalDate getOrderDate() {
        return this.orderDate;
    }

    /**
     * Get the "status" attribute value
     * @return the attribute value
     */
	public short getStatus() {
        return this.status;
    }

    /**
     * Get the "comment" attribute value
     * @return the attribute value
     */
	public String getComment() {
        return this.comment;
    }

    /**
     * Get the "customerId" attribute value
     * @return the attribute value
     */
	public Integer getCustomerId() {
        return this.customerId;
    }


	/**
     * Get the "items" 
     * @return
     */
    public List<OrderItem> getItems() {
        return this.items;
    } 

	/**
     * Get the "deliveryAddress" 
     * @return
     */
    public DeliveryAddress getDeliveryAddress() {
        return this.deliveryAddress;
    } 

	@Override
    public String toString() { 
        StringBuilder sb = new StringBuilder(); 
        sb.append(num);
        sb.append("|");
        sb.append(orderDate);
        sb.append("|");
        sb.append(status);
        sb.append("|");
        sb.append(comment);
        sb.append("|");
        sb.append(customerId);
        return sb.toString(); 
    } 

}
