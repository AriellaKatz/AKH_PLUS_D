/*
AKH+D: Hugo Jenkins, Ariella Katz, Kaitlin Ho, Boary, Tom, Apple
APCS pd6
FP -- Are You a Player?
2022-06-03
*/

import java.util.ArrayList;

public class BS2s2c4 extends TreeNode {

  public BS2s2c4(Charactar character, Player player) {
    super(character, player);
    _children.add(null);
    _children.add(null);
    _childrenLikeChanges.add(0);
    _childrenLikeChanges.add(0);
  }

  public boolean interact() {
    type("BRAD: Oh, lit! We should hang out, just the two of us.");
    type("\n\t1. \"Oh, that's not what I meant. See you around!\" \n\t2. \"Perfect!\"");
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
      type("Aww, you've been friendzoned. Maybe you'll have something in the future, but for now, IT'S OVER.");
      _character.setOver(true);
      return _character.updateTree(0);
    }
    else {
      type("[You will hang out at his place.]");
      return _character.updateTree(1);
    }
  }

}
