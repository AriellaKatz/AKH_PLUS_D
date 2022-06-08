/*
AKH+D: Hugo Jenkins, Ariella Katz, Kaitlin Ho, Boary, Tom, Apple
APCS pd6
FP -- Are You a Player?
2022-06-03
*/

import java.util.ArrayList;

public class R02 extends TreeNode {

  public R02(Charactar character) {
    super();
    _children.add(new R04(character));
    _children.add(null);
    _childrenLikeChanges.add(0);
    _childrenLikeChanges.add(0);
    _character = character;
  }

  public boolean interact() {
    type("RICHARD: At least you apologized. Help me pick up my books?");
    type("\n\t1. \"Of course!\" \n\t2. \"No, do it yourself.\"");
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
      type("RICHARD: Jerk.");
      type("Wow, that was fast. IT'S OVER.");
      _character.setOver(true);
      return _character.updateTree(1);
    }
  }

}
