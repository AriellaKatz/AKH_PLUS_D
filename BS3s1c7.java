/*
AKH+D: Hugo Jenkins, Ariella Katz, Kaitlin Ho, Boary, Tom, Apple
APCS pd6
FP -- Are You a Player?
2022-06-06
*/

import java.util.ArrayList;

public class BS3s1c7 extends TreeNode {

  public BS3s1c7(Charactar character, Player player) {
    super(character, player);
    _children.add(null);
    _children.add(null);
    _childrenLikeChanges.add(10);
    _childrenLikeChanges.add(2);
  }

  public boolean interact() {
    type("\033[3mBrad opens his car door for you. You get out and walk to your front door\033[0m");
    type("\n\t1. \"Thank you Brad! Hanging out with you was a lot of fun. See you.\" \n\t2. \"\033[3mWalk back to him and kiss him goodbye. But ask first\033[0m\"");
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
      type("\033[3mYou will see him again, this time at the movies.\033[0m");
      return _character.updateTree(0);
    }
    else {
      type("\033[3mBrad is stunned but quickly regains his composure\033[0m");
      type("BRAD: Damn that was snazzy. Wanna do it again?");
      type("\033[3mBrad has fallen for you.\033[0m \033[1mYOU WIN!\033[0m");
      _character.setFallen(true);
      return _character.updateTree(1);
    }
  }

}
