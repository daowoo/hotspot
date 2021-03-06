package com.daowoo.hotspot.controller;

import com.daowoo.hotspot.domain.HotSpot;
import com.daowoo.hotspot.repos.HotSpotRepository;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

@RestController
public class HotSpotController {


    @Autowired
    HotSpotRepository hotSpotRepository;

    @RequestMapping(value="/list_phones")
    public List<HotSpot> getHotSpotByCity() {
        List<HotSpot> result = new ArrayList<>();
        hotSpotRepository.findAll().forEach(e ->result.add(e));
        return result;

    }

    private final SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    @RequestMapping(value="/filter_phones", method = RequestMethod.POST)
    public List<HotSpot> getHotSpotByLocationAndTime(@RequestBody String payload) throws ParseException{
        List<HotSpot> res = new ArrayList<>();
        HashMap<String,String> map = new Gson().fromJson(payload, new TypeToken<HashMap<String, String>>(){}.getType());
        String siteName = map.get("site_name");
        Date startTime = format.parse(map.get("start_time"));
        Date endTime = format.parse(map.get("end_time"));
        hotSpotRepository.findHotSpotsBySiteNameAndTimeBetween(siteName, new Timestamp(startTime.getTime()), new Timestamp(endTime.getTime()))
                .forEach(e -> res.add(e));
        return res;
    }
}
