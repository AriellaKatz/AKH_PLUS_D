/*INTRO -
 "Hey you! Heyy! I saw you from across the hall. I love your hair, can I touch?"
 "Oh. Sorry. I'fe never seen you around. Are you new here?"
 "Oooh. Your hair is really soft. Here's a great idea: wanna hang out tomorrow? You seem a bit busy."
 "Hmm. Let's go to that bakery after school. They sell good bread."

 FOOTBALL GAME -
 "<name>! You wanna come to the football game Thursday? I'll be cheering."
 "Oh you actually came."
 "I reserved a seat for you. It's over there."
 "You too!"
 "I will *winks*"

 SCHOOl -
 "Oh <name>. Hi! What's up!"
 "Hey <name>."
 "Do you hate me or something?"
 "Then why are you ignoring me?"
 "Oh sorry? Might be more of a you problem."
 "Aww! Glad you did. Did you see me cheer?"
 "I'm down. You paying?"
 "Just kidding."
 "I smiled at you. Like you wanted."
 "Oh. I see how it is! I was going to ask you to link again. I guess not anymore."
 "Oh? Really? Haha. You're adorable, you know?"

 LUNCH -
 "(Her friends walk up to you) Yo! Jessican wants you to sit at our table. Wanna come?"
 "Hiiii, these are my teammates and BFFs. <enter names>"
 "(Her friends are whispering and looking in your direction.)"
 "I guess I can tell you. You're kind of cute. Ah- but I'm cuter."

 FINAL -
 "(You and Jessica walk out of an ice cream shop)"
 "Woah. So generous. These things are expensive y'know."
 "Realllllyyy. Prove it."
 "Noooooo I'll eat it."
 "(She's waiting)"
 "No what-"

 "Oh so you liiike me?"
 "*eyebrow raise* So you already know my answer."
 "I mean, why not pretty face."
*/

/*
AKH+D: Hugo Jenkins, Ariella Katz, Kaitlin Ho, Boary, Tom, Apple
APCS pd6
FP -- Are You a Player?
2022-06-03
*/

import java.util.ArrayList;

public class JS1s1c1 extends TreeNode {

  public JS1s1c1(Character character) {
    super();
    _children.add(new JS1s1c2(character));
    _children.add(new JS1s1c3(character));
    _childrenLikeChange.add(0);
    _childrenLikeChange.add(0);
    _character = character;
  }

  public void interact() {
    System.out.println("JESSICA: Heyyy I saw you from across the hall. I love your hair, can I run my fingers through it?");
    System.out.println("\n\t1. \"No...\" \n\t2. \"Haha sure!\"");
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
    }
    else {
      _character.updateTree(1);
    }
  }

}
