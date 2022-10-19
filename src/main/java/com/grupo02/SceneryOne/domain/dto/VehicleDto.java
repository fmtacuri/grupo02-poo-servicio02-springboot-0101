package com.grupo02.SceneryOne.domain.dto;

import com.grupo02.SceneryOne.domain.enums.FuelType;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper = true)
@Data
@SuperBuilder
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class VehicleDto extends BrandDto {

  String plaque;
  @Builder.Default
  long capacity = 0;
  String color;
  @Builder.Default
  String fuelType = FuelType.GASOLINE.getFuelType();

}
