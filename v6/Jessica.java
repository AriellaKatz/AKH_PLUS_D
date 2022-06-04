/*
AKH+D: Hugo Jenkins, Ariella Katz, Kaitlin Ho, Boary, Tom, Apple
APCS pd6
FP -- Are You a Player?
2022-05-30
*/
import java.util.ArrayList;
import java.util.Stack;

public class Jessica extends Character{

  public Jessica() {
    super();
    _attraction = 0;
    _descrip = "flirty and fickle";
    _name = "Jessica";
  }

  public Jessica(int attraction) {
    this();
    _attraction = attraction;
    if (_attraction < 0) {
      _over = true;
    }
  }

}
