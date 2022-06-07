/*
AKH+D: Hugo Jenkins, Ariella Katz, Kaitlin Ho, Boary, Tom, Apple
APCS pd6
FP -- Are You a Player?
2022-06-03
*/

import java.util.ArrayList;

public class JS2s1c7 extends TreeNode {

  public JS2s1c7(Charactar character) {
    super();
    _children.add(null);
    _children.add(null);
    _childrenLikeChanges.add(0);
    _childrenLikeChanges.add(0);
    _character = character;
  }

  public boolean interact() {
    type("JESSICA: Oh? Reeaaallyy. Hahaha, you're adorable you know?");
    type("\n\t1. \"Yea, I know.\" \n\t2. \"Ahaha, sure...\"");
    type("Enter \"1\"  or \"2\".");
    Scanny in = new Scanny();
    String choice = in.toString().trim();
    while (!choice.equals("1") && !choice.equals("2")) {
      type("Congrats, you can't follow instructions. Try again.");
      Scanny in2 = new Scanny();
      choice = in2.toString().trim();
    }
    Integer input = Integer.parseInt(choice);
    if (input == 1) {
      type("(Jessica raises her eyebrows in amusement.)");
      return _character.updateTree(0);
    }
    else {
      type("(The bell rings and you scurry away to class.)");
      return _character.updateTree(1);
    }
  }

}
