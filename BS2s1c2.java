/*
AKH+D: Hugo Jenkins, Ariella Katz, Kaitlin Ho, Boary, Tom, Apple
APCS pd6
FP -- Are You a Player?
2022-06-03
*/

import java.util.ArrayList;

public class BS2s1c2 extends TreeNode {

  public BS2s1c2(Charactar character, Player player) {
    super(character, player);
    _children.add(null);
    _children.add(null);
    _childrenLikeChanges.add(-5);
    _childrenLikeChanges.add(6);
  }

  public boolean interact() {
    type("BRAD: What's wrong?");
    type("\n\t1. \"Please stop talking to me.\" \n\t2. \"Nothing, just exhausted.\"");
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
      type("\033[3m Looks like you're getting what you wanted.\033[0m \033[1m IT'S OVER.\033[0m");
      _character.setOver(true);
      return _character.updateTree(0);
    }
    else {
      type("BRAD: I guess you had fun then.");
      return _character.updateTree(1);
    }
  }

}
