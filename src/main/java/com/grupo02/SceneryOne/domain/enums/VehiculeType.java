package com.grupo02.SceneryOne.domain.enums;

import com.grupo02.SceneryOne.service.VehicleService;
import com.grupo02.SceneryOne.service.impl.CarImpl;
import com.grupo02.SceneryOne.service.impl.TruckImpl;
import com.grupo02.SceneryOne.service.impl.VanImpl;
import java.util.function.Supplier;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum VehiculeType {

  CAR(CarImpl::new),
  VAN(VanImpl::new),
  TRUCK(TruckImpl::new);

  private final Supplier<VehicleService> vehicleServiceSupplier;
}
