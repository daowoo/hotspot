package com.daowoo.hotspot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HotspotApplication {
/*
	@Bean
	InitializingBean seedDatabase(SiteRepository repository) {
		return ()-> {
			repository.save(new Site("王二淀", "武清区", "天津", 39.160, 116.900));
			repository.save(new Site("黄花店", "武清区", "天津", 39.370, 116.906));
		};
	}*/


	public static void main(String[] args) {
		SpringApplication.run(HotspotApplication.class, args);
	}

}
