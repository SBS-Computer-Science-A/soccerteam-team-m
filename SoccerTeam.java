public class SoccerTeam {//Object class for SoccerTeam
    public static int wins;
    public static int loss;
    public static int ties;
    public static int score;
    private int totalGame;//individual team's game played
    private int totalGoal;//individual team's goal number
    public SoccerTeam(){//constructor of SoccerTeam
        wins = 0;
        loss = 0;
        ties = 0;
        score = 0;
        totalGame = 0;
        totalGoal = 0;
    }
    public void played(SoccerTeam other, int myScore, int otherScore){//update wins, loss, ties based on scores
        this.totalGame++;
        this.totalGoal+=myScore;
        other.totalGoal+=otherScore;
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
        this.totalGame = 0;
        this.totalGoal = 0;
        this.reset();
    }
    public int getTotalGame(){
        return this.totalGame;
    }//accessor method for totalGame
    public int getTotalGoal(){
        return this.totalGoal;
    }//accessor method for total Goal
}
