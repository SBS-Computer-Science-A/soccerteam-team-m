public class SoccerTeam {//Object class for SoccerTeam
    public int wins;
    public int loss;
    public int ties;
    public int score;
    private static int totalGame = 0;//individual team's game played
    private static int totalGoal = 0;//individual team's goal number
    public SoccerTeam(){//constructor of SoccerTeam
        wins = 0;
        loss = 0;
        ties = 0;
        score = 0;
    }
    public void played(SoccerTeam other, int myScore, int otherScore){//update wins, loss, ties based on scores
        totalGame++;
        totalGoal+=(myScore+otherScore);
        this.score = myScore;
        other.score = otherScore;
        if(this.score > other.score){
            this.wins++;
            other.loss++;
        }
        else if(this.score == other.score){
            this.ties++;
            other.ties++;
        }
        else{
            this.loss++;
            other.wins++;
        }
    }
    public int Calculate(){
        return (wins*3+ties);
    }//calculate team score based on wins, loss, ties
    public void reset(){//reset a team's wins, loss, ties
        this.wins = 0;
        this.loss = 0;
        this.ties = 0;
    }
    public void start(){//start a tournament, which reset one team's totalGame and totalGoal
        totalGame = 0;
        totalGoal = 0;
        this.reset();
    }
    public static int getTotalGame(){
        return totalGame;
    }//accessor method for totalGame
    public static int getTotalGoal(){
        return totalGoal;
    }//accessor method for total Goal
}
