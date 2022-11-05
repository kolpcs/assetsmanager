package com.pcits.assetsmanager.repo;

import com.pcits.assetsmanager.Model.userDetails;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface mongoDBRepo extends MongoRepository<userDetails, Integer> {


}
