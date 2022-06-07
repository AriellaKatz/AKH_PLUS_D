/*
AKH+D: Hugo Jenkins, Ariella Katz, Kaitlin Ho, Boary, Tom, Apple
APCS pd6
FP -- Are You a Player?
2022-06-03
*/

import java.util.ArrayList;

public class JS1s1c2 extends TreeNode {

  public JS1s1c2(Charactar character) {
    super();
    _children.add(null); //option 1 leads to the end of the scene
    _children.add(null); //option 2 leads to the end of the scene
    _childrenLikeChanges.add(0);
    _childrenLikeChanges.add(5);
    _character = character;
  }

  public boolean interact() {
    type("JESSICA: Oh. Sorry. I've never seen you around. Are you new here?");
    type("\n\t1. \"Yeah, bye.\" \n\t2. \"Yeah, would you mind showing me around?\"");
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
      //option 1 terminates the relationship
      type("Wow, you sure know how to shut a relationship down. IT'S OVER.");
      _character.setOver(true);
      return _character.updateTree(0);
    }
    else {
      type("(She shows you around and you have a lovely little bonding experience.)");
      return _character.updateTree(1);
    }
  }

}
