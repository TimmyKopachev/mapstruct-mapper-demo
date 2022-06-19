package org.mapper.demo;

import org.mapper.demo.dto.AttackDetailsDto;
import org.mapper.demo.dto.AttackType;
import org.mapper.demo.dto.HeroDto;
import org.mapper.demo.dto.RaceDto;
import org.mapper.demo.dto.StatsDto;
import org.mapper.demo.entity.Hero;
import org.mapper.demo.entity.RaceDetails;
import org.mapper.demo.mapper.HeroMapper;

public class ApplicationRunner {

  public static void main(String[] args) {
    System.out.printf("Here is a demo of entityToDto(): %s%n",
        HeroMapper.INSTANCE.mapToDto(buildHero()));
    System.out.println("---------");
    System.out.printf("Here is a demo of dtoToEntity(): %s%n",
        HeroMapper.INSTANCE.mapToEntity(buildHeroDto()));
  }

  private static Hero buildHero() {

    return Hero.builder()
        .name("Timmy")
        .level(15)
        .damage(70)
        .range(1000)
        .attackType("PHYSIC")
        .armor(15)
        .movespeed(350)
        .race(RaceDetails.builder()
            .name("Elf")
            .description("Elf race description")
            .build())
        .build();
  }


  private static HeroDto buildHeroDto() {
    return HeroDto.builder()
        .name("Nev1l")
        .level(76)
        .attackDetails(AttackDetailsDto.builder()
            .attackType(AttackType.MAGIC)
            .damage(80)
            .range(800)
            .build())
        .stats(StatsDto.builder()
            .armor(6)
            .movespeed(320)
            .build())
        .race(RaceDto.builder()
            .name("Human")
            .description("Human race description")
            .build())
        .build();
  }

}
