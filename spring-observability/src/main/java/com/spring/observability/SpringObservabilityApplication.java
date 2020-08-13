package com.spring.observability;

import brave.sampler.Sampler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class SpringObservabilityApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringObservabilityApplication.class, args);
	}

	@Bean
	public Sampler defaultSampler() {
		return Sampler.ALWAYS_SAMPLE;
	}

	@Bean
	public RestTemplate restTemplate() {
		HttpComponentsClientHttpRequestFactory httpRequestFactory = new HttpComponentsClientHttpRequestFactory();
		httpRequestFactory.setConnectTimeout(10000);
		httpRequestFactory.setReadTimeout(10000);
		httpRequestFactory.setConnectionRequestTimeout(10000);
		return new RestTemplate(httpRequestFactory);
	}

}
