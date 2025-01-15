package com.train.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.train.service.entity.Train;
import com.train.service.services.TrainService;

@RestController
@RequestMapping("/trains")
public class TrainController {

	@Autowired
	private TrainService trainService;

	// Creating Train

	@PostMapping
	public ResponseEntity<Train> createTrain(@RequestBody Train train) {
		Train savedTrain = trainService.saveTrain(train);
		return ResponseEntity.status(HttpStatus.CREATED).body(savedTrain);
	}

	// Getting Single Train

	@GetMapping("/{trainId}")
	public ResponseEntity<Train> getSingleTrain(@PathVariable("trainId") String trainId) {
		Train train = trainService.getTrain(trainId);
		return ResponseEntity.ok(train);
	}

	// Getting All Train

	@GetMapping
	public ResponseEntity<List<Train>> getAllTrain() {
		List<Train> allTrain = trainService.getAllTrain();
		return ResponseEntity.ok(allTrain);
	}
}
