package com.kotenko.data.structure;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class TheSets {
    public static void main(String[] args) {
        Set<Ball> balls = new HashSet<>();
        balls.add(new Ball("Blue"));
        balls.add(new Ball("Blue"));
        balls.add(new Ball("Yellow"));
        balls.add(new Ball("Red"));
        balls.remove(new Ball("Red"));
        System.out.println(balls.size());
        balls.forEach(System.out::println);
    }

    static class Ball {
        private String color;

        public Ball(String color) {
            this.color = color;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Ball ball = (Ball) o;
            return Objects.equals(color, ball.color);
        }

        @Override
        public int hashCode() {
            return Objects.hash(color);
        }

        @Override
        public String toString() {
            return "Ball{" +
                    "color='" + color + '\'' +
                    '}';
        }
    }
//    record Ball(String color){}
}
