package com.example.handlers;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import com.example.domains.Category;
import com.example.repositories.CategoryRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Component
public class CategoryHandler {
	
//	private final CategoryRepository categoryRepository;
//
//	public CategoryHandler(CategoryRepository categoryRepository) {
//		this.categoryRepository = categoryRepository;
//	}
//	
//	@GetMapping("/list")
//	Flux<Category> list(){
//		return categoryRepository.findAll();
//	}
//	
//	@GetMapping("/list/{id}")
//	Mono<Category> getById(@PathVariable String id){
//		return categoryRepository.findById(id);
//	}
//	
//	@RequestMapping("/try")
//	String trial(){
//		return "Hello" ;
//	}
	public Mono<ServerResponse> hello(ServerRequest request) {
		return ServerResponse.ok().contentType(MediaType.TEXT_PLAIN)
			.body(BodyInserters.fromObject("Hello, Spring!"));
	}

}
