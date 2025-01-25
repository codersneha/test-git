package org.example.test2.ques5;

public interface Team {
    String getMascot();
    void addRunner(String runner, double time);
    void substituteRunner(String oldRunner, String newRunner, double newTime);
    String getFastestRunner();
    double getAverageTime();
    boolean hasFasterAverage(Team other);
    String toString();
}