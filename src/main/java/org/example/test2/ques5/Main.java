package org.example.test2.ques5;

public class Main {
    public static void main(String[] args) {
        Team team1=new RelayTeam("Sloths");
        team1.addRunner("Simon",40);
        team1.addRunner("Subhash",51);
        team1.substituteRunner("Subhash","Samira",40);

        Team team2 =new RelayTeam("Turtles");
        team2.addRunner("Thuy",45);
        team2.addRunner("Tanya",55);

        System.out.println(team1.getMascot());
        System.out.println(team1.getFastestRunner());
        System.out.println(team2.getAverageTime());
        System.out.println(team1.hasFasterAverage(team2));
        System.out.println(team2.toString());
    }
}
