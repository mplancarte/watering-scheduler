package com.waterme.wateringscheduler.models.data;

import com.waterme.wateringscheduler.models.PlantType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlantTypeRepository extends CrudRepository<PlantType, Integer> {
}
