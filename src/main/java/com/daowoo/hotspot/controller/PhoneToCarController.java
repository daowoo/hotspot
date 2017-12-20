package com.daowoo.hotspot.controller;

import com.daowoo.hotspot.domain.PhoneToCar;
import com.daowoo.hotspot.repos.PhoneToCarRepository;
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
public class PhoneToCarController {
    @Autowired
    PhoneToCarRepository phoneToCarRepository;

    @RequestMapping(value = "/search/phone2car", method = RequestMethod.POST)
    public List<PhoneToCar> getPhoneToCar(@RequestBody String payload) {
        List<PhoneToCar> res = new ArrayList<>();
        HashMap<String,String> map = new Gson().fromJson(payload, new TypeToken<HashMap<String, String>>(){}.getType());
        phoneToCarRepository.findPhoneToCarsByPhoneNumber(Long.parseLong(map.get("phone_number"))).forEach(e->res.add(e));
        return res;
    }

}
