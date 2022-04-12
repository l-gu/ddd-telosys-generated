package org.demo.orders.rest.common;

import java.net.URI;
import java.util.Objects;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import javax.ws.rs.core.UriInfo;


/**
 * Abstract controller for REST API implementation
 * 
 * @author Telosys
 */
public abstract class AbstractController {

	@Context
	protected UriInfo uriInfo;

	/**
	 * Returns a REST response <br>
	 * Status 200 if DTO is not null <br>
	 * Status 404 if DTO is null
	 * @param <T> dto type
	 * @param dto
	 * @return Response
	 */
	protected <T> Response getResponseHandler(T dto) {
		if (Objects.nonNull(dto)) {
			return Response.ok(dto).build();
		}
		//return Response.status(HttpStatus.NOT_FOUND.value()).build();
		return Response.status(Response.Status.NOT_FOUND).build();
		
	}
	
	protected URI buildUriWithId(Object entityId) {
		UriBuilder uriBuilder = uriInfo.getAbsolutePathBuilder();
		// Append path to the existing path.
		uriBuilder.path(String.valueOf(entityId)); 
		return uriBuilder.build();
	}	
}
