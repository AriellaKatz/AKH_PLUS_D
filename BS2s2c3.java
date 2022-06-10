/*
AKH+D: Hugo Jenkins, Ariella Katz, Kaitlin Ho, Boary, Tom, Apple
APCS pd6
FP -- Are You a Player?
2022-06-03
*/

import java.util.ArrayList;

public class BS2s2c3 extends TreeNode {

  public BS2s2c3(Charactar character, Player player) {
    super(character, player);
    _children.add(new BS2s2c4(character, player));
    _children.add(null);
    _childrenLikeChanges.add(13);
    _childrenLikeChanges.add(-4);
  }

  public boolean interact() {
    type("BRAD: Hey, see you tomorrow?");
    type("\n\t1. \"Yeah, it's a date!\" \n\t2. \"Yup!\"");
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
      type("\033[3mAww, you've been friendzoned. Maybe you'll have something in the future, but for now,\033[0m \033[1mIT'S OVER.\033[0m");
      _character.setOver(true);
      return _character.updateTree(1);
    }
  }

}
