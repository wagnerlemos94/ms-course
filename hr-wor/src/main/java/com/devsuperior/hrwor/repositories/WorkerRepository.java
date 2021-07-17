package com.devsuperior.hrwor.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.hrwor.entity.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{

}
