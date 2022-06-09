/*
AKH+D: Hugo Jenkins, Ariella Katz, Kaitlin Ho, Boary, Tom, Apple
APCS pd6
FP -- Are You a Player?
2022-06-06
*/

import java.util.ArrayList;

public class BS3s2c3 extends TreeNode {

  public BS3s2c3(Charactar character, Player player) {
    super(character, player);
    _children.add(null);
    _children.add(null);
    _childrenLikeChanges.add(0);
    _childrenLikeChanges.add(0);
  }

  public boolean interact() {
    type("BRAD: Yoooo. Bro, I don't think you're mid either. I didn't realize you felt the same.");
    type("\n\t1. \"Well I do. (Passionately kiss him)\" \n\t2. \"Jk, you clapped.\"");
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
      type("(Brad is stunned but quickly regains his composure)");
      type("BRAD: Damn that was snazzy. Wanna do it again?");
      _character.setFallen(true);
      return _character.updateTree(0);
    }
    else {
      type("(Brad gives you a ????? face and leaves silently.)");
      type("Your relationship will not recover. IT'S OVER.");
      _character.setOver(true);
      return _character.updateTree(1);
    }
  }

}
