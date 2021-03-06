/*
 * Generated by Telosys ( https://www.telosys.org/ )
 * 2022-04-12 (15:15:28)
 */

package org.demo.orders.application.service.impl;

import java.util.List;
import java.util.Optional;
import javax.inject.Inject;
import org.springframework.stereotype.Component;

import org.demo.orders.rest.dto.response.OrderRestResponse;
import org.demo.orders.domain.model.Order;
import org.demo.orders.domain.repository.OrderRepository;
import org.demo.orders.application.mapper.OrderMapper;
import org.demo.orders.rest.dto.OrderRestDto;
import org.demo.orders.application.service.OrderQueryService;

/**
 * Service for "QUERIES" (database read operations)
 * Entity Order
 *
 * @author Telosys
 */
@Component
public class OrderQueryServiceImpl implements OrderQueryService {

	@Inject
	private OrderRepository orderRepository;
	
	@Inject
	private OrderMapper orderMapper;

	/**
	 * Get and return a Order instance for the given id
	 * @param num id
	 * @return entity found (or null if not found)
	 */
 	@Override
	public OrderRestDto getOrder(Integer num) {
		Optional<Order> order = orderRepository.findById(num);
		if (order.isPresent()) {
			return orderMapper.toDTO(order.get());
		}
		else {
			return null;
		}
	}
	
	/**
	 * Get a page of Order 
	 * @param page page number (from 1 to N)
	 * @param size page size
	 * @param sort
	 * @param order
	 * @return
	 */
 	@Override
	public OrderRestResponse findOrder(Integer page, Integer size, String sort, String order) {

		// Find all in database
		List<Order> orderList = orderRepository.findAll(page-1, size, sort, order);

		// Count all in database
		long totalElements = orderRepository.count();
		
		// Build API response object
		//return buildResponse(orderList, totalElements, size);
		List<OrderRestDto> list = orderMapper.toDTOList(orderList);
		return new OrderRestResponse(list, totalElements, size);
	}

}
