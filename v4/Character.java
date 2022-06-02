/*
AKH+D: Hugo Jenkins, Ariella Katz, Kaitlin Ho, Boary, Tom, Apple
APCS pd6
FP -- Are You a Player?
2022-05-26
*/

import java.util.*;

public class Character {
  protected boolean _over;
  protected boolean _fallen;
  protected Stack<String> _status;
  protected int _attraction;
  protected int _pendingLikeChange;
  protected ArrayList<TreeNode> _stage1;
  protected ArrayList<TreeNode> _stage2;
  protected ArrayList<TreeNode> _stage3;
  protected String _descrip;
  protected String _name;

  /*
    Woo starts at _stage1[0].
    It goes through this tree until you get to the end of the tree (a null
    node), at which point the tree is removed from _stage1. As you go through
    the tree, the head of the tree has to be continuously updated via the
    updateTree() method, which takes the head you'd like to update the tree with
    (the current tree is always the tree at index 0 in the ArrayList).
    updateTree() returns a boolean stating whether the tree is finished.
    When you get to the end of the tree, Woo checks likeability to see if player
    can move on to the next stage. If they cannot, proceed with deleting the tree
    and the next convo Woo calls will be the new _stage1[0]. Otherwise, Woo will
    move on to the next _stageX, via a series of if else statements checking the
    _status of the Character before calling the next interaction.
    If the player goes through all the convos in a stage without progressing to
    the next one, _isOver = true and the player can no longer proceed with this
    Character.
  */

  public Character() {
    _over = false;
    _fallen = false;
    _status = new Stack<String>();
    // _status.push("<3 <3 <3 <3 <3");
    // _status.push("<3 <3 <3 <3");
    _status.push("<3 <3 <3");
    _status.push("<3 <3");
    _status.push("<3");
    _attraction = 0;
    _pendingLikeChange = 0;
    _stage1 = null;
    _stage2 = null;
    _stage3 = null;
    _descrip = "";
    _name = "";
  }

  public boolean updateTree(TreeNode newHead) {
    //convert _status to an int
    int stat = 0;
    String status = _status.peek();
    while (status.indexOf("<3") != -1) {
      stat ++;
      status = status.substring(status.indexOf("<3") + 2);
    }
    //if you've reached the end of the tree, delete it from the stage
    if (newHead == null) {
      if (stat == 1) {
        changeAttraction(_pendingLikeChange);
        _pendingLikeChange = 0;
        _stage1.remove(0);
        //if you've gotten through the entire stage without progressing, it's over
        if (_stage1.size() == 0) {
          _over = true;
          System.out.println("IT'S OVER.");
        }
      }
      else if (stat == 2) {
        changeAttraction(_pendingLikeChange);
        _pendingLikeChange = 0;
        _stage2.remove(0);
        //if you've gotten through the entire stage, it's over
        if (_stage2.size() == 0) {
          _over = true;
          System.out.println("IT'S OVER.");
        }
      }
      else {
        changeAttraction(_pendingLikeChange);
        _pendingLikeChange = 0;
        _stage3.remove(0);
        //if you've gotten through the entire stage, it's over
        if (_stage3.size() == 0) {
          _over = true;
          System.out.println("IT'S OVER.");
        }
      }
      return true;
    }
    //if you haven't reached the end of the tree, update it so that you're at
    // the head the player chose (newHead)
    else {
      if (stat == 1) {
        _pendingLikeChange += _stage1.get(0).getLikeChange();
        _stage1.set(0, newHead);
      }
      else if (stat == 2) {
        _pendingLikeChange += _stage2.get(0).getLikeChange();
        _stage2.set(0, newHead);
      }
      else {
        _pendingLikeChange += _stage3.get(0).getLikeChange();
        _stage3.set(0, newHead);
      }
      return false;
    }
  }

  // Changes attraction level
  public int changeAttraction(int change) {
    int old = _attraction;
    _attraction += change;
     maintainStatus(old);
    return old;
  }

  // Updates corresponding character's status stat based on updated attraction
  // Stat
  // Currently assumes that you can't skip levels
  public String maintainStatus(int oldAttraction) {
    int a = this._attraction;
    if (a < 0) {
      System.out.println("IT'S OVER");
      this.setOver(true);
    }
    else if (oldAttraction <= 33 && a > 33 && a < 66) {
      this.changeStatus();
    }
    else if (oldAttraction <= 66 && a > 66 && a < 100) {
      this.changeStatus();
    }
    else if (a >= 100){
      this.changeStatus();
      System.out.println(this._name + "has fallen for you!");
      this.setFallen(true);
    }
    return this.getStatus();
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
