package com.rabincap.web.service.endpoint;

import org.jdom2.Element;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;

import com.rabincap.web.service.CatalogService;

@Endpoint
public class CatalogEndPoint {

	private CatalogService catalogService;

	@Autowired
	public CatalogEndPoint(CatalogService catalogService) {
		this.catalogService = catalogService;
	}
	
	public Element getCategoryDetailsByCategoryID(Element request){
		return null;
	}

}
