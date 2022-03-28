package com.example.es;

import com.expertEngine.TestprojectAppraiserJava;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/solution")
public class Controller {
    @CrossOrigin(origins = "http://localhost:8080")
    @GetMapping("/mamdani")
    @ResponseBody
    public String getSolutionMamdani(@RequestParam("budget") String budget, @RequestParam("devNum") String devNum, @RequestParam("devTime") String devTime) {

        return Double.toString(TestprojectAppraiserJava.solutionMamdani(Integer.parseInt(budget), Integer.parseInt(devNum), Integer.parseInt(devTime)));
    }
    @CrossOrigin(origins = "http://localhost:8080")
    @GetMapping("/larsen")
    @ResponseBody
    public String getSolutionLarsen(@RequestParam("budget") String budget, @RequestParam("devNum") String devNum, @RequestParam("devTime") String devTime) {

        return Double.toString(TestprojectAppraiserJava.solutionLarsen(Integer.parseInt(budget), Integer.parseInt(devNum), Integer.parseInt(devTime)));
    }
}
