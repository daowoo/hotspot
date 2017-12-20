package com.daowoo.hotspot.controller;

import com.daowoo.hotspot.domain.CarToPhone;
import com.daowoo.hotspot.repos.CarToPhoneRepository;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@RestController
public class CarToPhoneController {
    @Autowired
    CarToPhoneRepository carToPhoneRepository;

    @RequestMapping(value = "/search/car2phone", method = RequestMethod.POST)
    public List<CarToPhone> getCarToPhone(@RequestBody String payload) {
        List<CarToPhone> res = new ArrayList<>();
        HashMap<String,String> map = new Gson().fromJson(payload, new TypeToken<HashMap<String, String>>(){}.getType());
        carToPhoneRepository.findCarToPhonesByPlateNumber(map.get("plate_number")).forEach(e -> res.add(e));

        return res;
    }

}
