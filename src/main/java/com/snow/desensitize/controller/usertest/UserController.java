package com.snow.desensitize.controller.usertest;


import com.alibaba.fastjson.JSON;
import com.snow.desensitize.entity.usertest.NoModelWriteData;
import com.snow.desensitize.entity.usertest.SimpleWriteData;
import com.snow.desensitize.entity.usertest.User;
import com.snow.desensitize.service.usertest.UserService;
import com.snow.desensitize.util.EasyExcelUtils;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author lx
 * @since 2021-04-29
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @ApiOperation("用户查询接口")
    @RequestMapping("getUser/{id}")
    public User GetUser(@PathVariable int id){
        return userService.Sel(id);
    }

    @ApiOperation("用户查询接口")
    @RequestMapping("export")
    public void export(HttpServletResponse response) throws IOException {
        SimpleWriteData d = new SimpleWriteData();
        d.setFileName("账单流水");
        d.setDataList(userService.list());
        EasyExcelUtils easyExcelUtils = new EasyExcelUtils();
        easyExcelUtils.simpleWrite(d,User.class,response);
    }

    @ApiOperation("用户查询接口")
    @RequestMapping("export2")
    public void export2(HttpServletResponse response) throws IOException {
        String[] headMap = {"编码", "用户", "密码", "真名"};
        String[] dataStrMap = {"id", "userName", "passWord", "realName"};
        List<User> list = userService.list();
        List<Map<String, Object>> relist = new ArrayList<>();
        for (User u:list) {
            Map<String, Object> map = JSON.parseObject(JSON.toJSONString(u),Map.class);
            relist.add(map);
        }
        NoModelWriteData d = new NoModelWriteData();
        d.setFileName("账单流水");
        d.setHeadMap(headMap);
        d.setDataStrMap(dataStrMap);
        d.setDataList(relist);
        EasyExcelUtils easyExcelUtils = new EasyExcelUtils();
        easyExcelUtils.noModleWrite(d, response);
    }


}

