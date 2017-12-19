package com.daowoo.hotspot.repos;

import com.daowoo.hotspot.domain.Station;
import org.springframework.data.repository.CrudRepository;

public interface StationRepository extends CrudRepository<Station, Long> {
    Iterable<Station> findStationByCity(String city);


}
