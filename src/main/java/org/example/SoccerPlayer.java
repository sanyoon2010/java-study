package org.example;

public class SoccerPlayer {
    String name;
    Double height;
    String nationality;

    public SoccerPlayer(String name, Double height, String nationality) {
        this.name = name;
        this.height = height;
        this.nationality = nationality;
    }

    void pass (SoccerPlayer player) {
        System.out.println(this.name + " passed to " + player.name);
    }

    void shoot (int speed) {
        System.out.println(this.name + " thuderbolts one toward goal");
    }

    public static void main(String[] args) {
        SoccerPlayer son = new SoccerPlayer("Son", 183.0, "South Korea");
        SoccerPlayer messi = new SoccerPlayer("Messi",170.0, "Argentina");
        SoccerPlayer ronaldo = new SoccerPlayer("Ronaldo",187.0, "Portugal");

        ronaldo.pass(messi);
        messi.pass(son);
        son.shoot(30);
    }
}
