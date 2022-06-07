/*
AKH+D: Hugo Jenkins, Ariella Katz, Kaitlin Ho, Boary, Tom, Apple
APCS pd6
FP -- Are You a Player?
2022-06-03
*/

import java.util.ArrayList;

public class BS1s1c2 extends TreeNode {

  public BS1s1c2(Charactar character) {
    super();
    _children.add(new BS1s1c4(character));
    _children.add(null);
    _childrenLikeChanges.add(0);
    _childrenLikeChanges.add(0);
    _character = character;
  }

  public boolean interact() {
    type("BRAD: You're that new kid?");
    type("\n\t1. \"Yeah, tell me a bit about this place!\" \n\t2. \"Yeah, see you around!\"");
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
      type("(You have a basic convo with him.)");
      return _character.updateTree(0);
    }
    else {
      type("(You never interact with him again.) IT'S OVER.");
      _character.setOver(true);
      return _character.updateTree(1);
    }
  }

}
