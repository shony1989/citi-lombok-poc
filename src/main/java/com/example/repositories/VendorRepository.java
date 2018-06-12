package com.example.repositories;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.example.domains.Vendor;


public interface VendorRepository extends ReactiveMongoRepository<Vendor, String> {
	

}
