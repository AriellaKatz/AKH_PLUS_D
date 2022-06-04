/*
AKH+D: Hugo Jenkins, Ariella Katz, Kaitlin Ho, Boary, Tom, Apple
APCS pd6
FP -- Are You a Player?
2022-06-03
*/
import java.util.ArrayList;

public class JS2s1c3 extends TreeNode {

  public JS2s1c3(Character character) {
    super();
    _children.add(null);
    _children.add(null);
    _childrenLikeChange.add(0);
    _childrenLikeChange.add(0);
    _character = character;
  }

  public void interact() {
    System.out.println("JESSICA: Aww! Glad you did. Did you see me cheer? Was I good?");
    System.out.println("\n\t1. \"Of course, you were great.\"");
    System.out.println("Enter \"1\"");
    Scanny in = new Scanny();
    String choice = in.toString().trim();
    while (!choice.equals("1")) {
      System.out.println("Congrats, you can't follow instructions. Try again.");
      Scanny in2 = new Scanny();
      String choice = in2.toString().trim();
    }
    System.out.println("JESSICA: I smiled for you!");

    System.out.println("\n\t1. \"Oh? I didn't see.\" \n\t2. \"Yes, you looked very pretty.\"");
    System.out.println("Enter \"1\" or \"2\".");
    in = new Scanny();
    String choice = in.toString().trim();
    while (!choice.equals("1") && !choice.equals("2")) {
      System.out.println("Congrats, you can't follow instructions. Try again.");
      Scanny in2 = new Scanny();
      String choice = in2.toString().trim();
    }
    Integer input = Integer.parseInt(choice);
    if (input == 1) {
      _character.updateTree(0);
      System.out.println("(Jessica pouts but tries to hide it)");
      System.out.println("[You part ways... to meet again?]");
    }
    else {
      _character.updateTree(1);
      System.out.println("[You part ways... to meet again?]");
    }
  }

}
