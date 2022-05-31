/*
AKH+D: Hugo Jenkins, Ariella Katz, Kaitlin Ho, Boary, Tom, Apple
APCS pd6
FP -- Are You a Player?
2022-05-30
*/
//hair soft :D, inv to hang
import java.util.ArrayList;

public class Js1c3 extends TreeNode {

  public Js1c3(Character character) {
    super();
    _children.add(new Js2c1(character));
    _children.add(null); //In the interact() method, if player chooses
    // option 1, it's over and player can no longer proceed w/ jessica
    _likeChange = 0;
    _character = character;
  }

  public void interact() {
    System.out.println("JESSICA: \"Oooh it's really soft. Wanna hang out tomorrow?\"");
    System.out.println("Respond: \n\t1. \"Sure!\" \n\t2. \"Sorry, I'm busy.\"");
    System.out.println("Enter 1 or 2.");
    Scanner in = new Scanner(System.in);
    String choice = in.nextLine();
    while (!choice.trim().equals("1") && !choice.trim().equals("2")) {
      System.out.println("Congrats, you can't follow instructions. Try again.");
      Scanner in2 = new Scanner(System.in);
      choice = in.nextLine;
    }
    Integer input = Integer.parseInt(choice);
    if (input == 1) {
      _character.updateTree(_children.get(0));
      _children.get(0).updateAttraction();
      System.out.println("*You hang out and have a great time.*");
    }
    else {
      _character.setOver(true);
      _character.updateTree(_children.get(1));
      System.out.println("IT'S OVER!");
      //_children.get(1).updateAttraction(); b/c it's null
    }
  }

}
