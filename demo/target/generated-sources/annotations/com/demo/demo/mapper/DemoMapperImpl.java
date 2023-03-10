package com.demo.demo.mapper;

import com.demo.demo.dto.DemoDto;
import com.demo.demo.entities.Demo;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

/*
@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-03-03T16:45:32+0100",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.2 (Oracle Corporation)"
)
*/
@Component
public class DemoMapperImpl implements DemoMapper {

    @Override
    public DemoDto modelToDto(Demo demo) {
        if ( demo == null ) {
            return null;
        }

        DemoDto demoDto = new DemoDto();

        return demoDto;
    }

    @Override
    public Demo dtoToModel(DemoDto demoDto) {
        if ( demoDto == null ) {
            return null;
        }

        Demo demo = new Demo();

        return demo;
    }

    @Override
    public List<DemoDto> modelToDtos(List<Demo> demo) {
        if ( demo == null ) {
            return null;
        }

        List<DemoDto> list = new ArrayList<DemoDto>( demo.size() );
        for ( Demo demo1 : demo ) {
            list.add( modelToDto( demo1 ) );
        }

        return list;
    }
}
