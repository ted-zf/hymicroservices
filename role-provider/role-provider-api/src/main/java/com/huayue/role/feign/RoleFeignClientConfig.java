package com.huayue.role.feign;

import feign.Logger;
import org.springframework.context.annotation.Bean;

/**
 * @author 西安华越
 */
public class RoleFeignClientConfig {

    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }
}
