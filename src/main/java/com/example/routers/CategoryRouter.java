package com.example.routers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import com.example.domains.Vendor;
import com.example.handlers.CategoryHandler;
import com.example.repositories.VendorRepository;

import reactor.core.publisher.Flux;

@RestController
public class CategoryRouter {
	
	@Autowired
	private VendorRepository repo;

	@GetMapping("/hello")
	public RouterFunction<ServerResponse> route(CategoryHandler categoryHandler) {

		return RouterFunctions
			.route(RequestPredicates.GET("/hello").and(RequestPredicates.accept(MediaType.TEXT_PLAIN)), categoryHandler::hello);
	}
	
	
	@GetMapping("/vendors")
    public Flux<Vendor> getAllVendors() {
        return repo.findAll();
    }
}
