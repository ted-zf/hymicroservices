package com.huayue.role.controller;

import com.huayue.role.services.RoleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 西安华越
 */
@RestController
@Api(tags = "角色")
@AllArgsConstructor
@RequestMapping("/role")
public class RoleController {
    private RoleService roleService;
    @ApiOperation(value = "获角色信息", notes = "根据url的id来获取角色详细信息")
    @ApiImplicitParam(name = "roleId", value = "roleId", required = true, dataType = "Long", paramType = "path")
    @RequestMapping(value = "/{roleId}", method = RequestMethod.GET)
    public String getRoleInfo(@PathVariable String roleId){
        String  s = roleService.getRoleInfo(roleId);
        return s;
    }
}
