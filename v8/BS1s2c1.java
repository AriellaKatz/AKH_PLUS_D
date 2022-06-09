/*
AKH+D: Hugo Jenkins, Ariella Katz, Kaitlin Ho, Boary, Tom, Apple
APCS pd6
FP -- Are You a Player?
2022-06-03
*/

import java.util.ArrayList;

public class BS1s2c1 extends TreeNode {

  public BS1s2c1(Charactar character, Player player) {
    super(character, player);
    _children.add(new BS1s2c2(character, player));
    _children.add(new BS1s2c3(character, player));
    _childrenLikeChanges.add(0);
    _childrenLikeChanges.add(0);
  }

  public boolean interact() {
    type("[You are at the party.]");
    type("BRAD: Yoooo I remember you! You're that new kid! We've got soda, White Claws... Lemme get you a drink.");
    type("\n\t1. \"No, I don't drink.\" \n\t2. \"Awesome, thanks!\"");
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
