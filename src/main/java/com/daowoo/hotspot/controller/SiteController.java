package com.daowoo.hotspot.controller;

import com.daowoo.hotspot.domain.Site;
import com.daowoo.hotspot.repos.SiteRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
public class SiteController {


    @Autowired
    SiteRepository siteRepository;

    @RequestMapping(value="/site_list")
    public List<Site> getSites() {
        List<Site> result = new ArrayList<>();
        siteRepository.findAll().forEach(e->result.add(e));
        return result;
    }


    ObjectMapper mapper = new ObjectMapper();
    @RequestMapping(value="/add_site", method = RequestMethod.POST)
    public void processJson(@RequestBody String payload) {
        try {
            Site s = mapper.readValue(payload, Site.class);
            siteRepository.save(s);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
