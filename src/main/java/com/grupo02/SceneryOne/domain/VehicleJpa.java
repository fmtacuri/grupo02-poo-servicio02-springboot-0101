package com.grupo02.SceneryOne.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "vehicle")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class VehicleJpa implements Serializable {

  static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(nullable = false)
  Long id;

  @Column(nullable = false, length = 30)
  String plaque;

  @Column(nullable = false, length = 55)
  String color;

  @Column(nullable = false)
  long capacity;

  @Column(name = "fuel_type",nullable = false, length = 15)
  String fuelType;

  @Column(name = "registration_cost",nullable = false)
  float registrationCost;
}
