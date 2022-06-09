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
  protected Charactar _character;
  protected Player _player;

  //constructor (doesn't actually work, but can be used as a prototype for
  //subclass constructors)
  protected TreeNode(Charactar character, Player player) {
    _children = new ArrayList<TreeNode>();
    _childrenLikeChanges = new ArrayList<Integer>();
    _character = character;
    _player = player;
  }

  //abstract interaction method; coded individually for each node
  public abstract boolean interact();


  //returns the "base" like change resulting from getting to this node
  // if there are multiple options for getting to this node with different
  // likeChanges, this will be reflected in the interact() method of the parent
  // node, when additional likeChange is subtracted or added manually if the
  public ArrayList<Integer> getChildrenLikeChanges() {
    return _childrenLikeChanges;
  }

  public ArrayList<TreeNode> getChildren() {
    return _children;
  }


    //to print stuff so it looks like it's being typed out
    public static void type(String s){
      String punc = ",.?!-";
      for(int i = 0; i < s.length(); i++){
        System.out.print(s.charAt(i));
        if (punc.indexOf(s.charAt(i)) >= 0) {
          delay(200);
        }
        else {
          delay(35);
        }
      }
      System.out.println("");
    }
    // Built in delay
    public static void delay(int milliseconds) {
      long beginTimer = System.currentTimeMillis();
      while (System.currentTimeMillis() - beginTimer < milliseconds) {
        continue;
      }
    }



}
