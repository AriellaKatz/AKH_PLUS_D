/*
AKH+D: Hugo Jenkins, Ariella Katz, Kaitlin Ho, Boary, Tom, Apple
APCS pd6
FP -- Are You a Player?
2022-05-30
*/
import java.util.ArrayList;
import java.util.Stack;

public class Brad extends Character{

  public Brad() {
    super();
    _attraction = 0;
    //_head = null;
    _descrip = "lax frat bro";
    _name = "Brad";
  }

  public Brad(int attraction) {
    this();
    _attraction = attraction;
  }

}
