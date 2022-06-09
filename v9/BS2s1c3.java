/*
AKH+D: Hugo Jenkins, Ariella Katz, Kaitlin Ho, Boary, Tom, Apple
APCS pd6
FP -- Are You a Player?
2022-06-03
*/

import java.util.ArrayList;

public class BS2s1c3 extends TreeNode {

  public BS2s1c3(Charactar character, Player player) {
    super(character, player);
    _children.add(new BS2s1c4(character, player));
    _children.add(null);
    _children.add(null);
    _childrenLikeChanges.add(0);
    _childrenLikeChanges.add(0);
    _childrenLikeChanges.add(0);
  }

  public boolean interact() {
    type("BRAD: Man, you don't have to wait! You can come over again. Just you.");
    type("\n\t1. \"No thanks.\" \n\t2. (Be awkward.) \n\t3. \"I'd love to! When?\"");
    type("Enter \"1\", \"2\", or \"3\".");
    Scanny in = new Scanny(_character, _player);
    String choice = in.toString().trim();
    while (!choice.equals("1") && !choice.equals("2") && !choice.equals("3")) {
      type("Congrats, you can't follow instructions. Try again.");
      Scanny in2 = new Scanny(_character, _player);
      choice = in2.toString().trim();
    }
    Integer input = Integer.parseInt(choice);
    if (input == 1) {
      return _character.updateTree(0);
    }
    else if (input == 2) {
      type("BRAD: Dope! Let's do Friday.");
      type("[You will see him on Friday!]");
      return _character.updateTree(1);
    }
    else {
      type("BRAD: Dope! Let's do Friday.");
      type("[You will see him on Friday!]");
      return _character.updateTree(2);
    }
  }

}
