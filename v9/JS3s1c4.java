/*
AKH+D: Hugo Jenkins, Ariella Katz, Kaitlin Ho, Boary, Tom, Apple
APCS pd6
FP -- Are You a Player?
2022-06-03
*/

import java.util.ArrayList;

public class JS3s1c4 extends TreeNode {

  public JS3s1c4(Charactar character, Player player) {
    super(character, player);
    _children.add(null);
    _children.add(null);
    _childrenLikeChanges.add(17);
    _childrenLikeChanges.add(-24);
  }

  public boolean interact() {
    type("JESSICA: Prove it.");
    type("\n\t1. \"I'll date you if that's what you want.\" \n\t2. \"No, I've changed my mind. Give me my ice cream back.\"");
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
      type("JESSICA: \033[3mRolls her eyes jokingly, smiles\033[0m \"Fiiine.\"");
      type("\033[3mJessica's fallen for you!\033[0m \033[1mYOU WIN!\033[0m");
      _character.setFallen(true);
      return _character.updateTree(0);
    }
    else {
      type("\033[3mYou two are cute friends. Maybe you'll have something together in the future, but for the rest of this game, friends you'll remain.\033[0m");
      _character.setOver(true);
      return _character.updateTree(1);
    }
  }

}
