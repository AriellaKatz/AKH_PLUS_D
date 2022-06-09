/*
AKH+D: Hugo Jenkins, Ariella Katz, Kaitlin Ho, Boary, Tom, Apple
APCS pd6
FP -- Are You a Player?
2022-06-03
*/

import java.util.ArrayList;

public class BS2s1c4 extends TreeNode {

  public BS2s1c4(Charactar character, Player player) {
    super(character, player);
    _children.add(null);
    _children.add(null);
    _childrenLikeChanges.add(6);
    _childrenLikeChanges.add(0);
  }

  public boolean interact() {
    type("BRAD: Aww c'mon.");
    type("\n\t1. \"Some other time!\" \n\t2. \033[3m Walk away.\033[0m");
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
      type("\033[3m We'll see about that.\033[0m");
      return _character.updateTree(0);
    }
    else {
      type("\033[3m Rude.\033[0m \033[1m IT'S OVER.\033[0m");
      _character.setOver(true);
      return _character.updateTree(1);
    }
  }

}
