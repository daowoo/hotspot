package com.daowoo.hotspot.controller;

import com.daowoo.hotspot.domain.Station;
import com.daowoo.hotspot.repos.StationRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/station")
public class StationController {


    @Autowired
    StationRepository stationRepository;

    @RequestMapping(value="/list")
    public List<Station> getStationByCity() {
        List<Station> result = new ArrayList<>();
        stationRepository.findStationByCity("天津").forEach(e ->result.add(e));
        return result;

    }

    ObjectMapper mapper = new ObjectMapper();
    @RequestMapping(value="/process", method = RequestMethod.POST)
    public void processJson(@RequestBody String payload) {
        try {
            Station s = mapper.readValue(payload, Station.class);
            stationRepository.save(s);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
