/*
AKH+D: Hugo Jenkins, Ariella Katz, Kaitlin Ho, Boary, Tom, Apple
APCS pd6
FP -- Are You a Player?
2022-06-03
*/

import java.util.ArrayList;

public class BS2s1c2 extends TreeNode {

  public BS2s1c2(Charactar character) {
    super();
    _children.add(null);
    _children.add(null);
    _childrenLikeChanges.add(0);
    _childrenLikeChanges.add(0);
    _character = character;
  }

  public boolean interact() {
    type("BRAD: What's wrong?");
    type("\n\t1. \"Please stop talking to me.\" \n\t2. \"Nothing, just exhausted.\"");
    type("Enter \"1\" or \"2\".");
    Scanny in = new Scanny();
    String choice = in.toString().trim();
    while (!choice.equals("1") && !choice.equals("2")) {
      type("Congrats, you can't follow instructions. Try again.");
      Scanny in2 = new Scanny();
      choice = in2.toString().trim();
    }
    Integer input = Integer.parseInt(choice);
    if (input == 1) {
      type("Looks like you're getting what you wanted. IT'S OVER.");
      _character.setOver(true);
      return _character.updateTree(0);
    }
    else {
      type("BRAD: I guess you had fun then.");
      return _character.updateTree(1);
    }
  }

}