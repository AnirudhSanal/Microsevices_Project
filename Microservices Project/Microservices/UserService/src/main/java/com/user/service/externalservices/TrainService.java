package com.user.service.externalservices;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.user.service.entities.Train;

@FeignClient(name = "TRAIN-SERVICE")
public interface TrainService {

	@GetMapping("/trains/{trainId}")
	Train getTrain(@PathVariable("trainId") String trainId) ;
}
