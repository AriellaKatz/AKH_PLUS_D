/*
AKH+D: Hugo Jenkins, Ariella Katz, Kaitlin Ho, Boary, Tom, Apple
APCS pd6
FP -- Are You a Player?
2022-05-30
*/
//invitation to game
import java.util.ArrayList;

public class Js2c1 extends TreeNode {

  public Js2c1(Character character) {
    super();
    _children.add(new Js2c3(character));
    _children.add(new Js2c2(character));
    _likeChange = 0;
    _character = character;
  }

  public void interact() {
    System.out.println("*a few days later*");
    System.out.println("JESSICA: \"Heyy I was wondering if you maybe want to come to my game on Thursday?\"");
    System.out.println("Respond: \n\t1. \"Sorry, I hate football.\" \n\t2. \"Yeah, I'll bring my friend!\" \n\t3. \"Of course! ~I'll~ be ~your~ cheerleader.\"");
    System.out.println("Enter 1, 2, or 3.");
    Scanny in = new Scanny();
    String choice = in.toString();
    while (!choice.trim().equals("1") && !choice.trim().equals("2") && !choice.trim().equals("3")) {
      System.out.println("Congrats, you can't follow instructions. Try again.");
      Scanny in2 = new Scanny();
      String choice = in2.toString();
    }
    Integer input = Integer.parseInt(choice);
    if (input == 1) {
      _character.updateTree(_children.get(0));
      _children.get(0).updateAttraction();
      System.out.println("*You do not go to the football game.*");
    }
    else {
      _character.updateTree(_children.get(1));
      _children.get(1).updateAttraction();
      if (input == 2) {
        _character.changeAttraction(-0); //have to balance this
      }
      System.out.println("*You go to the football game.*");
    }
  }

}
