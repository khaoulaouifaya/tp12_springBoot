package springBoot.tp12.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import springBoot.tp12.dao.clientIterface;
import springBoot.tp12.models.Client;
@Service
public class serviceClient implements IclientService {

	@Autowired
	private clientIterface dao;
	
	
	@Transactional
	public Client saveClient(Client c) {
		// TODO Auto-generated method stub
		
		return dao.save(c);
	}

	@Transactional
	public void updateClient(Client c) {
		// TODO Auto-generated method stub
		c.setNom(c.getNom());
		c.setPrenom(c.getPrenom());
		dao.save(c);
	}

	@Transactional
	public void deleteClient(long id) {
		// TODO Auto-generated method stub
		dao.deleteById(id);
		
	}

	@Transactional
	public Client getOne(long id) {
		// TODO Auto-generated method stub
		Client c=dao.findById(id).get();
		return c;
	}

	@Transactional
	public List<Client> getAll() {
		// TODO Auto-generated method stub
		List<Client> lc=(List<Client>) dao.findAll();
		return lc;
	}

}
