/*
AKH+D: Hugo Jenkins, Ariella Katz, Kaitlin Ho, Boary, Tom, Apple
APCS pd6
FP -- Are You a Player?
2022-06-03
*/

import java.util.ArrayList;

public class R05 extends TreeNode {

  public R05(Charactar character, Player player) {
    super(character, player);
    _children.add(new R06(character, player));
    _children.add(new R07(character, player));
    _childrenLikeChanges.add(0);
    _childrenLikeChanges.add(0);
    _character = character;
  }

  public boolean interact() {
    type("\033[3mYou are at the party.\033[0m");
    type("RICHARD: Oh! Hey you actually came. Now that I think of it, I never asked for your name. I'll call you dumbass. Dumbass, did you hear about the haunted bathroom on the 9th floor?");
    type("\n\t1. \"Yeah!\" \n\t2. \"No...\"");
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
