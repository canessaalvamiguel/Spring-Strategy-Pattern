package com.example.springstrategypattern.service;

import java.util.Arrays;

public enum RobotType {
    SNAKE, KANGAROO, HUMANOID;

    public static boolean exists( RobotType type){
        return Arrays.stream(RobotType.values()).anyMatch(type::equals);
    }
}
