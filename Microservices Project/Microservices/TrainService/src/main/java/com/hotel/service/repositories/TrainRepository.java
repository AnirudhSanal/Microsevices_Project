package com.train.service.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.train.service.entity.Train;

public interface TrainRepository extends JpaRepository<Train, String>{

}
