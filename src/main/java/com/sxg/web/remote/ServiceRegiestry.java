package com.sxg.web.remote;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * Created by shaoxiangen 2018/2/5
 */
public class ServiceRegiestry implements BeanPostProcessor {



    @Override
    public Object postProcessBeforeInitialization(Object bean, String s) throws BeansException {
        RemoteService service = bean.getClass().getAnnotation(RemoteService.class);
        if(service != null) {

        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        return null;
    }
}
