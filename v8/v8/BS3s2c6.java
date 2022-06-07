/*
AKH+D: Hugo Jenkins, Ariella Katz, Kaitlin Ho, Boary, Tom, Apple
APCS pd6
FP -- Are You a Player?
2022-06-06
*/

import java.util.ArrayList;

public class BS3s2c6 extends TreeNode {

  public BS3s2c6(Charactar character) {
    super();
    _children.add(null);
    _children.add(null);
    _childrenLikeChanges.add(0);
    _childrenLikeChanges.add(0);
    _character = character;
  }

  public boolean interact() {
    type("BRAD: Damn bro that's tough. I love that you feel comfortable sharing that with me.");
    type("\n\t1. \"I always feel comfortable around you...\" (Kiss him with immense power.) \n\t2. \"I twas a mistake. I don't even think you have feelings you disgusting slug-like creature.\" (Slap him.)");
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
      type("How disgustingly romantic. Somehow Brad has fallen for you. YOU WIN!");
      _character.setFallen(true);
      return _character.updateTree(0);
    }
    else {
      type("Idk what you were expecting. He's not into that stuff. IT'S OVER.");
      _character.setOver(true);
      return _character.updateTree(1);
    }
  }

}
