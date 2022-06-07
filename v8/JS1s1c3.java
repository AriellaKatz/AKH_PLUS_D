/*
AKH+D: Hugo Jenkins, Ariella Katz, Kaitlin Ho, Boary, Tom, Apple
APCS pd6
FP -- Are You a Player?
2022-06-03
*/

import java.util.ArrayList;

public class JS1s1c3 extends TreeNode {

  public JS1s1c3(Charactar character) {
    super();
    _children.add(null); //option 1 leads to the end of the scene
    _children.add(null); //option 2 leads to the end of the scene
    _childrenLikeChanges.add(3);
    _childrenLikeChanges.add(6);
    _character = character;
  }

  public boolean interact() {
    type("JESSICA: Oooh. Your hair is really soft. Wanna hang out tomorrow?");
    type("\n\t1. \"No, I'm busy. I'll see you around though.\" \n\t2. \"Yeah, I'd love that!\"");
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
      type("JESSICA: Yay! Let's go to this bakery I know after school. They have really good bread.");
      type("(You go to the bakery and have really good bread.)");
      return _character.updateTree(1);
    }
  }

}
