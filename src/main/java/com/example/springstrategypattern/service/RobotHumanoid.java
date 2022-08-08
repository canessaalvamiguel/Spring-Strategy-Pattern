package com.example.springstrategypattern.service;

import org.springframework.stereotype.Component;

@Component
public class RobotHumanoid implements IRobotStrategy{

    @Override
    public RobotType getType() {
        return RobotType.HUMANOID;
    }

    @Override
    public String getWayToMove() {
        return "Walking";
    }
}
