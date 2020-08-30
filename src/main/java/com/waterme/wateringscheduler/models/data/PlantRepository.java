package com.waterme.wateringscheduler.models.data;

import com.waterme.wateringscheduler.models.Plant;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlantRepository extends CrudRepository <Plant, Integer> {
}
