/*
AKH+D: Hugo Jenkins, Ariella Katz, Kaitlin Ho, Boary, Tom, Apple
APCS pd6
FP -- Are You a Player?
2022-06-03
*/

import java.util.ArrayList;

public class JS2s1c7 extends TreeNode {

  public JS2s1c7(Charactar character, Player player) {
    super(character, player);
    _children.add(null);
    _children.add(null);
    _childrenLikeChanges.add(6);
    _childrenLikeChanges.add(7);
  }

  public boolean interact() {
    type("JESSICA: Oh? Reeaaallyy. Hahaha, you're adorable you know?");
    type("\n\t1. \"Yea, I know.\" \n\t2. \"Ahaha, sure...\"");
    type("Enter \"1\"  or \"2\".");
    Scanny in = new Scanny(_character, _player);
    String choice = in.toString().trim();
    while (!choice.equals("1") && !choice.equals("2")) {
      type("Congrats, you can't follow instructions. Try again.");
      Scanny in2 = new Scanny(_character, _player);
      choice = in2.toString().trim();
    }
    Integer input = Integer.parseInt(choice);
    if (input == 1) {
      type("\033[3mJessica raises her eyebrows in amusement.\033[0m");
      return _character.updateTree(0);
    }
    else {
      type("\033[3mThe bell rings and you scurry away to class.\033[0m");
      return _character.updateTree(1);
    }
  }

}
