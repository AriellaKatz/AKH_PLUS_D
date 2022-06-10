/*
AKH+D: Hugo Jenkins, Ariella Katz, Kaitlin Ho, Boary, Tom, Apple
APCS pd6
FP -- Are You a Player?
2022-06-06
*/

import java.util.ArrayList;

public class BS3s1c5 extends TreeNode {

  public BS3s1c5(Charactar character, Player player) {
    super(character, player);
    _children.add(null);
    _children.add(new BS3s1c6(character, player));
    _childrenLikeChanges.add(10);
    _childrenLikeChanges.add(3);
  }

  public boolean interact() {
    type("\033[3mKiss him goodnight?\033[0m");
    type("\n\t1. \"Yes\" \n\t2. \"No\"");
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
      type("\033[3mBrad is stunned but quickly regains his composure\033[0m");
      type("BRAD: Damn that was snazzy. Wanna do it again?");
      type("\033[3mBrad has fallen for you.\033[0m \033[1mYOU WIN!\033[0m");
      _character.setFallen(true);
      return _character.updateTree(0);
    }
    else {
      return _character.updateTree(1);
    }
  }

}
