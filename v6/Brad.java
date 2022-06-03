/*
AKH+D: Hugo Jenkins, Ariella Katz, Kaitlin Ho, Boary, Tom, Apple
APCS pd6
FP -- Are You a Player?
2022-05-30
*/
import java.util.ArrayList;
import java.util.Stack;

//atom://teletype/portal/35bb004f-56e7-4849-9f71-07f6ddda9942

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
    if (_attraction < 0) {
      _over = true;
    }
  }

}
