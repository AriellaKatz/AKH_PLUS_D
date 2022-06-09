/*
AKH+D: Hugo Jenkins, Ariella Katz, Kaitlin Ho, Boary, Tom, Apple
APCS pd6
FP -- Are You a Player?
2022-06-03
*/

import java.util.ArrayList;

public class BS1s2c3 extends TreeNode {

  public BS1s2c3(Charactar character, Player player) {
    super(character, player);
    _children.add(new BS1s2c4(character, player));
    _children.add(new BS1s2c4(character, player));
    _children.add(null);
    _childrenLikeChanges.add(6);
    _childrenLikeChanges.add(7);
    _childrenLikeChanges.add(5);
  }

  public boolean interact() {
    type("BRAD: (Hands you your drink) So how's the party?");
    type("\n\t1. \"Not bad.\" \n\t2. \"Sick! I'm so glad you invited me!\" \n\t3. \"Kinda boring. I think I'm gonna go home. (Leave.)\"");
    type("Enter \"1\" or \"2\".");
    Scanny in = new Scanny(_character, _player);
    String choice = in.toString().trim();
    while (!choice.equals("1") && !choice.equals("2") && !choice.equals("3")) {
      type("Congrats, you can't follow instructions. Try again.");
      Scanny in2 = new Scanny(_character, _player);
      choice = in2.toString().trim();
    }
    Integer input = Integer.parseInt(choice);
    if (input == 1) {
      return _character.updateTree(0);
    }
    else if (input == 2){
      return _character.updateTree(1);
    }
    else {
      type("[You go home. Will you ever see him again?]");
      return _character.updateTree(2);
    }
  }

}
