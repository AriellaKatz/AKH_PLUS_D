/*
AKH+D: Hugo Jenkins, Ariella Katz, Kaitlin Ho, Boary, Tom, Apple
APCS pd6
FP -- Are You a Player?
2022-06-03
*/

import java.util.ArrayList;

public class R09 extends TreeNode {

  public R09(Charactar character) {
    super();
    _children.add(new R11(character));
    _children.add(new R12(character));
    _childrenLikeChanges.add(0);
    _childrenLikeChanges.add(0);
    _character = character;
  }

  public boolean interact() {
    type("RICHARD: Alright, so do you want to hear the story of the bathroom?");
    type("\n\t1. \"Absolutely.\" \n\t2. \"Nah, I'm caught up.\"");
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
      type("RICHARD: Great! So let's see what happens. In you go!");
      return _character.updateTree(1);
    }
  }

}
