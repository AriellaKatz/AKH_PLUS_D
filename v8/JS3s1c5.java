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
    _childrenLikeChanges.add(0);
    _childrenLikeChanges.add(0);
    _character = character;
  }

  public boolean interact() {
    type("(Jessica raises her eyebrows, blushes.)");
    type("\n\t1. KISS HER (with consent of course) \n\t2. Be a coward, pretend like nothing's happening.");
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
      type("Jessica's fallen for you! YOU WIN!");
      _character.setFallen(true);
      return _character.updateTree(0);
    }
    else {
      type("You two are cute friends. Maybe you'll have something together in the future, but for the rest of this game, friends you'll remain.");
      _character.setOver(true);
      return _character.updateTree(1);
    }
  }

}
