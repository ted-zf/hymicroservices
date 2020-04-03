package com.huayue.user.controller;

import com.huayue.beans.dto.ResultDto;
import com.huayue.role.feign.RoleFeignClient;
import com.huayue.user.services.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author 西安华越
 */
@RestController
@Api(tags = "用户")
@AllArgsConstructor
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userServices;
    @Autowired
    private RoleFeignClient roleFeignClient;

    @ApiOperation(value = "获用户信息", notes = "根据url的id来获取用户详细信息")
    @ApiImplicitParam(name = "id", value = "ID", required = true, dataType = "Long", paramType = "path")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public ResultDto getUserInfo(@PathVariable  Long id){
        String s = roleFeignClient.searchRepo(String.valueOf(id));
    return ResultDto.ok(s);
    }
}
