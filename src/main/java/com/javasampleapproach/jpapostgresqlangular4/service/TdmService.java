
package com.javasampleapproach.jpapostgresqlangular4.service;

import java.util.List;
import com.javasampleapproach.jpapostgresqlangular4.model.Tdm;
 
public interface TdmService {
 
	List<Tdm> getAllTdm();
	
	Tdm getTdmadd(Integer tdmId);
	
	Tdm createTdm(Tdm tdm);
	
	Tdm updateTdm(Tdm tdm);
 
	void deleteTdm(Integer tdmId);


	Tdm getTdm(Integer tdmId);

	Tdm createBike(Tdm tdm);
 
}