/*
AKH+D: Hugo Jenkins, Ariella Katz, Kaitlin Ho, Boary, Tom, Apple
APCS pd6
FP -- Are You a Player?
2022-06-03
*/

import java.util.ArrayList;

public class R12 extends TreeNode {

  public R12(Charactar character, Player player) {
    super(character, player);
    _children.add(null);
    _children.add(null);
    _childrenLikeChanges.add(0);
    _childrenLikeChanges.add(0);
  }

  public boolean interact() {
    type("\033[3mYou wait a few seconds. Then, something suddenly brushes against your foot. You scream. AHHHHH.\033[0m");
    type("RICHARD: \033[3mBusts open the stall door and helps you out\033[0m Are you ok? Don't worry, it was just a cockroach.");
    type("\n\t1. (Hug him.) \n\t2. (Thank him.)");
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
      type("\033[3mRichard blushes. How cute.\033[0m");
      type("\033[3mUnfortunately, Richard is incapable of love.\033[0m \033[1mFriends it is!\033[0m");
      type("Now that you're friends with Richard, you can ask him for advice whenever you're making a decision, and he'll do his best to guide you. Beware, he's a bit stupid and he might give you bad advice!");
      _character.setFallen(true);
      _character.friendify();
      return _character.updateTree(0);
    }
    else {
      type("\033[3mRichard blushes. How cute.\033[0m");
      type("\033[3mUnfortunately, Richard is incapable of love.\033[0m \033[1mFriends it is!\033[0m");
      type("\033[3mNow that you're friends with Richard, you can ask him for advice whenever you're making a decision, and he'll do his best to guide you. Beware, he's a bit stupid and he might give you bad advice!\033[0m");
      _character.setFallen(true);
      _character.friendify();
      return _character.updateTree(1);
    }
  }

}
