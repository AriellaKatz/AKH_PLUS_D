/*
AKH+D: Hugo Jenkins, Ariella Katz, Kaitlin Ho, Boary, Tom, Apple
APCS pd6
FP -- Are You a Player?
2022-06-03
*/

import java.util.ArrayList;

public class JS2s1c4 extends TreeNode {

  public JS2s1c4(Charactar character, Player player) {
    super(character, player);
    _children.add(null);
    _children.add(null);
    _childrenLikeChanges.add(3);
    _childrenLikeChanges.add(9);
  }

  public boolean interact() {
    type("JESSICA: I'm down. You paying?");
    type("\n\t1. \"No.\" \n\t2. \"Yeah, sure.\"");
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
      type("JESSICA: Just kidding, haha. I'll pay for myself.");
      type("\033[3mJessica pays for herself. The bakery is yummy.\033[0m");
      return _character.updateTree(0);
    }
    else {
      type("JESSICA: Just kidding, haha. I'll pay for myself.");
      type("\033[3mJessica pays for herself. The bakery is yummy.\033[0m");
      return _character.updateTree(1);
    }
  }

}
