package com.mballem.demoajax;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mballem.demoajax.domain.SocialMetaTag;
import com.mballem.demoajax.service.SocialMetaTagService;

@SpringBootApplication
public class DemoAjaxApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DemoAjaxApplication.class, args);
	}
	
	@Autowired
	SocialMetaTagService service;

	@Override
	public void run(String... args) throws Exception {
		SocialMetaTag tag = service.getSocialMetaTagByUrl("https://www.nuuvem.com/br-pt/item/lego-star-wars-the-skywalker-saga");
		System.out.println(tag.toString());
		
//		("https://www.nuuvem.com/br-pt/item/lego-star-wars-the-skywalker-saga");
//     ("https://www.boticario.com.br/combo-presente-dia-dos-namorados-egeo-dolce-desodorante-colonia-90ml-desodorante-aerossol-75g/");
		
	}
	

	
	
}
