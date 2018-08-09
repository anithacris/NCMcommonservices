package com.javasampleapproach.jpapostgresqlangular4.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//import org.springframework.data.repository.CrudRepository;
import com.javasampleapproach.jpapostgresqlangular4.model.Tdm;
import com.javasampleapproach.jpapostgresqlangular4.repo.TdmRepository;

//@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
//@RequestMapping({"/api"})

public class TdmController {
	@Autowired
	TdmRepository repository;
//private TdmService tdmService;
	@GetMapping(value="/tdm",  produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Tdm> getAll() {
		List<Tdm> list = new ArrayList<>();
		Iterable<Tdm> tdm = repository.findAll();

		tdm.forEach(list::add);
		return list;
	}
	
	@PostMapping(value="/posttdm")
	public Tdm postTdm(@RequestBody Tdm tdm) {

		repository.save(new Tdm(tdm.getTdmId(),tdm.getTerminalCode(), tdm.getBookingCode(),tdm.getWindowNo(),tdm.getTerminalType(),tdm.getTerminalIp(),tdm.getPosTid(),tdm.getBankName(),tdm.getServiceProvider(),tdm.getPosVersionCode(),tdm.getAppterType(),tdm.getTermParameter(),tdm.getTermOperType1(),tdm.getTermOperType2(),tdm.getTermOperType3(),tdm.getTermOperType4(),tdm.getMacAddress(),tdm.getStationServerId()));
		return tdm;
	}

	@GetMapping(value="/findbyterminalCode/{terminalCode}",  produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Tdm> findByTerminalCode(@PathVariable String terminalCode) {

		List<Tdm> tdm = repository.findByTerminalCode(terminalCode);
		return tdm;
	}
	
	@DeleteMapping(value="/tdm/{id}")
	public void deleteTdm(@PathVariable long id){
		
		repository.delete(id);
	}

}
