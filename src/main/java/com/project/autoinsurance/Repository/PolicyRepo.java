package com.project.autoinsurance.Repository;

import com.project.autoinsurance.models.Policy;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PolicyRepo extends CrudRepository<Policy,Long>{
    List<Policy> findAll();
}

