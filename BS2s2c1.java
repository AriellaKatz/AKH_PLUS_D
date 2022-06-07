/*
AKH+D: Hugo Jenkins, Ariella Katz, Kaitlin Ho, Boary, Tom, Apple
APCS pd6
FP -- Are You a Player?
2022-06-03
*/

import java.util.ArrayList;

public class BS2s2c1 extends TreeNode {

  public BS2s2c1(Charactar character) {
    super();
    _children.add(new BS2s2c2(character));
    _children.add(new BS2s2c2(character));
    _childrenLikeChanges.add(0);
    _childrenLikeChanges.add(0);
    _character = character;
  }

  public boolean interact() {
    type("BRAD: You again! What's up!");
    type("\n\t1. \"Hi...\" \n\t2. \"BRAD! Hi!\"");
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
      type("[You have a basic, unenthusiastic convo.]");
      return _character.updateTree(0);
    }
    else {
      type("[You have a little chat.]");
      return _character.updateTree(1);
    }
  }

}
