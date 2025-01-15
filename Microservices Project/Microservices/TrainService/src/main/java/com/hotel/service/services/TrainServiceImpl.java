package com.train.service.services;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.train.service.entity.Train;
import com.train.service.exceptions.ResourceNotFoundException;
import com.train.service.repositories.TrainRepository;

@Service
public class TrainServiceImpl implements TrainService {

	@Autowired
	private TrainRepository trainRepository;

	@Override
	public Train saveTrain(Train train) {

		String randomUserId = UUID.randomUUID().toString();
		train.setTrainId(randomUserId);
		return trainRepository.save(train);

	}

	@Override
	public Train getTrain(String trainId) {

		return trainRepository.findById(trainId).orElseThrow(
				() -> new ResourceNotFoundException("Train with given id is not found on server!! " + trainId));
	}

	@Override
	public List<Train> getAllTrain() {

		return trainRepository.findAll();
	}

}
