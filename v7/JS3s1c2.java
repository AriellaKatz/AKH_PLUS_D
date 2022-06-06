/*
AKH+D: Hugo Jenkins, Ariella Katz, Kaitlin Ho, Boary, Tom, Apple
APCS pd6
FP -- Are You a Player?
2022-06-03
*/
import java.util.ArrayList;

public class JS3s1c2 extends TreeNode {

  public JS3s1c2(Character character) {
    super();
    _children.add(new JS3s1c5(character));
    _children.add(null);
    _childrenLikeChanges.add(0);
    _childrenLikeChanges.add(0);
    _childrenLikeChanges.add(0);
    _character = character;
  }

  public void interact() {
    System.out.println("JESSICA: Ohhh so you like me...");
    System.out.println("\n\t1. \"Yeah, and you like me back.\" \n\t2. \"I guess...\"");
    System.out.println("Enter \"1\", \"2\", or \"3\".");
    Scanny in = new Scanny();
    String choice = in.toString().trim();
    while (!choice.equals("1") && !choice.equals("2") && !choice.equals("3")) {
      System.out.println("Congrats, you can't follow instructions. Try again.");
      Scanny in2 = new Scanny();
      choice = in2.toString().trim();
    }
    Integer input = Integer.parseInt(choice);
    if (input == 1) {
      _character.updateTree(0);
    }
    else {
      _character.updateTree(1);
      System.out.println("JESSICA: Aw you're so cute.");
      System.out.println("Sorry, you've been friendzoned. IT'S OVER.");
      _character.setOver(true);
    }

  }

}
