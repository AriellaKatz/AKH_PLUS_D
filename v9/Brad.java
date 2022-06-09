/*
AKH+D: Hugo Jenkins, Ariella Katz, Kaitlin Ho, Boary, Tom, Apple
APCS pd6
FP -- Are You a Player?
2022-05-30
*/
import java.util.ArrayList;
import java.util.Stack;

//atom://teletype/portal/35bb004f-56e7-4849-9f71-07f6ddda9942

public class Brad extends Charactar{

  public Brad(Player player) {
    super(player);
    _attraction = 0;
    //_head = null;
    _descrip = "lax frat bro";
    _name = "Brad";
    _stage1.add(new BS1s1c1(this, player));
    _stage1.add(new BS1s2c1(this, player));
    _stage2.add(new BS2s1c1(this, player));
    _stage2.add(new BS2s2c1(this, player));
    _stage3.add(new BS3s1c1(this, player));
    _stage3.add(new BS3s2c1(this, player));
    _currentStage = _stage1;
  }

  public Brad(int attraction, Player player) {
    this(player);
    _attraction = attraction;
    if (_attraction < 0) {
      _over = true;
    }
  }

}
