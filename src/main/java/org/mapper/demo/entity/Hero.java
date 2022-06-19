package org.mapper.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Hero {

  private String name;
  private Integer level;

  private Integer damage;
  private Integer range;

  private String attackType;

  private Integer armor;
  private Integer movespeed;

  private RaceDetails race;
}
