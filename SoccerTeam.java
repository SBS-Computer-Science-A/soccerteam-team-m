public class SoccerTeam {
    public int wins;
    public int loss;
    public int ties;
    public int score;
    public int totalGame = 0;
    public int totalGoal = 0;
    public SoccerTeam(){
        this.wins = 0;
        this.loss = 0;
        this.ties = 0;
        this. score = 0;
    }
    public void played(SoccerTeam other, int myScore, int otherScore){
        this.totalGame++;
        this.totalGoal+=(myScore+otherScore);
        myScore = this.score;
        otherScore = other.score;
        if(myScore > otherScore){
            this.wins++;
            other.loss++;
        }
        else if(myScore == otherScore){
            this.ties++;
            other.ties++;
        }
        else{
            this.loss++;
            other.wins++;
        }
    }
    public int Calculate(SoccerTeam current){
        return current.wins*3+current.ties;
    }
    public void reset(SoccerTeam current){
        current.wins = 0;
        current.loss = 0;
        current.ties = 0;
    }
    public void start(){
        this.totalGame = 0;
        this.totalGoal = 0;
        this.reset(this);
    }
    public int gettotalGame(){
        return this.totalGame;
    }
    public int getTotalGoal(){
        return this.totalGoal;
    }
}
