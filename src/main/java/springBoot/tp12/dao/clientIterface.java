package springBoot.tp12.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import springBoot.tp12.models.Client;


@Repository
public interface clientIterface extends CrudRepository<Client,Long>{

}
