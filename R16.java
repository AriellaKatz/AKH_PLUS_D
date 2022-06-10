/*
AKH+D: Hugo Jenkins, Ariella Katz, Kaitlin Ho, Boary, Tom, Apple
APCS pd6
FP -- Are You a Player?
2022-06-03
*/

import java.util.ArrayList;

public class R16 extends TreeNode {

  public R16(Charactar character, Player player) {
    super(character, player);
    _children.add(null);
    _children.add(null);
    _childrenLikeChanges.add(0);
    _childrenLikeChanges.add(0);
  }

  public boolean interact() {
    type("RICHARD: Sorry, I just really wanted to have fun.");
    type("\033[3mRichard chuckles while you leave the stall.\033[0m");
    type("RICHARD: Can we still be friends?");
    type("\n\t1. \"Of course bestie.\" \n\t2. \"Absolutely not, you nutcase.\"");
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
      type("\033[3mAww! You've made a\033[0m \033[1mnew friend\033[0m.\033[3m Congrats!\033[0m\n");
      type("\033[0mNow that you're friends with Richard, you can ask him for advice whenever you're making a decision, and he'll do his best to guide you. Beware, he's a bit stupid and he might give you bad advice!\033[0m");
      _character.setFallen(true);
      _character.friendify();
      return _character.updateTree(0);
    }
    else {
      type("(Richard cries.)");
      type("Obviously, IT'S OVER.");
      _character.setOver(true);
      return _character.updateTree(1);
    }
  }

}
