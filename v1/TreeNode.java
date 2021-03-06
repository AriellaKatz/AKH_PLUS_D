/*
AKH+D: Hugo Jenkins, Ariella Katz, Kaitlin Ho, Boary, Tom, Apple
APCS pd6
FP -- Are You a Player?
2022-05-26
*/

import java.util.ArrayList;

public abstract class TreeNode {

  protected ArrayList<TreeNode> _children;
  protected String _action;
  protected int _likeChange;
  protected Character _character;

  //constructor (doesn't actually work, but can be used as a prototype for
  //subclass constructors)
  protected TreeNode() {
    ArrayList<TreeNode> children = new ArrayList<TreeNode>();
    _children = _children;
    _action = "";
    _likeChange = 0;
    _character = null;
  }

  //abstract interaction method; coded individually for each node
  public abstract void interact();

  //provides description of the action corresponding to this node
  public String getAction() {
    return _action;
  }

  //changes corresponding character's attraction stat by specified amount
  //corresponding to this node's action
  public int updateAttraction() {
    int oldAttraction = _character.getAttraction();
    _character.changeAttraction(_likeChange);
    updateStatus(oldAttraction);
    return oldAttraction;
  }

  //updates corresponding character's status stat based on updated attraction
  //stat
  // currently assumes that you can't skip levels
  public String updateStatus(int oldAttraction) {
    int a = _character.getAttraction();
    if (a < 0) {
      System.out.println("IT'S OVER");
      _character.setOver(true);
    }
    else if (oldAttraction <= 25 && a > 25 && a < 50) {
      _character.changeStatus();
    }
    else if (oldAttraction <= 50 && a > 50 && a < 75) {
      _character.changeStatus();
    }
    else if (oldAttraction <= 75 && a > 75 && a < 100){
      _character.changeStatus();
    }
    else if (a > 100){
      _character.changeStatus();
      System.out.println(_character.getName() + "has fallen for you!");
      _character.setFallen(true);
    }
    return _character.getStatus();
  }

}
