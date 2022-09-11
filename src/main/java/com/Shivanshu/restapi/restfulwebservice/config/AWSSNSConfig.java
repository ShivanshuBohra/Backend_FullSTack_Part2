package com.Shivanshu.restapi.restfulwebservice.config;

import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.sns.AmazonSNSClient;
import com.amazonaws.services.sns.AmazonSNSClientBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AWSSNSConfig {

	//Add SecretKey and Access key from amazon security
	//Also Select region from AWS

    public static final String SECRET_KEY = "";
    public static final String ACCESS_KEY = "";

    @Primary
    @Bean
    public AmazonSNSClient getSnsClient() {
        return (AmazonSNSClient) AmazonSNSClientBuilder.standard().withRegion(Regions.US_WEST_2)
                .withCredentials(new AWSStaticCredentialsProvider(new BasicAWSCredentials(ACCESS_KEY,
                        SECRET_KEY)))
                .build();
    }
}