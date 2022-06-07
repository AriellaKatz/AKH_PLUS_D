/*
AKH+D: Hugo Jenkins, Ariella Katz, Kaitlin Ho, Boary, Tom, Apple
APCS pd6
FP -- Are You a Player?
2022-06-03
*/

import java.util.ArrayList;

public class JS2s1c6 extends TreeNode {

  public JS2s1c6(Charactar character) {
    super();
    _children.add(null);
    _children.add(new JS2s1c7(character));
    _children.add(new JS2s1c7(character));
    _childrenLikeChanges.add(-6);
    _childrenLikeChanges.add(5);
    _childrenLikeChanges.add(8);
    _character = character;
  }

  public boolean interact() {
    type("JESSICA: Then why are you ignoring me?");
    type("\n\t1. \"Oh ummm...\" \n\t2. \"I'm not, I'm not!\" \n\t3. (Get flustered)");
    type("Enter \"1\", \"2\" or \"3\".");
    Scanny in = new Scanny();
    String choice = in.toString().trim();
    while (!choice.equals("1") && !choice.equals("2") && !choice.equals("3")) {
      type("Congrats, you can't follow instructions. Try again.");
      Scanny in2 = new Scanny();
      choice = in2.toString().trim();
    }
    Integer input = Integer.parseInt(choice);
    if (input == 1) {
      type("JESSICA: Oh I see how it is. I was going to ask you to link again if you wanted to, but I guess not.");
      type("You certainly have a way with words. You may not hate Jessica but she hates you. IT'S OVER.");
      _character.setOver(true);
      return _character.updateTree(0);
    }
    else if (input == 2) {
      return _character.updateTree(1);
    }
    else {
      return _character.updateTree(2);
    }
  }

}
