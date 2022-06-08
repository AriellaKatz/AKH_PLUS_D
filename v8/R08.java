/*
AKH+D: Hugo Jenkins, Ariella Katz, Kaitlin Ho, Boary, Tom, Apple
APCS pd6
FP -- Are You a Player?
2022-06-03
*/

import java.util.ArrayList;

public class R08 extends TreeNode {

  public R08(Charactar character) {
    super();
    _children.add(new R10(character));
    _children.add(new R10(character));
    _childrenLikeChanges.add(0);
    _childrenLikeChanges.add(0);
    _character = character;
  }

  public boolean interact() {
    type("[You are in the bathroom. It is pitch black.]");
    type("RICHARD: (Standing motionless) Oh, there you are.");
    type("\n\t1. \"Are you okay...\" \n\t2. \"So, uh, what now?\"");
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
      return _character.updateTree(1);
    }
  }

}
