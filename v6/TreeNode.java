/*
AKH+D: Hugo Jenkins, Ariella Katz, Kaitlin Ho, Boary, Tom, Apple
APCS pd6
FP -- Are You a Player?
2022-05-26
*/

import java.util.ArrayList;
import java.io.*;

public abstract class TreeNode {

  protected ArrayList<TreeNode> _children;
  protected int _likeChange;
  protected Character _character;

  //constructor (doesn't actually work, but can be used as a prototype for
  //subclass constructors)
  protected TreeNode() {
    _children = new ArrayList<TreeNode>();
    _likeChange = 0;
    _character = null;
  }

  //abstract interaction method; coded individually for each node
  public abstract void interact();


  //changes corresponding character's attraction stat by specified amount
  //corresponding to this node's action
  public int getLikeChange() {
    return _likeChange;
  }

  public ArrayList<TreeNode> getChildren() {
    return _children;
  }

  //updates corresponding character's status stat based on updated attraction
  //stat
  // currently assumes that you can't skip levels
  // public String updateStatus(int oldAttraction) {
  //   int a = _character.getAttraction();
  //   if (a < 0) {
  //     System.out.println("IT'S OVER");
  //     _character.setOver(true);
  //   }
  //   else if (oldAttraction <= 25 && a > 25 && a < 50) {
  //     _character.changeStatus();
  //   }
  //   else if (oldAttraction <= 50 && a > 50 && a < 75) {
  //     _character.changeStatus();
  //   }
  //   else if (oldAttraction <= 75 && a > 75 && a < 100){
  //     _character.changeStatus();
  //   }
  //   else if (a > 100){
  //     _character.changeStatus();
  //     System.out.println(_character.getName() + "has fallen for you!");
  //     _character.setFallen(true);
  //   }
  //   return _character.getStatus();
  // }

}
