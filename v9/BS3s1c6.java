/*
AKH+D: Hugo Jenkins, Ariella Katz, Kaitlin Ho, Boary, Tom, Apple
APCS pd6
FP -- Are You a Player?
2022-06-06
*/

import java.util.ArrayList;

public class BS3s1c6 extends TreeNode {

  public BS3s1c6(Charactar character, Player player) {
    super(character, player);
    _children.add(null);
    _children.add(null);
    _childrenLikeChanges.add(3);
    _childrenLikeChanges.add(10);
  }

  public boolean interact() {
    type("BRAD: Morning! I made eggs.");
    type("\n\t1. \"Oh thank you! I have to go now. It was really fun!\" \n\t2. \"\033[3mTAKE YOUR CHANCE and kiss him good morning. But ask him first\033[0m\"");
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
