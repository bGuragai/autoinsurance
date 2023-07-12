package com.project.autoinsurance.Repository;

import com.project.autoinsurance.entity.Bill;

import com.project.autoinsurance.entity.Policy;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BillRepo extends CrudRepository<Bill,Long> {
    List<Bill> findAll();
}
