/*
AKH+D: Hugo Jenkins, Ariella Katz, Kaitlin Ho, Boary, Tom, Apple
APCS pd6
FP -- Are You a Player?
2022-06-06
*/

import java.util.ArrayList;

public class BS3s1c1 extends TreeNode {

  public BS3s1c1(Charactar character, Player player) {
    super(character, player);
    _children.add(new BS3s1c2(character, player));
    _children.add(new BS3s1c3(character, player));
    _childrenLikeChanges.add(2);
    _childrenLikeChanges.add(8);
    _character = character;
  }

  public boolean interact() {
    type("[You are at Brad's house and it is 10pm.]");
    type("\n\t1. \"Oh, it's getting late, I should go...\" \n\t2. \"Hey, can I stay over? It's pretty late.\"");
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
