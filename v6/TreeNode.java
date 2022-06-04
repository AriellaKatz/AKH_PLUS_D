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
  protected ArrayList<Integer> _childrenLikeChanges;
  protected Character _character;

  //constructor (doesn't actually work, but can be used as a prototype for
  //subclass constructors)
  protected TreeNode() {
    _children = new ArrayList<TreeNode>();
    _childrenLikeChange = new ArrayList<Integer>();
    _character = null;
  }

  //abstract interaction method; coded individually for each node
  public abstract void interact();


  //returns the "base" like change resulting from getting to this node
  // if there are multiple options for getting to this node with different
  // likeChanges, this will be reflected in the interact() method of the parent
  // node, when additional likeChange is subtracted or added manually if the
  // user chooses a certain option
  public ArrayList<Integer> getChildrenLikeChanges() {
    return _childrenLikeChanges;
  }

  public ArrayList<TreeNode> getChildren() {
    return _children;
  }

}
