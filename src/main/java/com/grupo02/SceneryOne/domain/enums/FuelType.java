package com.grupo02.SceneryOne.domain.enums;

import java.util.Arrays;
import java.util.Objects;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum FuelType {

  GASOLINE("Gasoline"),
  DIESEL("Diesel");

  private final String fuelType;

  public String getFuelType(String type) {
    FuelType fuel = Arrays.stream(values()).filter(value -> value.getFuelType().equals(type))
        .findFirst().orElse(null);
    return !Objects.isNull(fuel) ? fuel.getFuelType() : null;
  }
}
