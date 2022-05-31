/*
AKH+D: Hugo Jenkins, Ariella Katz, Kaitlin Ho, Boary, Tom, Apple
APCS pd6
FP -- Are You a Player?
2022-05-30
*/
//touch hair
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class Js1c1 extends TreeNode {

  public Js1c1(Character character) {
    super(); //calls TreeNode();
    _children.add(new Js1c2(character));
    _children.add(new Js1c3(character));
    _likeChange = 0;
    _character = character;
  }

  public void interact() throws IOException {
    System.out.println("JESSICA: Heyyy I love your hair... can I run my fingers through it?");
    System.out.println("Respond: \n\t1. \"No...\" \n\t2. \"Haha sure!\"");
    System.out.println("Enter 1 or 2.");
    Scanner in = new Scanner(System.in);
    String choice = in.nextLine();
    Integer input = Integer.parseInt(choice);
    if (input == 1) {
      _character.updateTree(_children.get(0));
      _children.get(0).updateAttraction();
    }
    else if (input == 2) {
      _character.updateTree(_children.get(1));
      _children.get(1).updateAttraction();
    }
    else {
      System.out.println("Congrats, you broke the game because you can't follow instructions.");
      throw new IOException();
    }
  }

}
