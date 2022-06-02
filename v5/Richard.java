/*
AKH+D: Hugo Jenkins, Ariella Katz, Kaitlin Ho, Boary, Tom, Apple
APCS pd6
FP -- Are You a Player?
2022-05-30
*/
import java.util.ArrayList;
import java.util.Stack;

public class Richard extends Character{

  public Richard() {
    super();
    _attraction = 0;
    //_head = null;
    _descrip = "SU president";
    _name = "Richard";
  }

  public Richard(int attraction) {
    this();
    _attraction = attraction;
  }

}
