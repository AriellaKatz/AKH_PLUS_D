/*
AKH+D: Hugo Jenkins, Ariella Katz, Kaitlin Ho, Boary, Tom, Apple
APCS pd6
FP -- Are You a Player?
2022-06-03
*/

import java.util.ArrayList;

public class JS2s1c4 extends TreeNode {

  public JS2s1c4(Charactar character) {
    super();
    _children.add(null);
    _children.add(null);
    _childrenLikeChanges.add(0);
    _childrenLikeChanges.add(0);
    _character = character;
  }

  public boolean interact() {
    type("JESSICA: I'm down. You paying?");
    type("\n\t1. \"No.\" \n\t2. \"Yeah, sure.\"");
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
      type("JESSICA: Just kidding, haha. I'll pay for myself.");
      type("(Jessica pays for herself. The bakery is yummy.)");
      return _character.updateTree(0);
    }
    else {
      type("JESSICA: Just kidding, haha. I'll pay for myself.");
      type("(Jessica pays for herself. The bakery is yummy.)");
      return _character.updateTree(1);
    }
  }

}
