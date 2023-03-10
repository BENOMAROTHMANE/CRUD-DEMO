package com.demo.demo.controller;

import com.demo.demo.dto.DemoDto;
import com.demo.demo.entities.Demo;
import com.demo.demo.mapper.DemoMapper;
import com.demo.demo.repository.DemoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class DemoController {
    @Autowired
    private DemoRepository demoRepository;
    @Autowired
    private DemoMapper demoMapper;

    @PostMapping("/demo")
    public ResponseEntity<Demo> save(@RequestBody DemoDto demoDto){
    return new ResponseEntity<>(demoRepository.save(
        demoMapper.dtoToModel(demoDto)),
        HttpStatus.CREATED);
    }
    //find all
    @GetMapping("/demo")
    public ResponseEntity<List<DemoDto>>findAll(){
        return new ResponseEntity<>(
                demoMapper.modelToDtos(demoRepository.findAll()), HttpStatus.OK);
    }

    @GetMapping("/demo/{id}")
    public ResponseEntity<DemoDto>findById(@PathVariable(value= "id") Long id) {
        return new ResponseEntity<>(
                demoMapper.modelToDto(demoRepository.findById(id).get()), HttpStatus.OK);
    }

//delete by id
    @DeleteMapping("/demo/{id}")
    public ResponseEntity<Void>deleteById(@PathVariable(value= "id") Long id) {
    DemoDto demoDto = demoMapper.modelToDto(demoRepository.findById(id).get());
    demoRepository.deleteById(demoDto.getId());
    return new ResponseEntity<>( HttpStatus.NO_CONTENT);
    }



}
