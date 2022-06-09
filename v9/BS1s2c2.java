/*
AKH+D: Hugo Jenkins, Ariella Katz, Kaitlin Ho, Boary, Tom, Apple
APCS pd6
FP -- Are You a Player?
2022-06-03
*/

import java.util.ArrayList;

public class BS1s2c2 extends TreeNode {

  public BS1s2c2(Charactar character, Player player) {
    super(character, player);
    _children.add(new BS1s2c4(character, player));
    _children.add(null);
    _childrenLikeChanges.add(17);
    _childrenLikeChanges.add(-6);
  }

  public boolean interact() {
    type("BRAD: Dude, why would you come.");
    type("\n\t1. \"You seemed cool, and I'm having fun! You throw a great party!\" \n\t2. \"I don't know, I won't be making that mistake again. Bye.\"");
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
      type("\033[3mWow, Brad is HELLA offended.\033[0m \033[1mIT'S OVER.\033[0m");
      _character.setOver(true);
      return _character.updateTree(1);
    }
  }

}
