/*
AKH+D: Hugo Jenkins, Ariella Katz, Kaitlin Ho, Boary, Tom, Apple
APCS pd6
FP -- Are You a Player?
2022-06-03
*/

import java.util.ArrayList;

public class JS1s2c1 extends TreeNode {

  public JS1s2c1(Charactar character, Player player) {
    super(character, player);
    _children.add(null); //option 1 leads to the end of the scene
    _children.add(new JS1s2c2(character, player));
    _children.add(new JS1s2c2(character, player)); //options 2 and 3 lead to the same thing but w diff likeChanges
    _childrenLikeChanges.add(0);
    _childrenLikeChanges.add(-3);
    _childrenLikeChanges.add(7);
    _character = character;
  }

  public boolean interact() {
    type("JESSICA: You wanna come to the football game Thursday? I'll be cheering.");
    type("\n\t1. \"Sorry I hate football\" \n\t2. \"Oh, sure! I'll bring my friend.\" \n\t3. \"Yes! I'll be your cheerleader.\""); // ofc ill be cheering you on
    type("Enter \"1\", \"2\" or \"3\".");
    Scanny in = new Scanny(_character, _player);
    String choice = in.toString().trim();
    while (!choice.equals("1") && !choice.equals("2") && !choice.equals("3")) {
      type("Congrats, you can't follow instructions. Try again.");
      Scanny in2 = new Scanny(_character, _player);
      choice = in2.toString().trim();
    }
    Integer input = Integer.parseInt(choice);
    if (input == 1) {
      type("(You skip the football game.)");
      return _character.updateTree(0);
    }
    else if (input == 2) {
      return _character.updateTree(1);
    }
    else {
      return _character.updateTree(2);
    }
  }

}
