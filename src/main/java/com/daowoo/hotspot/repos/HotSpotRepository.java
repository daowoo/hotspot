package com.daowoo.hotspot.repos;

import com.daowoo.hotspot.domain.HotSpot;
import org.springframework.data.repository.CrudRepository;

import java.sql.Timestamp;
import java.util.Date;


public interface HotSpotRepository extends CrudRepository<HotSpot, Long> {

    Iterable<HotSpot> findHotSpotsBySiteNameAndTimeBetween(String siteName, Timestamp startTime, Timestamp endTime);

}
