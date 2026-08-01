package org.example;

public class FitnessChallenge {
    private String participantName;
    private int weeklyStepGoal;
    private int stepsTaken;
    private int workoutCompleted;

    public FitnessChallenge(String participantName, int weeklyStepGoal) {
        this.participantName = participantName;
        this.weeklyStepGoal = weeklyStepGoal;
        this.stepsTaken = 0;
    }
    public void addSteps(int steps) {

    }
    public void recordWorkout() {

    }
    public int stepsRemaining() {

        return 0;
    }
    public boolean goalReached() {

        return false;
    }

    public String getSummary() {
        return "";
    }
}

class Main {
    public static void main(String[] args) {
        FitnessChallenge challenge = new FitnessChallenge("Mina", 8000);

        challenge.addSteps(3200);
        challenge.addSteps(-100);
        challenge.addSteps(5300);
        challenge.recordWorkout();
        challenge.recordWorkout();
        challenge.recordWorkout();

        System.out.println(challenge.stepsRemaining());
        System.out.println(challenge.goalReached());
        System.out.println(challenge.getSummary());
    }
}
