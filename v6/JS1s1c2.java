/*
AKH+D: Hugo Jenkins, Ariella Katz, Kaitlin Ho, Boary, Tom, Apple
APCS pd6
FP -- Are You a Player?
2022-06-03
*/

import java.util.ArrayList;

public class JS1s1c2 extends TreeNode {

  public JS1s1c2(Character character) {
    super();
    _children.add(null); //option 1 leads to the end of the scene
    _children.add(null); //option 2 leads to the end of the scene
    _childrenLikeChange.add(0);
    _childrenLikeChange.add(0);
    _character = character;
  }

  public void interact() {
    System.out.println("JESSICA: Oh. Sorry. I've never seen you around. Are you new here?");
    System.out.println("\n\t1. \"Yeah, bye.\" \n\t2. \"Yeah, would you mind showing me around?\"");
    System.out.println("Enter \"1\" or \"2\".");
    Scanny in = new Scanny();
    String choice = in.toString().trim();
    while (!choice.equals("1") && !choice.equals("2")) {
      System.out.println("Congrats, you can't follow instructions. Try again.");
      Scanny in2 = new Scanny();
      String choice = in2.toString().trim();
    }
    Integer input = Integer.parseInt(choice);
    if (input == 1) {
      _character.updateTree(0);
      //option 1 terminates the relationship
      System.out.println("Wow, you sure know how to shut a relationship down. IT'S OVER.");
      Jessica.setOver(true);
    }
    else {
      System.out.println("[She shows you around and you have a lovely little bonding experience.]");
      _character.updateTree(1);
    }
  }

}
