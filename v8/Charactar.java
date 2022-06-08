/*
AKH+D: Hugo Jenkins, Ariella Katz, Kaitlin Ho, Boary, Tom, Apple
APCS pd6
FP -- Are You a Player?
2022-05-26
*/

import java.util.*;

public class Charactar {
  protected boolean _over;
  protected boolean _fallen;
  protected Stack<String> _status;
  protected int _attraction;
  protected int _pendingLikeChange;
  protected ArrayList<TreeNode> _stage1;
  protected ArrayList<TreeNode> _stage2;
  protected ArrayList<TreeNode> _stage3;
  protected ArrayList<TreeNode> _winScene;
  protected ArrayList<TreeNode> _currentStage; //_stage1, _stage2, _stage3, or _winScene
  protected String _descrip;
  protected String _name;

  /*
    Woo starts at _stage1[0].
    It goes through this tree until you get to the end of the tree (a null
    node), at which point the tree is removed from _stage1. As you go through
    the tree, the head of the tree has to be continuously updated via the
    updateTree() method, which takes the index of the head you'd like to update
    the tree with (the current tree is always the tree at index 0 in the
    ArrayList). The index will indicate which of the current node's children to
    point the head at, as well as the corresponding likeChange in the array of
    the node's children's likeChanges. Even if two of the options the player is
    given point at the same child, they may have different corresponding
    likeChanges, so there will be a duplicate child in the array of children and
    different likeChanges at the corresponding indexes in the array of
    likeChanges. updateTree() returns a boolean stating whether the tree is
    finished.
    When you get to the end of the tree, Woo checks likeability to see if player
    can move on to the next stage. If they cannot, proceed with deleting the tree
    and the next convo Woo calls will be the new _stage1[0]. Otherwise, Woo will
    move on to the next _stageX, via a series of if else statements checking the
    _status of the Character before calling the next interaction.
    If the player goes through all the convos in a stage without progressing to
    the next one, _isOver = true and the player can no longer proceed with this
    Character.
  */

  public Charactar() {
    _over = false;
    _fallen = false;
    _status = new Stack<String>();
    // _status.push("<3 <3 <3 <3 <3");
    // _status.push("<3 <3 <3 <3");
    _status.push("WIN SCENE");
    _status.push("<3 <3 <3");
    _status.push("<3 <3");
    _status.push("<3");
    _attraction = 0;
    _pendingLikeChange = 0;
    _stage1 = new ArrayList<TreeNode>();
    _stage2 = new ArrayList<TreeNode>();
    _stage3 = new ArrayList<TreeNode>();
    _winScene = null;
    _currentStage = _stage1;
    _descrip = "";
    _name = "";
  }


  //ACCESSORS ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

  // Accessor for _over
  public boolean isOver() {
    return _over;
  }

  // Accessor for _fallen
  public boolean hasFallen() {
    return _fallen;
  }

  // Accessor for relationship status
  public String getStatus() {
    return _status.peek();
  }

  // Accessor for attraction level
  public int getAttraction() {
    return _attraction;
  }

  // Accessor for _currentStage
  public ArrayList<TreeNode> getStage() {
    return _currentStage;
  }

  // Accessor for description
  public String getDescrip() {
    return _descrip;
  }

  // Accessor for _name
  public String getName() {
    return _name;
  }


  //MUTATORS ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

  // Changes _over
  public boolean setOver(boolean isOver) {
    boolean old = _over;
    _over = isOver;
    return old;
  }

  // Changes _fallen
  public boolean setFallen(boolean hasFallen) {
    boolean old = _fallen;
    _fallen = hasFallen;
    return old;
  }

  // Changes relationship status
  public String changeStatus() {
    String prevStat = _status.pop();
    if (getStatus().equals("<3 <3")) {
      _currentStage = _stage2;
    }
    else if (getStatus().equals("<3 <3 <3")) {
      _currentStage = _stage3;
    }
    else {
      _currentStage = _winScene;
    }
    return prevStat;
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
    else if (oldAttraction <= 25 && a > 25 && a < 65) {
      this.changeStatus();
    }
    else if (oldAttraction <= 65 && a > 65 && a < 100) {
      this.changeStatus();
    }
    else if (a >= 100){
      this.changeStatus();
      System.out.println(this._name + "has fallen for you!");
      this.setFallen(true);
    }
    return this.getStatus();
  }

  // Changes attraction level
  public int changeAttraction(int change) {
    int old = _attraction;
    _attraction += change;
    maintainStatus(old);
    return old;
  }

  // Updates the current tree (found at _currentStage.get(0))
  //Returns true when the player gets to the end of the tree, signalling to Woo
  // that it's time to switch Characters
  public boolean updateTree(int childInd) {
    //if you've reached the end of the tree...
    if (_currentStage.get(0).getChildren().get(childInd) == null) {
      _pendingLikeChange += _currentStage.get(0).getChildrenLikeChanges().get(childInd);
      ArrayList<TreeNode> oldStage = _currentStage;
      //update the attraction based on the change you've ammassed throughout the
      // tree
      System.out.println("attraction  before: " + _attraction);
      changeAttraction(_pendingLikeChange);
      System.out.println("attraction  after: " + _attraction);
      //now reset the pending likeChange for the next tree
      _pendingLikeChange = 0;
      //now delete the tree you've just finished so that the next tree is now at
      // index 0
      _currentStage.remove(0);
      //if you've gotten through the entire stage without progressing, it's over
      if (_currentStage.size() == 0 && oldStage.equals(_currentStage)) {
        _over = true;
        System.out.println("This relationship is hopeless. You're taking too long. IT'S OVER.");
      }
      //return true so that Woo knows the tree has been finished
      return true;
    }
    //if you haven't reached the end of the tree, update it so that you're at
    // the head the player chose (newHead)
    else {
      //continue ammassing likeChange as you progress through the tree
      _pendingLikeChange += _currentStage.get(0).getChildrenLikeChanges().get(childInd);
      //update the head of the tree you're on
      _currentStage.set(0, _currentStage.get(0).getChildren().get(childInd));
      //return false so Woo knows to keep working through the tree
      return false;
    }
  }

  public int probeTree(){
    int option = 0;
    int bestLike = Integer.MIN_VALUE;
    for (int i = 0; i < _currentStage.get(0).getChildren().size(); i++) {
      int like = probeTreeHelper(_currentStage.get(0).getChildren().get(i));
      if (like > bestLike) {
        bestLike = like;
        option = i;
      }
    }
    double chance = Math.random();
    //2/3 of the time gives good advice
    if (chance < 0.66) {
      return option+1; //+1 b/c when the player sees their list of options, it starts at 1, not 0, but option is the index of the array
    }
    //1/3 of the time gives bad advice
    else {
      if (option == 0) { return 2; }
      else { return option; }
    }
  }

  public int probeTreeHelper(TreeNode node) {
    if (node.getChildren().size() == 0) {
      return 0;
    }
    else {
      int bestLike = Integer.MIN_VALUE;
      for (int i = 0; i < node.getChildren().size(); i++) {
        int like = node.getChildrenLikeChanges().get(i) + probeTreeHelper(node.getChildren().get(i));
        if (like > bestLike) {
          bestLike = like;
        }
      }
      return bestLike;
    }
  }

}
