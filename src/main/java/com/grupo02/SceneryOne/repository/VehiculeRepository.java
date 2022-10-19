package com.grupo02.SceneryOne.repository;

import com.grupo02.SceneryOne.domain.dto.VehicleDto;

public interface VehiculeRepository {

  long saveVehicule(VehicleDto vehicleDto);

  boolean validateFuelType(String fuelType);
}
