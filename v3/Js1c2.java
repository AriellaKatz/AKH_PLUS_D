/*
AKH+D: Hugo Jenkins, Ariella Katz, Kaitlin Ho, Boary, Tom, Apple
APCS pd6
FP -- Are You a Player?
2022-05-30
*/
//"ok sorry, are you new here?"
import java.util.ArrayList;

public class Js1c2 extends TreeNode {

  public Js1c2(Character character) {
    super();
    _children.add(null); //In the interact() method, if player chooses
    // option 1, it's over and player can no longer proceed w/ jessica
    _children.add(new Js2c1(character));
    _likeChange = 0;
    _character = character;
  }

  public void interact() {
    System.out.println("JESSICA: \"Ok sorry... are you new here?\"");
    System.out.println("Respond: \n\t1. \"Yeah, bye.\" \n\t2. \"Yeah, could you show me around?\"");
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
      _character.setOver(true);
      _character.updateTree(_children.get(0));
      System.out.println("IT'S OVER!");
      //_children.get(0).updateAttraction(); b/c it's null
    }
    else {
      _character.updateTree(_children.get(1));
      _children.get(1).updateAttraction();
      System.out.println("JESSICA: \"I'd love that!\"");
      System.out.println("*You hang out and have a great time.*");
    }
  }

}
