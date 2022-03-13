package springBoot.tp12.services;

import java.util.List;

import springBoot.tp12.models.Client;

public interface IclientService {
	
	Client saveClient(Client c);
	void updateClient(Client c);
	void deleteClient(long id);
	Client getOne(long id);
	List<Client> getAll();

}
