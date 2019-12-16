package com.geekbay.geekbayCommon.constants;

/**
 * MQ 消息队列
 */
public interface MqQueueConstant {
    /**
     * log rabbit队列名称
     */
    String LOG_QUEUE = "log";

    /**
     * 发送短信验证码队列
     */
    String MOBILE_CODE_QUEUE = "mobile_code_queue";

    /**
     * 短信服务状态队列
     */
    String MOBILE_SERVICE_STATUS_CHANGE = "mobile_service_status_change";

    /**
     * 钉钉服务状态队列
     */
    String DINGTALK_SERVICE_STATUS_CHANGE = "dingtalk_service_status_change";

    /**
     * zipkin 队列
     */
    String ZIPKIN_NAME_QUEUE = "zipkin";

    /**
     * 路由配置状态队列
     */
    String ROUTE_CONFIG_CHANGE = "route_config_change";
}
