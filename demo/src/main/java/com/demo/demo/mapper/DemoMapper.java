package com.demo.demo.mapper;

import com.demo.demo.dto.DemoDto;
import com.demo.demo.entities.Demo;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface DemoMapper {
    DemoMapper INSTANCE = Mappers.getMapper(DemoMapper.class);

    DemoDto modelToDto(Demo demo);
    Demo dtoToModel(DemoDto demoDto);
    List<DemoDto> modelToDtos(List<Demo> demo);

}
