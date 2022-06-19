package org.mapper.demo.mapper;

import org.mapper.demo.dto.RaceDto;
import org.mapper.demo.entity.RaceDetails;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public abstract class RaceMapper {

  public static final RaceMapper INSTANCE = Mappers.getMapper(RaceMapper.class);

  public abstract RaceDto mapToDto(RaceDetails raceDetails);

  public abstract RaceDetails mapToEntity(RaceDto raceDto);
}
