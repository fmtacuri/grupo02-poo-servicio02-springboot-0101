package com.grupo02.SceneryOne.factory;

import static com.grupo02.SceneryOne.domain.enums.VehiculeType.CAR;
import static com.grupo02.SceneryOne.domain.enums.VehiculeType.TRUCK;
import static com.grupo02.SceneryOne.domain.enums.VehiculeType.VAN;

import com.grupo02.SceneryOne.domain.dto.VehicleDto;
import com.grupo02.SceneryOne.domain.enums.FuelType;
import com.grupo02.SceneryOne.service.VehicleService;

public class VehicleFactory {

  public static VehicleService getRegistrationCost(VehicleDto vehicleDto) {
    if (vehicleDto.getFuelType().equals(FuelType.GASOLINE.getFuelType())) {
      return vehicleDto.getCapacity() < 1000 ? CAR.getVehicleServiceSupplier().get()
          : VAN.getVehicleServiceSupplier().get();
    }

    return TRUCK.getVehicleServiceSupplier().get();
  }

}
