package org.example;

public class TicketBooth {
    private String teamName;
    private int ticketGoal;
    private int ticketsSold;

    public TicketBooth(String teamName, int ticketGoal) {
        this.teamName = teamName;
        this.ticketGoal = ticketGoal;
        this.ticketsSold = 0;
    }

    public void sellTickets(int numberOfTickets) {
        this.ticketsSold += numberOfTickets;
    }

    public int getTicketsSold() {
        return this.ticketsSold;
    }

    public boolean reachedGoal() {
        return ticketsSold >= ticketGoal;
    }

    public String getSummary() {
        return teamName + ": " + ticketsSold + " / " + ticketGoal + " tickets sold";
    }
}

 class Main {
    public static void main(String[] args) {
        TicketBooth booth = new TicketBooth("Lions FC", 30);

        booth.sellTickets(15);
        booth.sellTickets(20);

        System.out.println(booth.getTicketsSold());
        System.out.println(booth.reachedGoal());
        System.out.println(booth.getSummary());
    }
}
