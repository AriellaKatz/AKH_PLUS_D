/*
AKH+D: Hugo Jenkins, Ariella Katz, Kaitlin Ho, Boary, Tom, Apple
APCS pd6
FP -- Are You a Player?
2022-06-06
*/

import java.util.ArrayList;

public class BS3s2c2 extends TreeNode {

  public BS3s2c2(Charactar character, Player player) {
    super(character, player);
    _children.add(new BS3s2c4(character, player));
    _children.add(new BS3s2c5(character, player));
    _childrenLikeChanges.add(3);
    _childrenLikeChanges.add(3);
  }

  public boolean interact() {
    type("\033[3mYou walk outside together and stand under a tree\033[0m");
    type("BRAD: So. What do you want to do now?");
    type("\n\t1. \"Let's go to Dee's.\" \n\t2. \"C'mon, I know a spot.\"");
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
      return _character.updateTree(0);
    }
    else {
      return _character.updateTree(1);
    }
  }

}
