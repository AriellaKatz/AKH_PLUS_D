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
    String s = "Meet Jessica: ";
    s += "flirty and fickle";
    type(s);
    delay(1000);
    s = "Meet Brad: ";
    s += "lax frat bro";
    type(s);
    delay(1000);
    s = "Meet Richard: ";
    s += "student president";
    type(s);
    delay(1000);

    int startingAttraction = 0;
    s = "What is your name good fellow?";
    type(s);
    Scanner in = new Scanner(System.in);
    _player.setName(in.nextLine());
    s = "\nHello " + _player.getName() + ", tell us some adjectives you would use to describe yourself.";
    type(s);
    in = new Scanner(System.in);
    String resp = removePunctuation(in.nextLine());
    String[] intro = resp.trim().toLowerCase().split(" ");
    s = "\nGreat... let's get started!";
    type(s);

    for (int i = 0; i < intro.length; i++) {
      try {
        startingAttraction += vibes.get(intro[i].toLowerCase());
      } catch (Exception e) { }
    }

    _jessica = new Jessica(_player, startingAttraction);
    _richard = new Richard(_player, startingAttraction);
    _brad = new Brad(_player, startingAttraction);

    _player.addToRank(_jessica);
    _player.addToRank(_brad);
    _player.addToRank(_richard);

  }

  public void play(){
    String s = "";

    if (_jessica.isOver() && _brad.isOver()) {
      _gameOver = true;
      s = "You've struck out with ALL of them. GAME OVER.";
      type(s);
    }
    else {
      //Richard
      if (_firstTime) {
        type("\n\033[3mYou accidentally bump into someone. He looks annoying. It's Richard, the student president. \033[0m\n");
      }
      if (!_richard.isOver() && !_richard.hasFallen()) while (!(_richard.getStage().get(0).interact()));
      System.out.println("\033[H\033[2J");
      if (_firstTime) {
        _firstTime = false;
      }

      //Brad
      if (_firstTime) {
        type("\n\033[3mA boy comes up to you, he's a total stud. You definitely know who he is. Brad. The certified sigma male of the school. Captain of the lacrosse team and knows how to have a good time. \033[0m\n");
      }
      new ImageOpen("brad_portrait.png");
      if (!_brad.isOver()) while (!(_brad.getStage().get(0).interact()));
      if (_brad.hasFallen()) { System.out.println("YOU WIN!"); _gameOver = true; return; }
      System.out.println("\033[H\033[2J");

      //Jessica
      if (!_player.isDead()) {
        if (_firstTime) {
          type("\n\033[3mA girl comes up to you, you think you've heard about her. What's her name? Jessica? Yes that's it. She's pretty, but seems to be a bit on the simpler side. \033[0m\n");
        }
        if (!_jessica.isOver()) {
          new ImageOpen("jessica_portrait.png");
          while (!(_jessica.getStage().get(0).interact()));
        }
        if (_jessica.hasFallen()) {System.out.println("YOU WIN!"); _gameOver = true; return; }
        System.out.println("\033[H\033[2J");
      }
      else {
        return;
      }
      _player.sortRank();
      printRank();
    }
    if (!_gameOver) play();
  }


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

  // Accessor for _player
  public Player getPlayer() {
    return _player;
  }

  // Accessor for _jessica
  public Charactar getJ() {
    return _jessica;
  }

  // Accessor for _brad
  public Charactar getB() {
    return _brad;
  }

  // Accessor for _richard
  public Charactar getR() {
    return _richard;
  }

  public void printRank() {
    ArrayList<Charactar> a = _player.getRank();
    String s = "Your love interests, in order from most to least interested in you: ";
    for (int i = 0; i < a.size(); i++) {
      s += "\n\t" + a.get(i).getName() + ": " + a.get(i).getStatus();
    }
    s += "\n";
    type(s);
  }

  public static void main(String[] args) {
    Woo game = new Woo();
    game.introduction();
    System.out.println("\033[H\033[2J");
    game.play();
  }

}
