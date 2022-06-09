/*
AKH+D: Hugo Jenkins, Ariella Katz, Kaitlin Ho, Boary, Tom, Apple
APCS pd6
FP -- Are You a Player?
2022-06-03
*/

import java.util.ArrayList;

public class R03 extends TreeNode {

  public R03(Charactar character, Player player) {
    super(character, player);
    _children.add(null);
    _children.add(new R02(character, player));
    _childrenLikeChanges.add(0);
    _childrenLikeChanges.add(0);
    _character = character;
  }

  public boolean interact() {
    type("RICHARD: Oh so you think you're so tough?");
    type("\n\t1. \"So what if I am.\" \n\t2. \"No, sorry.\"");
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
      type("\033[3mYou got knocked unconscious.\033[0m");
      type("\033[3mNeedless to say,\033[0m \033[1mIT'S OVER.\033[0m");
      _character.setOver(true);
      return _character.updateTree(0);
    }
    else {
      return _character.updateTree(1);
    }
  }

}
