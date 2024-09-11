package in.codegrind.lld.techgranth.problem1.snakeandladder;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Player {

    private int id;
    private String playerName;

    Player(String playerName , int id ){
        this.id = id;
        this.playerName = playerName;
    }
}
