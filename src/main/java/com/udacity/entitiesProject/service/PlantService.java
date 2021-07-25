package com.udacity.entitiesProject.service;

import com.udacity.entitiesProject.entity.Plant;
import org.springframework.stereotype.Service;

@Service
public class PlantService {
    public Plant getPlantByName(String name){
        return new Plant();
    }
}
