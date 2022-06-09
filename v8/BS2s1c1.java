/*
AKH+D: Hugo Jenkins, Ariella Katz, Kaitlin Ho, Boary, Tom, Apple
APCS pd6
FP -- Are You a Player?
2022-06-03
*/

import java.util.ArrayList;

public class BS2s1c1 extends TreeNode {

  public BS2s1c1(Charactar character, Player player) {
    super(character, player);
    _children.add(new BS2s1c2(character, player));
    _children.add(new BS2s1c3(character, player));
    _childrenLikeChanges.add(0);
    _childrenLikeChanges.add(0);
  }

  public boolean interact() {
    type("[It's the next day.]");
    type("BRAD:'Sup, man! That party was fire, right?");
    type("\n\t1. \"I guess...\" \n\t2. \"Hell yeah! Can't wait for the next one!\"");
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
