package com.example.springstrategypattern.service;

import org.springframework.stereotype.Component;

@Component
public class RobotKangaroo implements IRobotStrategy{
    @Override
    public RobotType getType() {
        return RobotType.KANGAROO;
    }

    @Override
    public String getWayToMove() {
        return "Jumping";
    }
}
