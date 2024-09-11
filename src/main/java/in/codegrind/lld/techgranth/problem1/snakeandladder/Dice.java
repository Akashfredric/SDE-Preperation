package in.codegrind.lld.techgranth.problem1.snakeandladder;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
public class Dice {

    private int numberOfDice;

    Dice(int numberOfDice){
        this.numberOfDice = numberOfDice;
    }

    int rollDice(){
        return (int) (Math.random()*( 6*numberOfDice-1*numberOfDice) +1);
    }
}
