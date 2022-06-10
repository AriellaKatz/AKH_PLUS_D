/*
AKH+D: Hugo Jenkins, Ariella Katz, Kaitlin Ho, Boary, Tom, Apple
APCS pd6
FP -- Are You a Player?
2022-06-03
*/

import java.util.ArrayList;

public class BS1s1c3 extends TreeNode {

  public BS1s1c3(Charactar character, Player player) {
    super(character, player);
    _children.add(new BS1s1c4(character, player));
    _children.add(null);
    _childrenLikeChanges.add(7);
    _childrenLikeChanges.add(0);
  }

  public boolean interact() {
    type("BRAD: What, you're not interested in me?");
    type("\n\t1. \"You're pretty chill.\" \n\t2. \"No.\"");
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
      type("\033[3mYou have a basic convo.\033[0m");
      return _character.updateTree(0);
    }
    else {
      type("\033[3mNice job shutting it down.\033[0m \033[1mIT'S OVER.\033[0m");
      _character.setOver(true);
      return _character.updateTree(1);
    }
  }

}
