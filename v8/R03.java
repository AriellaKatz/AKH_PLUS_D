/*
AKH+D: Hugo Jenkins, Ariella Katz, Kaitlin Ho, Boary, Tom, Apple
APCS pd6
FP -- Are You a Player?
2022-06-03
*/

import java.util.ArrayList;

public class R03 extends TreeNode {

  public R03(Charactar character) {
    super();
    _children.add(null);
    _children.add(new R02(character));
    _childrenLikeChanges.add(0);
    _childrenLikeChanges.add(0);
    _character = character;
  }

  public boolean interact() {
    type("RICHARD: Oh so you think you're so tough?");
    type("\n\t1. \"So what if I am.\" \n\t2. \"No, sorry.\"");
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
      type("(You got knocked unconscious.)");
      type("Needless to say, IT'S OVER.");
      _character.setOver(true);
      return _character.updateTree(0);
    }
    else {
      return _character.updateTree(1);
    }
  }

}
