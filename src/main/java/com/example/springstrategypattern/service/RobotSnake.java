package com.example.springstrategypattern.service;

import org.springframework.stereotype.Component;

@Component
public class RobotSnake implements IRobotStrategy{
    @Override
    public RobotType getType() {
        return RobotType.SNAKE;
    }

    @Override
    public String getWayToMove() {
        return "Crawl";
    }
}
