package org.mapper.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AttackDetailsDto {

  private Integer damage;
  private Integer range;
  private AttackType attackType;

}
