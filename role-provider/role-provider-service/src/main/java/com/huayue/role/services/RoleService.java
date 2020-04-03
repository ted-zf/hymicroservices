package com.huayue.role.services;

import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author 西安华越
 */
public interface RoleService {
    /**
     * 查询角色
     * @param roleId
     * @return
     */
    String getRoleInfo(String roleId);
}
