package com.sunknowledge.dme.rcm.amazon;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AmazonConfig {
    @Bean
    public AmazonS3 amazonS3(){
        AWSCredentials awsCredentials = new BasicAWSCredentials("AKIAYEE24DWU67WECZ2U", "FdVmGfb1hIlCo+KS+YQdMrFxpaHUIT+gsKh+rxgo");
        return AmazonS3ClientBuilder
            .standard()
            .withRegion("ap-south-1")
            .withCredentials(new AWSStaticCredentialsProvider(awsCredentials))
            .build();
    }
}
