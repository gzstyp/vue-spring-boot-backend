package com.fwtai.controller;

import com.fwtai.repository.UseRepository;
import com.fwtai.tool.ToolClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @作者 田应平
 * @版本 v1.0
 * @创建时间 2020-05-03 11:08
 * @QQ号码 444141300
 * @Email service@dwlai.com
 * @官网 http://www.fwtai.com
*/
@RestController
@RequestMapping("/user")
public class UserController{

    @Autowired
    private HttpServletRequest request;

    @Autowired
    private ToolClient client;

    @Autowired
    private UseRepository useRepository;

    // http://127.0.0.1:807/user/all
    @GetMapping(value = "/all")
    public void findAll(){
        String json = client.queryJson(useRepository.findAll());
        client.responseJson(json);
    }
}