package com.javasampleapproach.jpapostgresqlangular4.services.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import com.javasampleapproach.jpapostgresqlangular4.model.Bike;
import com.javasampleapproach.jpapostgresqlangular4.repo.BikeRepository;
import com.javasampleapproach.jpapostgresqlangular4.service.BikeService;
 
@Service
public class BikeServiceImpl implements BikeService {
 
	@Autowired
	private BikeRepository bikeRepository;
 
	@Override
	public List<Bike> getAllBikes() {
		List<Bike> bikes = new ArrayList<Bike>();
		Iterator<Bike> iterator = bikeRepository.findAll().iterator();
		while (iterator.hasNext()) {
			bikes.add(iterator.next());
		}
 
		return bikes;
	}
 
	@Override
	public Bike getBike(Integer bikeId) {
		return bikeRepository.findOne(bikeId);
	}
 
	@Override
	public Bike createBike(Bike bike) {
		return bikeRepository.save(bike);
	}
 
	@Override
	public Bike updateBike(Bike bike) {
		return bikeRepository.save(bike);
	}
 
	@Override
	public void deleteBike(Integer bikeId) {
		bikeRepository.delete(bikeId);
	}
 
}