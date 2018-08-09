package com.javasampleapproach.jpapostgresqlangular4.repo;

import java.io.Serializable;
import org.springframework.data.repository.CrudRepository;
import  com.javasampleapproach.jpapostgresqlangular4.model.Bike;
 
public interface BikeRepository extends CrudRepository<Bike, Serializable> {
 
}