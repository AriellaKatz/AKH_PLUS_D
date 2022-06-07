/*
AKH+D: Hugo Jenkins, Ariella Katz, Kaitlin Ho, Boary, Tom, Apple
APCS pd6
FP -- Are You a Player?
2022-06-03
*/

import java.util.ArrayList;

public class BS1s2c2 extends TreeNode {

  public BS1s2c2(Charactar character) {
    super();
    _children.add(new BS1s2c4(character));
    _children.add(null);
    _childrenLikeChanges.add(0);
    _childrenLikeChanges.add(0);
    _character = character;
  }

  public boolean interact() {
    type("BRAD: Dude, why would you come.");
    type("\n\t1. \"You seemed cool, and I'm having fun! You throw a great party!\" \n\t2. \"I don't know, I won't be making that mistake again. Bye.\"");
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
      type("Wow, Brad is HELLA offended. IT'S OVER.");
      _character.setOver(true);
      return _character.updateTree(1);
    }
  }

}
