package com.huayue.role.services;

import com.huayue.role.feign.RoleFeignClient;
import org.springframework.stereotype.Service;

/**
 * @author 西安华越
 */
@Service
public class RoleServiceImpl implements RoleService {
    @Override
    public String getRoleInfo(String roleId) {
        String str = "feign调用成功";
        return str;
    }
}
