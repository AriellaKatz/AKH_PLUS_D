/*
AKH+D: Hugo Jenkins, Ariella Katz, Kaitlin Ho, Boary, Tom, Apple
APCS pd6
FP -- Are You a Player?
2022-05-26
*/

import java.util.ArrayList;
import java.util.HashMap;
import java.io.File;
import java.util.Scanner;

public class Woo {

  private Player _player;
  private Jessica _jessica;
  private Richard _richard;
  private Brad _brad;
  private boolean _gameOver;
  private boolean _firstTime;

  private static HashMap<String, Integer> vibes = new HashMap<String, Integer>();

  public Woo(){


        // read in the positive adjectives in postiveAdjectives.txt
        try {
            Scanner input = new Scanner(new File("positiveAdjectives.txt"));
            while (input.hasNextLine()) {
                String temp = input.nextLine().trim();
                vibes.put(temp, 1);
            }
            input.close();
        } catch (Exception e) {
            System.out.println("Error reading or parsing postitiveAdjectives.txt\n" + e);
        }

        // read in the negative adjectives in negativeAdjectives.txt
        try {
            Scanner input = new Scanner(new File("negativeAdjectives.txt"));
            while (input.hasNextLine()) {
                String temp = input.nextLine().trim();
                vibes.put(temp, -10);
            }
            input.close();
        } catch (Exception e) {
            System.out.println("Error reading or parsing negativeAdjectives.txt");
        }

    _player = new Player();
    _gameOver = false;
    _firstTime = true;
// characters will be instaniated after get to know you method (they start out)
// with certain attraction levels
  }

  public void introduction() {
    // Welcome Message
    System.out.println("Welcome to: ");
    new ImageOpen("logo2.jpg");

    // Introductions
    for (int i = 0; i < 3; i++) {
      String s = "Meet " + _player.getRank().get(i).getName() + ": " + _player.getRank().get(i).getDescrip();
      type(s);
      delay(1000);
    }

    int startingAttraction = 0;
    String s = "What is your name good fellow?";
    type(s);
    _player.setName(new Scanny().toString());
    s = "\nHello " + _player.getName() + ", tell us some adjectives you would use to describe yourself.";
    type(s);
    Scanny in = new Scanny();
    String resp = removePunctuation(in.toString());
    String[] intro = resp.trim().toLowerCase().split(" ");
    s = "\nGreat... let's get started!";
    type(s);

    for (int i = 0; i < intro.length; i++) {
      try {
        startingAttraction += vibes.get(intro[i].toLowerCase());
      } catch (Exception e) { }
    }

    _jessica = new Jessica(startingAttraction);
    _richard = new Richard(startingAttraction);
    _brad = new Brad(startingAttraction);

  }
  public void play(){
    String s = "";

    if (_jessica.isOver() && _richard.isOver() && _brad.isOver()) {
      _gameOver = true;
      s = "You've struck out with ALL of them. GAME OVER.";
      type(s);
    }
    else {
      new ImageOpen("jessica_portrait.png");
      if (_firstTime) type("\n\033[3mA girl comes up to you, you think you've heard about her. What's her name? Jessica? Yes that's it. She's pretty, but seems to be a bit on the simpler side. \033[0m\n");
      while (!(_jessica.getStage().get(0).interact()));
      if (_firstTime) type("\n\033[3mA boy comes up to you, he's a total stud. You definetely know who he is. Brad. The certified sigma male of the school. Captain of the lacrosse team and knows how to have a good time. \033[0m\n");
      while (!(_brad.getStage().get(0).interact()));
      if(_firstTime) _firstTime = false;
    }
    if (!_gameOver) play();
  }

//Moved to Charactar
/*  public int probeTree(Charactar character){
    int option = 0;
    int bestLike = Integer.MIN_VALUE;
    for (int i = 0; i < character.getStage().get(0).getChildren().size(); i++) {
      int like = probeTreeHelper(character.getStage().get(0).getChildren().get(i));
      if (like > bestLike) {
        bestLike = like;
        option = i;
      }
    }
    return option+1; //+1 b/c when the player sees their list of options, it starts at 1, not 0, but option is the index of the array
  }

  public int probeTreeHelper(TreeNode node) {
    if (node.getChildren().size() == 0) {
      return 0;
    }
    else {
      int bestLike = Integer.MIN_VALUE;
      for (int i = 0; i < node.getChildren().size(); i++) {
        int like = node.getChildrenLikeChanges().get(i) + probeTreeHelper(node.getChildren().get(i));
        if (like > bestLike) {
          bestLike = like;
        }
      }
      return bestLike;
    }
  } */

  //to print stuff so it looks like it's being typed out
  public static void type(String s){
    String punc = ",.?!-";
    for(int i = 0; i < s.length(); i++){
      System.out.print(s.charAt(i));
      if (punc.indexOf(s.charAt(i)) >= 0) {
        delay(200);
      }
      else {
        delay(35);
      }
    }
    System.out.println("");
  }
  // Built in delay
  public static void delay(int milliseconds) {
    long beginTimer = System.currentTimeMillis();
    while (System.currentTimeMillis() - beginTimer < milliseconds) {
      continue;
    }
  }

  /**
   * Returns the word after removing any beginning or ending punctuation
   */
  public static String removePunctuation(String word) {
      while (word.length() > 0 && !Character.isAlphabetic(word.charAt(0))) {
          word = word.substring(1);
      }
      while (word.length() > 0 && !Character.isAlphabetic(word.charAt(word.length() - 1))) {
          word = word.substring(0, word.length() - 1);
      }

      return word;
  }

  public static void main(String[] args) {
    Woo game = new Woo();
    game.introduction();
    game.play();
  }

}
