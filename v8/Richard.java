/*
AKH+D: Hugo Jenkins, Ariella Katz, Kaitlin Ho, Boary, Tom, Apple
APCS pd6
FP -- Are You a Player?
2022-05-30
*/
import java.util.ArrayList;
import java.util.Stack;

public class Richard extends Charactar{

  public Richard(Player player) {
    super(player);
    _attraction = 0;
    _stage1.add(new R01(this));
    _descrip = "SU president";
    _name = "Richard";
    _isRichard = true;
  }

  public Richard(int attraction, Player player) {
    this(player);
    _attraction = attraction;
    if (_attraction < 0) {
      _over = true;
    }
  }

}
