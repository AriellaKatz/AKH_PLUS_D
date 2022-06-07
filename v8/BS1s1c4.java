/*
AKH+D: Hugo Jenkins, Ariella Katz, Kaitlin Ho, Boary, Tom, Apple
APCS pd6
FP -- Are You a Player?
2022-06-03
*/

import java.util.ArrayList;

public class BS1s1c4 extends TreeNode {

  public BS1s1c4(Charactar character) {
    super();
    _children.add(null);
    _children.add(null);
    _childrenLikeChanges.add(0);
    _childrenLikeChanges.add(0);
    _character = character;
  }

  public boolean interact() {
    type("BRAD: You should totally stop by my party.");
    type("\n\t1. \"No, thanks. I'm not a party person.\" \n\t2. \"Dope!\"");
    type("Enter \"1\" or \"2\".");
    Scanny in = new Scanny();
    String choice = in.toString().trim();
    while (!choice.equals("1") && !choice.equals("2")) {
      type("Congrats, you can't follow instructions. Try again.");
      Scanny in2 = new Scanny();
      choice = in2.toString().trim();
    }
    Integer input = Integer.parseInt(choice);
    if (input == 1) {
      type("Sorry, Brad only likes party people. IT'S OVER.");
      _character.setOver(true);
      return _character.updateTree(0);
    }
    else {
      type("(You go to the party.)");
      return _character.updateTree(1);
    }
  }

}
