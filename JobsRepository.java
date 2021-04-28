package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface JobsRepository extends JpaRepository<Jobs,Integer> {
	java.util.List<Jobs> findAll();
}
