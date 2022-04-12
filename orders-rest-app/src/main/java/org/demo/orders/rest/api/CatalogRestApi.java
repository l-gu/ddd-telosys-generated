/*
 * Generated by Telosys ( https://www.telosys.org/ )
 * 2022-04-12 (15:15:28)
 */

package org.demo.orders.rest.api;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import org.demo.orders.rest.dto.CatalogRestDto;

/**
 * REST API interface for Catalog
 * 
 * @author Telosys
 */
@Path("/catalog")
public interface CatalogRestApi {

    @GET
    @Path("/{year}/{quarter}")
    @Produces({ "application/json" })	
	Response getCatalog(short year, short quarter);

    @GET
    @Path("/")
    @Produces({ "application/json" })	
	Response findCatalog(Integer page, Integer size, String sort, String order);

    @POST
    @Path("/")
    @Consumes({ "application/json" })
	Response insertCatalog(CatalogRestDto catalogRestDto);

    @PUT	
    @Path("/")
    @Consumes({ "application/json" })
	Response updateCatalog(short year, short quarter, CatalogRestDto catalogRestDto);		

	@DELETE
    @Path("/{year}/{quarter}")
	Response deleteCatalog(short year, short quarter);
}