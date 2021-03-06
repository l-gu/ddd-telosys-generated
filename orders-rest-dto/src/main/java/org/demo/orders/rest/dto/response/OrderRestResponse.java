/*
 * Generated by Telosys ( https://www.telosys.org/ )
 * 2022-04-12 (15:13:48)
 */
package org.demo.orders.rest.dto.response;

import org.demo.orders.rest.dto.common.AbstractRestResponse;
import org.demo.orders.rest.dto.OrderRestDto;

import java.util.List;

public class OrderRestResponse extends AbstractRestResponse<OrderRestDto> {

    /**
     * Constructor
     * @param list
     * @param totalElements
     * @param pageSize
     */
    public OrderRestResponse(List<OrderRestDto> list, long totalElements, int pageSize) {
        super(list, totalElements, pageSize);
    }
}