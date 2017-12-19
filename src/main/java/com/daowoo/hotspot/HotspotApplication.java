package com.daowoo.hotspot;

import com.daowoo.hotspot.domain.Station;
import com.daowoo.hotspot.repos.StationRepository;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class HotspotApplication {
/*
	@Bean
	InitializingBean seedDatabase(StationRepository repository) {
		return ()-> {
			repository.save(new Station("王二淀", "武清区", "天津", 39.160, 116.900));
			repository.save(new Station("黄花店", "武清区", "天津", 39.370, 116.906));
		};
	}*/


	public static void main(String[] args) {
		SpringApplication.run(HotspotApplication.class, args);
	}

}
