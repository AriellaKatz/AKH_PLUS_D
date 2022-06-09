/*
AKH+D: Hugo Jenkins, Ariella Katz, Kaitlin Ho, Boary, Tom, Apple
APCS pd6
FP -- Are You a Player?
2022-06-03
*/

import java.util.ArrayList;

public class R10 extends TreeNode {

  public R10(Charactar character) {
    super();
    _children.add(new R13(character));
    _children.add(new R13(character));
    _childrenLikeChanges.add(0);
    _childrenLikeChanges.add(0);
    _character = character;
  }

  public boolean interact() {
    type("RICHARD: Just go into the first stall. You'll see.");
    type("\n\t1. \"Um, ok...\" \n\t2. \"Absolutely not.\"");
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
      type("(You go in.)");
      return _character.updateTree(0);
    }
    else {
      type("RICHARD: Too bad (shoves you into the stall).");
      return _character.updateTree(1);
    }
  }

}
