package com.cesuokanc.simpleweb.rest.controller;

import com.cesuokanc.simpleweb.logic.LogicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/*
 * @desc
 * @author lirb
 * @datetime 2018/5/24,10:43
 */
@RestController
@RequestMapping("/demoloan")
public class DemoRestController {

    @Autowired
    LogicService logicService;

    @ResponseBody
    @GetMapping(value = "/pass")
    public Map<String, Object> getPermission(Integer age, Integer loanMoney){

        Map<String, Object> res = new HashMap<>();
        res.put("auditRes",logicService.agreeLoan(age,loanMoney));

        return res;
    }


}
