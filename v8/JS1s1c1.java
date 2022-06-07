/*
AKH+D: Hugo Jenkins, Ariella Katz, Kaitlin Ho, Boary, Tom, Apple
APCS pd6
FP -- Are You a Player?
2022-06-03
*/

import java.util.ArrayList;

public class JS1s1c1 extends TreeNode {

  public JS1s1c1(Charactar character) {
    super();
    _children.add(new JS1s1c2(character));
    _children.add(new JS1s1c3(character));
    _childrenLikeChanges.add(1);
    _childrenLikeChanges.add(7);
    _character = character;
  }

  public boolean interact() {
    type("JESSICA: Heyyy I saw you from across the hall. I love your hair, can I run my fingers through it?");
    type("\n\t1. \"No...\" \n\t2. \"Haha sure!\"");
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
