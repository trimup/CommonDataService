package com.cnotes;

/**
 * Created by trimup on 2017/1/22.
 */

import static org.springframework.data.mongodb.core.query.Criteria.where;

import com.cnotes.domain.Person;
import com.mongodb.Mongo;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;


public class MongoApp {
    private static final Log log = LogFactory.getLog(MongoApp.class);


    public static void main(String[] args) throws Exception {

        MongoOperations mongoOps = new MongoTemplate(new Mongo("192.168.1.232"), "test");
        mongoOps.insert(new Person("Joe", 34));

        log.info(mongoOps.findOne(new Query(where("name").is("Joe")), Person.class));

        mongoOps.dropCollection("person");
    }
}
