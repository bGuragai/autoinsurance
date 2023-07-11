package com.project.autoinsurance.Services;

import com.project.autoinsurance.models.Policy;
import com.project.autoinsurance.Repository.PolicyRepo;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PolicyService {

    private final PolicyRepo policyRepo;

    public PolicyService(PolicyRepo policyRepo) {
        this.policyRepo = policyRepo;
    }


    public Policy createPolicy(Policy policy){
        return policyRepo.save(policy);
    }
    public Policy renewPolicy(Policy policy){
        Optional<Policy> isPolicy = policyRepo.findById(policy.getId());
        if (isPolicy.isPresent()){
            Policy newPolicy = isPolicy.get();
            newPolicy.setType(policy.getType());
            newPolicy.setCoverage(policy.getCoverage());
            newPolicy.setBill(policy.getBill());
            policyRepo.save(newPolicy);
            return newPolicy;

        }
        else return null;
    }
}
