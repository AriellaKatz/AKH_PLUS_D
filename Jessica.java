/*
AKH+D: Hugo Jenkins, Ariella Katz, Kaitlin Ho, Boary, Tom, Apple
APCS pd6
FP -- Are You a Player?
2022-05-30
*/
import java.util.ArrayList;
import java.util.Stack;

public class Jessica extends Charactar{

  public Jessica() {
    super();
    _attraction = 0;
    _descrip = "flirty and fickle";
    _name = "Jessica";
    _stage1.add(new JS1s1c1(this));
    _stage1.add(new JS1s2c1(this));
    _stage2.add(new JS2s1c1(this));
    _stage2.add(new JS2s2c1(this));
    _stage3.add(new JS3s1c1(this));
    _currentStage = _stage1;
  }

  public Jessica(int attraction) {
    this();
    _attraction = attraction;
    if (_attraction < 0) {
      _over = true;
    }
  }

}
