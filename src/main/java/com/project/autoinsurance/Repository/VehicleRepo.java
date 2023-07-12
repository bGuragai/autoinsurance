package com.project.autoinsurance.Repository;

import com.project.autoinsurance.entity.Policy;
import com.project.autoinsurance.entity.Vehicle;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VehicleRepo extends CrudRepository<Vehicle,Long> {

    List<Vehicle> findAll();
}
