package org.mapper.demo.mapper;

import org.mapper.demo.dto.HeroDto;
import org.mapper.demo.entity.Hero;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(uses = RaceMapper.class)
public abstract class HeroMapper {

  public static final HeroMapper INSTANCE = Mappers.getMapper(HeroMapper.class);

  @Mapping(target = "attackDetails.damage", source = "hero.damage")
  @Mapping(target = "attackDetails.range", source = "hero.range")
  @Mapping(target = "attackDetails.attackType", source = "hero.attackType")
  @Mapping(target = "stats.armor", source = "hero.armor")
  @Mapping(target = "stats.movespeed", source = "hero.movespeed")
  public abstract HeroDto mapToDto(Hero hero);

  @Mapping(target = "damage", source = "attackDetails.damage")
  @Mapping(target = "range", source = "attackDetails.range")
  @Mapping(target = "attackType", source = "attackDetails.attackType")
  @Mapping(target = "armor", source = "stats.armor")
  @Mapping(target = "movespeed", source = "stats.movespeed")
  public abstract Hero mapToEntity(HeroDto heroDto);
}
