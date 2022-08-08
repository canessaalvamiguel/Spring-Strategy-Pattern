package com.example.springstrategypattern.controller;

import com.example.springstrategypattern.service.RobotContext;
import com.example.springstrategypattern.service.RobotType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/")
public class RobotController {

    private RobotContext robotContext;

    public RobotController(RobotContext robotContext) {
        this.robotContext = robotContext;
    }

    @GetMapping("robots/{robot_type}/way-to-move")
    public String getWayToMove(@PathVariable("robot_type") RobotType robotType){
        return this.robotContext.retrieveWayToMove(robotType);
    }
}
