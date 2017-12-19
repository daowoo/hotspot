package com.daowoo.hotspot.repos;

import com.daowoo.hotspot.domain.HotSpot;
import org.springframework.data.repository.CrudRepository;

import java.util.Date;


public interface HotSpotRepository extends CrudRepository<HotSpot, Long> {

    Iterable<HotSpot> findHotSpotsByLocationAndCollectTimeIsBetween(String location, Date startTime, Date endTime);

}
