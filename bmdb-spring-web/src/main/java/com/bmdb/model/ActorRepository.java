package com.bmdb.model;

import org.springframework.data.repository.CrudRepository;

public interface ActorRepository extends CrudRepository<Actor, Integer> {  //ID -the datatype, a reference type, of the PK

}
