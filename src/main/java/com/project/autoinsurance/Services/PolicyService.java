package com.project.autoinsurance.Services;

import com.project.autoinsurance.entity.Policy;
import com.project.autoinsurance.Repository.PolicyRepo;
import com.project.autoinsurance.entity.Vehicle;
import org.springframework.stereotype.Service;

@Service
public class PolicyService {

    private final PolicyRepo policyRepo;

    public PolicyService(PolicyRepo policyRepo) {
        this.policyRepo = policyRepo;
    }


    public Policy createPolicy(Policy policy){
        return policyRepo.save(policy);
    }
//
    public Policy renewPolicy(Policy policy){

    }

    public Policy addVehicle(Vehicle vehicle){
        Policy vehicle = policyRepo.f

    }

    public Policy removeVehicle(Vehicle vehicle){


    }


}
