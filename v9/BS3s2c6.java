/*
AKH+D: Hugo Jenkins, Ariella Katz, Kaitlin Ho, Boary, Tom, Apple
APCS pd6
FP -- Are You a Player?
2022-06-06
*/

import java.util.ArrayList;

public class BS3s2c6 extends TreeNode {

  public BS3s2c6(Charactar character, Player player) {
    super(character, player);
    _children.add(null);
    _children.add(null);
    _childrenLikeChanges.add(7);
    _childrenLikeChanges.add(-47);
  }

  public boolean interact() {
    type("BRAD: Damn bro that's tough. I love that you feel comfortable sharing that with me.");
    type("\n\t1. \"I always feel comfortable around you...\" \033[3mKiss him with immense power.\033[0m \n\t2. \"I twas a mistake. I don't even think you have feelings you disgusting slug-like creature.\" \033[3mYou slap him.\033[0m");
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
      type("\033[3mHow disgustingly romantic. Somehow Brad has fallen for you.\033[0m \033[1mYOU WIN!\033[0m");
      _character.setFallen(true);
      return _character.updateTree(0);
    }
    else {
      type("\033[3mIdk what you were expecting. He's not into that stuff.\033[0m \033[1mIT'S OVER.\033[0m");
      _character.setOver(true);
      return _character.updateTree(1);
    }
  }

}
