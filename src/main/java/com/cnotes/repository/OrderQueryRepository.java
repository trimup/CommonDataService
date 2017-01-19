package com.cnotes.repository;

import com.cnotes.domain.OrderQueryBean;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;


/**
 * Created by trimup on 2017/1/18.
 */
public interface OrderQueryRepository extends MongoRepository<OrderQueryBean, Long> {

    OrderQueryBean insert(OrderQueryBean queryBean);

}
