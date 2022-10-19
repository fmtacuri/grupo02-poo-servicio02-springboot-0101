package com.grupo02.SceneryOne.repository;

import com.grupo02.SceneryOne.domain.dto.VehicleDto;
import com.grupo02.SceneryOne.domain.dto.VehicleInformationDto;
import java.util.List;

public interface VehiculeRepository {

  long saveVehicule(VehicleDto vehicleDto);

  boolean validateFuelType(String fuelType);

  VehicleInformationDto findVehicleById(long id);

  List<VehicleInformationDto> findAllVehicles();
}
