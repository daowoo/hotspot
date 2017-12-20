package com.daowoo.hotspot.repos;

import com.daowoo.hotspot.domain.Car;
import org.springframework.data.repository.CrudRepository;

import java.sql.Timestamp;

public interface CarRepository extends CrudRepository<Car, Long>{
    Iterable<Car> findCarsBySiteNameAndTimeIsBetween(String siteName, Timestamp startTime, Timestamp endTime);
}
