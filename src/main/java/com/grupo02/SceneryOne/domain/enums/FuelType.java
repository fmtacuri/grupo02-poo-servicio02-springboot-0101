package com.grupo02.SceneryOne.domain.enums;

import java.util.Arrays;
import java.util.Locale;
import java.util.Objects;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum FuelType {

  GASOLINE("GASOLINE"),
  DIESEL("DIESEL");

  private final String fuelType;

  public static String findType(String type) {
    FuelType fuel = Arrays.stream(values())
        .filter(value -> value.getFuelType().toUpperCase(Locale.ROOT).equals(type.toUpperCase()))
        .findFirst().orElse(null);
    return !Objects.isNull(fuel) ? fuel.getFuelType() : null;
  }
}
