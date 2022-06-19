package org.mapper.demo.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class HeroDto {

  private String name;
  private Integer level;

  private AttackDetailsDto attackDetails;

  private StatsDto stats;

  private RaceDto race;

}
