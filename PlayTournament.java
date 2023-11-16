public class PlayTournament {//testing class for SoccerTeam
    public static void main(String[] args){
        SoccerTeam team1 = new SoccerTeam();
        SoccerTeam team2 = new SoccerTeam();
        SoccerTeam team3 = new SoccerTeam();
        SoccerTeam team4 = new SoccerTeam();
        //declare 4 teams
        team1.played(team2, 1,0);
        System.out.println(team1.score + " " + team2.score);
        team1.played(team3,3,1);
        team1.played(team4,4,2);
        team2.played(team3,2,3);
        team2.played(team4,5,3);
        team3.played(team4,0,1);
        //make sure each two team played once, scores are manually typed random number
        System.out.println(team1.wins + " " + team1.ties + " " + team1.loss);
        System.out.println("team1: "+ team1.Calculate());
        System.out.println("team2: "+ team2.Calculate());
        System.out.println("team3: "+ team3.Calculate());
        System.out.println("team4: "+ team4.Calculate());
        //print out each team's score based on their result
        System.out.println("total game played: "+ (team1.getTotalGame()+team2.getTotalGame()+team3.getTotalGame()+team4.getTotalGame()));
        System.out.println("total goal get: " + (team1.getTotalGoal()+team2.getTotalGoal()+team3.getTotalGoal()+team4.getTotalGoal()));
        //print out the tournament's statistics
        team1.reset();
        team2.reset();
        team3.reset();
        team4.reset();
        //reset the wins, loss, ties of all teams
        team1.start();
        team2.start();
        team3.start();
        team4.start();
        System.out.println(team1.wins + " " + team1.ties + " " + team1.loss + " " + team1.score);
        //start a new tournament
        team1.played(team2, 0,0);
        team1.played(team3,4,3);
        team1.played(team4,1,2);
        team2.played(team3,7,3);
        team2.played(team4,4,0);
        team3.played(team4,2,3);
        //second tournament, every two teams played again, random scores
        System.out.println("team1: "+ team1.Calculate());
        System.out.println("team2: "+ team2.Calculate());
        System.out.println("team3: "+ team3.Calculate());
        System.out.println("team4: "+ team4.Calculate());
        //test the new score of each team
        System.out.println("total game played: "+ (team1.getTotalGame()+team2.getTotalGame()+team3.getTotalGame()+team4.getTotalGame()));
        System.out.println("total goal get: " + (team1.getTotalGoal()+team2.getTotalGoal()+team3.getTotalGoal()+team4.getTotalGoal()));
        //test the second tournament's result
    }
}
