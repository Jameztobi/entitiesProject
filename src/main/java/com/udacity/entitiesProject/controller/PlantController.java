package com.udacity.entitiesProject.controller;

import com.udacity.entitiesProject.entity.Plant;
import com.udacity.entitiesProject.entity.PlantDTO;
import com.udacity.entitiesProject.service.PlantService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/plant")
public class PlantController {

    @Autowired
    private PlantService plantService;

    public PlantDTO getPlantDTO(String name){
        Plant plant = plantService.getPlantByName(name);
        return convertEntityToPlantDTO(plant);

    }

    public Plant getFilteredPlant(String name){
        return plantService.getPlantByName(name);
    }

    private static PlantDTO convertEntityToPlantDTO(Plant plant){
        PlantDTO plantDTO = new PlantDTO();
        BeanUtils.copyProperties(plantDTO, plant);
        return plantDTO;
    }

    private static Plant convertEntityToPlantDTO(PlantDTO plantDTO){
        Plant plant = new Plant();
        BeanUtils.copyProperties(plant, plantDTO);
        return plant;
    }
}
