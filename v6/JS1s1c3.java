/*
AKH+D: Hugo Jenkins, Ariella Katz, Kaitlin Ho, Boary, Tom, Apple
APCS pd6
FP -- Are You a Player?
2022-06-03
*/

public class JS1s1c3 extends TreeNode {

  public JS1s1c3(Character character) {
    super();
    _children.add(null); //option 1 leads to the end of the scene
    _children.add(null); //option 2 leads to the end of the scene
    _likeChange = 0;
    _character = character;
  }

  public void interact() {
    System.out.println("JESSICA: Oooh. Your hair is really soft. Wanna hang out tomorrow?");
    System.out.println("Respond: \n\t1. \"No, I'm busy. Bye.\" \n\t2. \"Yeah, I'd love that!\"");
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
      _character.updateTree(_children.get(0));
      //option 1 terminates the relationship
      System.out.println("Wow, you sure know how to shut a relationship down. IT'S OVER.");
      Jessica.setOver(true);
    }
    else {
      System.out.println("JESSICA: Yay! Let's go to this bakery I know after school. They have really good bread.");
      System.out.println("*You go to the bakery and have really good bread.*");
      _character.updateTree(_children.get(1));
    }
  }

}
