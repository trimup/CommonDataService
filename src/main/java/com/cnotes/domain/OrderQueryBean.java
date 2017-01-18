package com.cnotes.domain;

import lombok.Data;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by trimup on 2016/11/28.
 *
 */
@Data
public class OrderQueryBean {


    private static final SimpleDateFormat Format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    private long id;//订单ID
    private String  order_type;//订单类型
    private String prodName;// 项目名称
    private String normal_rate;//年化收益
    private String user;// 用户姓名
    private String phone;// 手机号
    private String  user_logo;//用户标识
    private String prodStatus;// 项目状态
    private String money;// 订单金额
    private String real_order_money;//订单实际金额
    private String order_status;// 订单状态
    private String referrer = "";//推荐人
    private String father_referrer =""; //父级推荐人
    private Date payTime ;// 订单确认时间
    private int orderNum;//订单笔数
    private boolean invest = false;//是否首投
    private boolean coupon_number; //加息券券码




}
