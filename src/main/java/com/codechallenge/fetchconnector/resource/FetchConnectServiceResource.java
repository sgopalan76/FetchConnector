package com.codechallenge.fetchconnector.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FetchConnectServiceResource {

	@GetMapping("/{hello}")
	public String getResponseFromFetchConnector(@PathVariable("hello") final String userName) {
		return "Hello "+userName+" Fetch Connector service 2 returned successfully";
	}
}
