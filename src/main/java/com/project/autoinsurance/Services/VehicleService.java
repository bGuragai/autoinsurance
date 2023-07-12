package com.project.autoinsurance.Services;

import com.project.autoinsurance.Repository.PolicyRepo;
import com.project.autoinsurance.Repository.VehicleRepo;
import com.project.autoinsurance.entity.Vehicle;
import org.springframework.stereotype.Service;

@Service
public class VehicleService {

    private final PolicyRepo policyRepo;

    public VehicleService(PolicyRepo policyRepo) {
        this.policyRepo = policyRepo;
    }

    public Vehicle addVehicle(Vehicle vehicle){
        return VehicleRepo.save;
    }

    public Vehicle removeVehicle(Vehicle vehicle){
        return policyRepo.delete(vehicle);
    }
}
