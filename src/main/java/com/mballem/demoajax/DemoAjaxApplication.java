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
//		SocialMetaTag tag = service.getSocialMetaTagByUrl("https://www.boticario.com.br/combo-presente-dia-dos-namorados-egeo-dolce-desodorante-colonia-90ml-desodorante-aerossol-75g/");
//		System.out.println(tag.toString());
		
//		os 2
//		https://www.nuuvem.com/br-pt/item/lego-star-wars-the-skywalker-saga
//		https://naturalmed.com.br/produto/colagentek-colageno-tipo-ii-60-caps-vitafor/
//		https://www.tudocelular.com/android/noticias/n202976/alerta-de-oferta-poco-x5-5g.html
//		og
//	     https://www.boticario.com.br/combo-presente-dia-dos-namorados-egeo-dolce-desodorante-colonia-90ml-desodorante-aerossol-75g/
//		https://www.mobly.com.br/cadeira-gamer-olympians-hades-preta-e-vermelha-881506.html#a=3|p=43|pn=1|t=campanha-20230530-nym6qyg|b=1|s=0
//		tw
//		https://www.mobly.com.br/sofa-3-lugares-retratil-e-reclinavel-biarritz-suede-grafite-664194.html?origin=jetmobly		
//		nenhum
//		https://www.udemy.com/course/spring-boot-mvc-com-thymeleaf/    //ops algo deu errado 500
//		https://www.americanas.com.br/produto/2520110545?chave=hm_megaoferta_1_160623_2520110545&offerId=5fc2b70c762ff3671956670c   //nenhum variavel encontrada  403
//		https://www.udemy.com/course/java-curso-completo/   //ops algo erro 500 
//		https://shopee.com.br/Alicate-Inser%C3%A7%C3%A3o-Punch-Down-Rj11-Rj12-Push-Redes-Patch-Panel-i.393140570.19760203015?sp_atk=12a24d74-4091-4dd2-ac5f-33911e4fab8f&xptdk=12a24d74-4091-4dd2-ac5f-33911e4fab8f
	}
	

		
	
}
