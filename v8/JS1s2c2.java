/*
AKH+D: Hugo Jenkins, Ariella Katz, Kaitlin Ho, Boary, Tom, Apple
APCS pd6
FP -- Are You a Player?
2022-06-03
*/

import java.util.ArrayList;

public class JS1s2c2 extends TreeNode {

  public JS1s2c2(Charactar character) {
    super();
    _children.add(new JS1s2c3(character));
    _children.add(new JS1s2c3(character));
    _childrenLikeChanges.add(6);
    _childrenLikeChanges.add(8);
    _character = character;
  }

  public boolean interact() {
    type("JESSICA: Aww you actually care?");
    type("\n\t1. \"Yeah. I do.\" \n\t2. \"Who'd want to miss out on your cheering? You're probably the best there is.\"");
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
