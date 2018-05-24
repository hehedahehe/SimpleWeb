package com.cesuokanc.simpleweb.rest.controller;

import com.cesuokanc.simpleweb.logic.LogicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    @GetMapping(value = "/pass")
    public boolean getPermission(Integer age, Integer loanMoney){
        return logicService.agreeLoan(age,loanMoney);
    }


}
