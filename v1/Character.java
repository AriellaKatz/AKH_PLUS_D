/*
AKH+D: Hugo Jenkins, Ariella Katz, Kaitlin Ho, Boary, Tom, Apple
APCS pd6
FP -- Are You a Player?
2022-05-26
*/

import java.util.*;

public class Character {
  private boolean _over;
  private boolean _fallen;
  private Stack<String> _status;
  private int _attraction;
  // private TreeNode _head;
  private String _descrip;
  private String _name;

  public Character() {
    _over = false;
    _fallen = false;
    _status = new Stack<String>();
    _status.push("<3 <3 <3 <3 <3");
    _status.push("<3 <3 <3 <3");
    _status.push("<3 <3 <3");
    _status.push("<3 <3");
    _status.push("<3");
    _attraction = 0;
    //_head = null;
    _descrip = "";
    _name = "";
  }

  // Changes attraction level
  public int changeAttraction(int change) {
    int old = _attraction;
    _attraction += change;
    return old;
  }

  // Changes relationship status
  public String changeStatus() {
    return _status.pop();
  }

  // Accessor for description
  public String getDescrip() {
    return _descrip;
}

  // Accessor for attraction level
  public int getAttraction() {
    return _attraction;
  }

  // Accessor for relationship status
  public String getStatus() {
    return _status.peek();
  }

  // Accessor for _name
  public String getName() {
    return _name;
  }

  // Accessor for _over
  public boolean isOver() {
    return _over;
  }

  // Changes _over
  public boolean setOver(boolean isOver) {
    boolean old = _over;
    _over = isOver;
    return old;
  }

  // Accessor for _fallen
  public boolean hasFallen() {
    return _fallen;
  }

  // Changes _fallen
  public boolean setFallen(boolean hasFallen) {
    boolean old = _fallen;
    _fallen = hasFallen;
    return old;
  }
}
