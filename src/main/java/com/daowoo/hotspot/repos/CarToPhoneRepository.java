package com.daowoo.hotspot.repos;

import com.daowoo.hotspot.domain.CarToPhone;
import org.springframework.data.repository.CrudRepository;

public interface CarToPhoneRepository extends CrudRepository<CarToPhone, Long>{
    Iterable<CarToPhone> findCarToPhonesByPlateNumber(String plateNumber);
}
