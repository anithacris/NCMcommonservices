package com.javasampleapproach.jpapostgresqlangular4.service;

import java.util.List;
import com.javasampleapproach.jpapostgresqlangular4.model.Bike;
 
public interface BikeService {
 
	List<Bike> getAllBikes();
	
	Bike getBike(Integer bikeId);
	
	Bike createBike(Bike bike);
	
	Bike updateBike(Bike bike);
 
	void deleteBike(Integer bikeId);
 
}