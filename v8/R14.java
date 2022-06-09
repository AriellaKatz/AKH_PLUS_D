/*
AKH+D: Hugo Jenkins, Ariella Katz, Kaitlin Ho, Boary, Tom, Apple
APCS pd6
FP -- Are You a Player?
2022-06-03
*/

import java.util.ArrayList;

public class R14 extends TreeNode {

  public R14(Charactar character) {
    super();
    _children.add(new R12(character));
    _children.add(null);
    _childrenLikeChanges.add(0);
    _childrenLikeChanges.add(0);
    _character = character;
  }

  public boolean interact() {
    type("RICHARD: Too bad.");
    type("(Richard's a jerk, but you go through with it anyway.)");
    type("RICHARD: You good?");
    type("\n\t1. \"Yup.\" \n\t2. \"No, LET ME OUT.\"");
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
      return _character.updateTree(0);
    }
    else {
      type("(Richard is disgusted by your cowardice. IT'S OVER.)");
      _character.setOver(true);
      return _character.updateTree(1);
    }
  }

}
