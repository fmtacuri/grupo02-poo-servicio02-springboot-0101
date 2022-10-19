package com.grupo02.SceneryOne.factory;

import static com.grupo02.SceneryOne.domain.enums.VehiculeType.CAR;
import static com.grupo02.SceneryOne.domain.enums.VehiculeType.TRUCK;
import static com.grupo02.SceneryOne.domain.enums.VehiculeType.VAN;

import com.grupo02.SceneryOne.domain.enums.FuelType;
import com.grupo02.SceneryOne.service.VehicleService;

public class VehicleFactory {

  public static VehicleService getRegistrationCost(String fuelType, long capacity) {
    if (fuelType.equals(FuelType.GASOLINE.getFuelType())) {
      return capacity < 1000 ? CAR.getVehicleServiceSupplier().get()
          : VAN.getVehicleServiceSupplier().get();
    }

    return TRUCK.getVehicleServiceSupplier().get();
  }

}
