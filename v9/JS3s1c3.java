/*
AKH+D: Hugo Jenkins, Ariella Katz, Kaitlin Ho, Boary, Tom, Apple
APCS pd6
FP -- Are You a Player?
2022-06-03
*/

import java.util.ArrayList;

public class JS3s1c3 extends TreeNode {

  public JS3s1c3(Charactar character, Player player) {
    super(character, player);
    _children.add(new JS3s1c4(character, player));
    _children.add(null);
    _childrenLikeChanges.add(9);
    _childrenLikeChanges.add(-24);
  }

  public boolean interact() {
    type("JESSICA: Wow, so generous! These things are expensive, y'know.");
    type("\n\t1. \"You're worth it.\" \n\t2. (Roll your eyes.) \"You're right, give it back then.\"");
    type("Enter \"1\" or \"2\"");
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
      type("You two are cute friends. Maybe you'll have something together in the future, but for the rest of this game, friends you'll remain.");
      _character.setOver(true);
      return _character.updateTree(1);
    }
  }

}
