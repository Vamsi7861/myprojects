package com.tech.demo.dao;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tech.demo.dto.Branch;
import com.tech.demo.repositry.BranchRepository;



@Repository
public class BranchDao {
	@Autowired
	BranchRepository repository;

	public Branch saveBranch(Branch branch) {
		return repository.save(branch);
	}

	public Branch updateBranch(Branch branch) {
		return repository.save(branch);
	}

	public Optional<Branch> findBranchById(int id) {
		return repository.findById(id);
	}

	public void delete(Branch branch) {
		repository.delete(branch);
	}

	public List<Branch> getAllBranchs() {
		return repository.findAll();
	}
}
