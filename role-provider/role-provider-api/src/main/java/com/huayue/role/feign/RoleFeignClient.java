package com.huayue.role.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author 西安华越
 */
@FeignClient(name = "role-service",
        url = "http://localhost:9090/role-service",
        path = "/role",
        configuration = RoleFeignClientConfig.class,
        fallback = RoleFeignFallback.class)
public interface RoleFeignClient {

    @RequestMapping(value = "/{roleId}", method = RequestMethod.GET)
    String searchRepo(@PathVariable String roleId);

    /**
     * 容错处理类，当调用失败时，简单返回空字符串
     */
    /*@Component
    public class DefaultFallback implements RoleFeignClient {
        @RequestMapping(value = "/{roleId}", method = RequestMethod.GET)
        @Override
        public String searchRepo(@PathVariable String roleId) {
            return "RoleFeign Server is down!";
        }
    }*/
}
