package org.example.test2.ques5;

import java.util.HashMap;
import java.util.Map;

public class RelayTeam implements Team{
    private String mascot;
    private Map<String,Double> runner;

    public RelayTeam(String mascot) {
        this.mascot = mascot;
        this.runner = new HashMap<>();
    }

    @Override
    public String getMascot() {
        return mascot;
    }

    @Override
    public void addRunner(String player,double time) {
        if(runner.containsKey(player)){
            throw new IllegalArgumentException("Runner on team already!");
        }
        if(time<0){
            throw new IllegalArgumentException("Time is negative");
        }
        runner.put(player,time);
    }

    @Override
    public void substituteRunner(String oldRunner, String newRunner, double newTime) {
        if(!runner.containsKey(oldRunner)){
            throw new IllegalArgumentException("Runner is not in the team!");
        }
        if(runner.containsKey(newRunner)){
            throw new IllegalArgumentException("Runner on team already!");
        }
        if(newTime<0){
            throw new IllegalArgumentException("Time is negative");
        }
        runner.put(newRunner,newTime);
    }

    @Override
    public String getFastestRunner() {
        if(runner.isEmpty()){
            throw new IllegalArgumentException("no player on team");
        }
        String faster = "";
        Double fasterTime = 0.0;
        for (Map.Entry<String,Double>entry:runner.entrySet()){
            if (entry.getValue()< fasterTime) {
                faster = entry.getKey();
                fasterTime = entry.getValue();
            } else if(entry.getValue()==fasterTime){

            }

        }

        return faster;
    }

    @Override
    public double getAverageTime() {
        if(runner.isEmpty()){
            return 0.0;
        }
        double sum=0;
        for(Map.Entry<String,Double>entry:runner.entrySet()) {
            sum+=entry.getValue();
        }
        double avg=sum/runner.size();
        return avg;
    }

    @Override
    public boolean hasFasterAverage(Team other) {
        return getAverageTime() > other.getAverageTime();
    }

    @Override
    public String toString() {
        return mascot+"’s average time:"+getAverageTime()+"s";
    }
}
