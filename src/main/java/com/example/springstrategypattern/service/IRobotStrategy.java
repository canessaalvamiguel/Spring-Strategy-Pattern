package com.example.springstrategypattern.service;

public interface IRobotStrategy {
    RobotType getType();
    String getWayToMove();
}
