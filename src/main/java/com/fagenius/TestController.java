package com.fagenius;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/monitor")
    public String minitor(){
        try{
            boolean condition = true;
            while (condition){
                Runnable r = () ->{
                    while (true){

                    }
                };
                new Thread(r).start();
                Thread.sleep(5000);
            }
        }catch (Exception e){

        }
        return "Monitoring spring boot application by Ngor Seck";
    }
}
