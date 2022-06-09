/*
AKH+D: Hugo Jenkins, Ariella Katz, Kaitlin Ho, Boary, Tom, Apple
APCS pd6
FP -- Are You a Player?
2022-06-03
*/

import java.util.ArrayList;

public class R02 extends TreeNode {

  public R02(Charactar character, Player player) {
    super(character, player);
    _children.add(new R04(character, player));
    _children.add(null);
    _childrenLikeChanges.add(0);
    _childrenLikeChanges.add(0);
    _character = character;
  }

  public boolean interact() {
    type("RICHARD: At least you apologized. Help me pick up my books?");
    type("\n\t1. \"Of course!\" \n\t2. \"No, do it yourself.\"");
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
      type("RICHARD: Jerk.");
      type("\033[3mWow, that was fast.\033[0m \033[1mIT'S OVER.\033[0m");
      _character.setOver(true);
      return _character.updateTree(1);
    }
  }

}
