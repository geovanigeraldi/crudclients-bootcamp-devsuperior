package com.geovanigeraldi.crudclients.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.geovanigeraldi.crudclients.entities.Clients;

@Repository
public interface ClientsRepository extends JpaRepository<Clients, Long>{

}
