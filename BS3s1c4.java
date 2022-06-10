/*
AKH+D: Hugo Jenkins, Ariella Katz, Kaitlin Ho, Boary, Tom, Apple
APCS pd6
FP -- Are You a Player?
2022-06-06
*/

import java.util.ArrayList;

public class BS3s1c4 extends TreeNode {

  public BS3s1c4(Charactar character, Player player) {
    super(character, player);
    _children.add(null);
    _children.add(new BS3s1c7(character, player));
    _childrenLikeChanges.add(3);
    _childrenLikeChanges.add(5);
  }

  public boolean interact() {
    type("BRAD: I can drive you, if you want.");
    type("\n\t1. \"I've got it, thanks.\" \n\t2. \"Oooo, yes please. And thank you/\"");
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
      type("\033[3mBrad's smile falls and his heart breaks from your rejection.\033[0m \033[1mIT'S OVER.\033[0m");
      _character.setOver(true);
      return _character.updateTree(0);
    }
    else {
      return _character.updateTree(1);
    }
  }

}
