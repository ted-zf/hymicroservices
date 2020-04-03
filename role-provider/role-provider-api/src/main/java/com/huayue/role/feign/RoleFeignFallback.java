package com.huayue.role.feign;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author 西安华越
 */
@Component
public class RoleFeignFallback implements RoleFeignClient{
    @RequestMapping(value = "/{roleId}", method = RequestMethod.GET)
    @Override
    public String searchRepo(@PathVariable String roleId) {
        return "服务异常！";
    }
}
