/*
AKH+D: Hugo Jenkins, Ariella Katz, Kaitlin Ho, Boary, Tom, Apple
APCS pd6
FP -- Are You a Player?
2022-06-06
*/

import java.util.ArrayList;

public class BS3s2c5 extends TreeNode {

  public BS3s2c5(Charactar character) {
    super();
    _children.add(null);
    _children.add(null);
    _childrenLikeChanges.add(0);
    _childrenLikeChanges.add(0);
    _character = character;
  }

  public boolean interact() {
    System.out.println("BRAD: Dammmm this spot is valid af. The vista is rocking. How'd you come across it?");
    System.out.println("\n\t1. \"I found it a couple summers ago and I knew from that moment that I was going to bring someone that I care a lot about here. That person is you. (You dive in to hug him.)\" \n\t2. \"Just somewhere I used to come with my ex.\"");
    System.out.println("Enter \"1\" or \"2\".");
    Scanny in = new Scanny();
    String choice = in.toString().trim();
    while (!choice.equals("1") && !choice.equals("2")) {
      System.out.println("Congrats, you can't follow instructions. Try again.");
      Scanny in2 = new Scanny();
      choice = in2.toString().trim();
    }
    Integer input = Integer.parseInt(choice);
    if (input == 1) {
      System.out.println("Y'all fall of the cliff and die. Maybe your relationship will continue in the afterlife, but for this game, IT'S OVER.");
      _character.setOver(true);
      return _character.updateTree(0);
    }
    else {
      System.out.println("You obviously have no common sense. Why would you bring up your ex. IT'S OVER.");
      return _character.updateTree(1);
    }
  }

}
