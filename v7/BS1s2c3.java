/*
AKH+D: Hugo Jenkins, Ariella Katz, Kaitlin Ho, Boary, Tom, Apple
APCS pd6
FP -- Are You a Player?
2022-06-03
*/

import java.util.ArrayList;

public class BS1s2c3 extends TreeNode {

  public BS1s1c3(Character character) {
    super();
    _children.add(new BS1s2c4(character));
    _children.add(new BS1s2c4(character));
    _childrenLikeChanges.add(0);
    _childrenLikeChanges.add(0);
    _character = character;
  }

  public void interact() {
    System.out.println("BRAD: (Hands you your drink) So how's the party?");
    System.out.println("\n\t1. \"Not bad.\" \n\t2. \"Sick! I'm so glad you invited me!\" \n\t3. \"Kinda boring. I think I'm gonna go home. (Leave.)\"");
    System.out.println("Enter \"1\" or \"2\".");
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
    else if (input == 2){
      _character.updateTree(1);
    }
    else {
      _character.updateTree(2);
      System.out.println("[You go home. Will you ever see him again?]");
    }
  }

}
