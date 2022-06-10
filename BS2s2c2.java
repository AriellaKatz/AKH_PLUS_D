/*
AKH+D: Hugo Jenkins, Ariella Katz, Kaitlin Ho, Boary, Tom, Apple
APCS pd6
FP -- Are You a Player?
2022-06-03
*/

import java.util.ArrayList;

public class BS2s2c2 extends TreeNode {

  public BS2s2c2(Charactar character, Player player) {
    super(character, player);
    _children.add(null);
    _children.add(new BS2s2c3(character, player));
    _childrenLikeChanges.add(25);
    _childrenLikeChanges.add(6);
  }

  public boolean interact() {
    type("\033[3mAsk Brad on a date?\033[0m");
    type("\n\t1. Yes \n\t2. No");
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
      type("BRAD: Hell yeah! Come over to my place!");
      type("\033[3mYou will go over to his place.\033[0m");
      return _character.updateTree(0);
    }
    else {
      return _character.updateTree(1);
    }
  }

}
