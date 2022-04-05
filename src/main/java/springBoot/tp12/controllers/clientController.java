package springBoot.tp12.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import springBoot.tp12.models.Client;
import springBoot.tp12.services.IclientService;

@RestController
@RequestMapping("/students")
public class clientController{
	
	@Autowired
	private IclientService service;

	@PostMapping("/add")
	public Client saveClient(@RequestBody Client c) {
		// TODO Auto-generated method stub	
		return service.saveClient(c);
	}
	

	@PutMapping("/updateClientForDb")
	public void updateClient(@RequestBody Client c) {
		// TODO Auto-generated method stub
		service.updateClient(c);	
	}

	@DeleteMapping("/{id}")
	public void deleteClient(@PathVariable("id") long idc) {
		// TODO Auto-generated method stub
		service.deleteClient(idc);
	}

	@GetMapping("/{id}")
	public Client getOne(@PathVariable("id") long idc) {
		// TODO Auto-generated method stub
		
		return service.getOne(idc);
	}

	@GetMapping("/all")
	public List<Client> getAll() {
		// TODO Auto-generated method stub
		return service.getAll();
	}

	
	
}
