package com.daowoo.hotspot.controller;


import com.daowoo.hotspot.domain.Car;
import com.daowoo.hotspot.repos.CarRepository;
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
public class CarController {
    @Autowired
    CarRepository carRepository;

    private final SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    @RequestMapping(value = "/filter_cars", method = RequestMethod.POST)
    public List<Car> getCars(@RequestBody String payload) throws ParseException{
        List<Car> result = new ArrayList<>();
        HashMap<String,String> map = new Gson().fromJson(payload, new TypeToken<HashMap<String, String>>(){}.getType());
        String siteName = map.get("site_name");
        Date startTime = format.parse(map.get("start_time"));
        Date endTime = format.parse(map.get("end_time"));
        carRepository.findCarsBySiteNameAndTimeIsBetween(siteName, new Timestamp(startTime.getTime()), new Timestamp(endTime.getTime())).forEach(e -> result.add(e));

        return result;
    }
}
