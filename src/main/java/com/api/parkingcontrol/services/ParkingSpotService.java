package com.api.parkingcontrol.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.parkingcontrol.models.ParkingSpot;
import com.api.parkingcontrol.repositories.ParkingSpotRepository;

import jakarta.transaction.Transactional;

@Service
public class ParkingSpotService {
	@Autowired
	ParkingSpotRepository parkingSpotRepository;

	@Transactional
	public ParkingSpot save(ParkingSpot parkingSpotModel) {
		return parkingSpotRepository.save(parkingSpotModel);
	}
}
