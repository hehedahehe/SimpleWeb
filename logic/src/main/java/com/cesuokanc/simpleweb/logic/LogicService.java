package com.cesuokanc.simpleweb.logic;

/*
 * @desc
 * @author lirb
 * @datetime 2018/5/24,11:01
 */
public class LogicService {


    public boolean agreeLoan(Integer age, Integer money){
        if(age>50&&money>2000){
            return false;
        }else{
            return true;
        }
    }
}
