package org.example.test2.ques5;

public interface Team {
    public String getMascot();
    public void addRunner(String runner, double time);
    public void substituteRunner(String oldRunner, String newRunner, double newTime);
    public String getFastestRunner();
    public double getAverageTime();
    public boolean hasFasterAverage(Team other);
    public String toString();
}