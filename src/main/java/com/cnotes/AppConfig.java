package com.cnotes;

import com.mongodb.Mongo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoClientFactoryBean;

import java.net.UnknownHostException;

/**
 * Created by trimup on 2017/1/22.
 */
@Configuration
public class AppConfig {

    /*
   * Use the standard Mongo driver API to create a com.mongodb.Mongo instance.
   */
    public @Bean Mongo mongo() throws UnknownHostException {
        return new Mongo("192.168.1.232");
    }
}
