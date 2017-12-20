package com.daowoo.hotspot.repos;

import com.daowoo.hotspot.domain.PhoneToCar;
import org.springframework.data.repository.CrudRepository;

public interface PhoneToCarRepository extends CrudRepository<PhoneToCar, Long>{
    Iterable<PhoneToCar> findPhoneToCarsByPhoneNumber(long phone_number);
}
