/*
AKH+D: Hugo Jenkins, Ariella Katz, Kaitlin Ho, Boary, Tom, Apple
APCS pd6
FP -- Are You a Player?
2022-05-30
*/
import java.util.ArrayList;
import java.util.Stack;

public class Jessica extends Charactar{

  public Jessica(Player player, int startingAttraction) {
    super(player, startingAttraction);
    _attraction = 0;
    _descrip = "flirty and fickle";
    _name = "Jessica";
    _stage1.add(new JS1s1c1(this, player));
    _stage1.add(new JS1s2c1(this, player));
    _stage2.add(new JS2s1c1(this, player));
    _stage2.add(new JS2s2c1(this, player));
    _stage3.add(new JS3s1c1(this, player));
    _currentStage = _stage1;
    _x = 25;
    _y = 60;
  }

}
