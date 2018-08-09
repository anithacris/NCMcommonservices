package com.javasampleapproach.jpapostgresqlangular4.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.javasampleapproach.jpapostgresqlangular4.model.Tdm;

public interface TdmRepository extends CrudRepository<Tdm, Long>{

	List<Tdm> findByTerminalCode(String terminalCode);

	//Tdm findOne(Integer tdmId);

	//void delete(Integer tdmId);
}
