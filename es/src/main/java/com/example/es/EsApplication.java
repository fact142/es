package com.example.es;

import com.expertEngine.TestprojectAppraiserJava;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@SpringBootApplication
public class EsApplication {

    public static void main(String[] args) {
        SpringApplication.run(EsApplication.class, args);
    }
    @GetMapping("/api/foos")
    @ResponseBody
    public String getSolution(@RequestParam("budget") String budget, @RequestParam("devNum") String devNum, @RequestParam("devTime") String devTime) {
        return Double.toString(TestprojectAppraiserJava.solutionMamdani(Integer.parseInt(budget), Integer.parseInt(devNum), Integer.parseInt(devTime)));
    }
}
