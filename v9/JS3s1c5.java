/*
AKH+D: Hugo Jenkins, Ariella Katz, Kaitlin Ho, Boary, Tom, Apple
APCS pd6
FP -- Are You a Player?
2022-06-03
*/

import java.util.ArrayList;

public class JS3s1c5 extends TreeNode {

  public JS3s1c5(Charactar character, Player player) {
    super(character, player);
    _children.add(null);
    _children.add(null);
    _childrenLikeChanges.add(15);
    _childrenLikeChanges.add(0);
  }

  public boolean interact() {
    type("(Jessica raises her eyebrows, blushes.)");
    type("\n\t1. \033[3mKISS HER (with consent of course)\033[0m \n\t2. \033[3mBe a coward, pretend like nothing's happening.\033[0m");
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
