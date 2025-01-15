package com.train.service.services;

import java.util.List;

import com.train.service.entity.Train;

public interface TrainService {

	// Create Train

	public Train saveTrain(Train train);

	// Get Train

	public Train getTrain(String trainId);

	// Get All Train

	public List<Train> getAllTrain();

	// Update Train

	// Delete Train

}
