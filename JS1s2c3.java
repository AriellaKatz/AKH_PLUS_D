/*
AKH+D: Hugo Jenkins, Ariella Katz, Kaitlin Ho, Boary, Tom, Apple
APCS pd6
FP -- Are You a Player?
2022-06-03
*/

import java.util.ArrayList;

public class JS1s2c3 extends TreeNode {

  public JS1s2c3(Charactar character, Player player) {
    super(character, player);
    _children.add(null);
    _children.add(null);
    _childrenLikeChanges.add(6);
    _childrenLikeChanges.add(8);
  }

  public boolean interact() {
    type("JESSICA: I reserved a seat for you over there.");
    type("\n\t1. \"Thanks! Have fun\" \n\t2. \"Make sure to smile in my direction! I'll be waiting.\"");
    type("Enter \"1\" or \"2\".");
    Scanny in = new Scanny(_character, _player);
    String choice = in.toString().trim();
    while (!choice.equals("1") && !choice.equals("2")) {
      type("Congrats, you can't follow instructions. Try again.");
      Scanny in2 = new Scanny(_character, _player);
      choice = in2.toString().trim();
    }
    Integer input = Integer.parseInt(choice);
    if (input == 1) {
      type("JESSICA: You too!");
      return _character.updateTree(0);
    }
    else {
      type("\033[3mJessica blushes slightly\033[0m ");
      return _character.updateTree(1);
    }
  }

}
