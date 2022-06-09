/*
AKH+D: Hugo Jenkins, Ariella Katz, Kaitlin Ho, Boary, Tom, Apple
APCS pd6
FP -- Are You a Player?
2022-06-06
*/

import java.util.ArrayList;

public class BS3s1c2 extends TreeNode {

  public BS3s1c2(Charactar character, Player player) {
    super(character, player);
    _children.add(new BS3s1c4(character, player));
    _children.add(new BS3s1c3(character, player));
    _childrenLikeChanges.add(5);
    _childrenLikeChanges.add(8);
    _character = character;
  }

  public boolean interact() {
    type("BRAD: You can stay the night if you want.");
    type("\n\t1. \"I'm good, I like sleeping at home.\" \n\t2. \"Sure, why not?\"");
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
      return _character.updateTree(1);
    }
  }

}
