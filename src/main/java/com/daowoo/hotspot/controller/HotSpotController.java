package com.daowoo.hotspot.controller;

import com.daowoo.hotspot.domain.HotSpot;
import com.daowoo.hotspot.domain.Station;
import com.daowoo.hotspot.repos.HotSpotRepository;
import com.daowoo.hotspot.repos.StationRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import java.util.List;

@RestController
@RequestMapping("/hotspot")
public class HotSpotController {


    @Autowired
    HotSpotRepository hotSpotRepository;

    @RequestMapping(value="/list")
    public List<HotSpot> getHotSpotByCity() {
        List<HotSpot> result = new ArrayList<>();
        hotSpotRepository.findAll().forEach(e ->result.add(e));
        return result;

    }

    private final SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

    @RequestMapping(value="/search/findHotSpotByLocationAndTime")
    public List<HotSpot> getHotSpotByLocationAndTime() throws ParseException{
        List<HotSpot> res = new ArrayList<>();
        hotSpotRepository.findHotSpotsByLocationAndCollectTimeIsBetween("王二淀", format.parse("2016-01-02"), format.parse("2016-01-04"))
                .forEach(e -> res.add(e));
        return res;
    }
}
