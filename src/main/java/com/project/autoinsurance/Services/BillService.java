package com.project.autoinsurance.Services;

import com.project.autoinsurance.Repository.PolicyRepo;
import org.springframework.stereotype.Service;

@Service
public class BillService {

    private final PolicyRepo policyRepo;

    public BillService(PolicyRepo policyRepo) {
        this.policyRepo = policyRepo;
    }
}
