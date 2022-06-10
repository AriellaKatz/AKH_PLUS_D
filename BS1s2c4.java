/*
AKH+D: Hugo Jenkins, Ariella Katz, Kaitlin Ho, Boary, Tom, Apple
APCS pd6
FP -- Are You a Player?
2022-06-03
*/

import java.util.ArrayList;

public class BS1s2c4 extends TreeNode {

  public BS1s2c4(Charactar character, Player player) {
    super(character, player);
    _children.add(null);
    _children.add(null);
    _childrenLikeChanges.add(2);
    _childrenLikeChanges.add(7);
  }

  public boolean interact() {
    type("BRAD: Rad! We should hang out sometime!");
    type("\n\t1. \"I'm pretty busy...\" \n\t2. \"Totally!\"");
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
      type("\033[3m Aww, you've hurt his feelings. Be nice.\033[0m");
      return _character.updateTree(0);
    }
    else {
      type("\033[3mSlay! Maybe this is actually going somewhere!\033[0m");
      return  _character.updateTree(1);
    }
  }

}
