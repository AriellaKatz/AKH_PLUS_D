/*
AKH+D: Hugo Jenkins, Ariella Katz, Kaitlin Ho, Boary, Tom, Apple
APCS pd6
FP -- Are You a Player?
2022-05-26
*/

import java.util.ArrayList;
public class Player{

private ArrayList<Character> _rank;
private final ArrayList<Character> _order;
private String _name;

public Player() {
  _rank = new ArrayList<Character>();
  _rank.add(new Brad());
  _rank.add(new Jessica());
  _rank.add(new Richard());
  _order = new ArrayList<Character>();
  _order.add(_rank.get(0));
  _order.add(_rank.get(1));
  _order.add(_rank.get(2));
  _name = "notYet";
}

public void sortRank() {
 ArrayList<Character> temp = new ArrayList<Character>();
 int k = 0;
 while (_rank.size() > 0) {
   for (int i = 0; i < _rank.size(); i++) {
     k = 0;
     if (_rank.get(i).getAttraction() > _rank.get(k).getAttraction()) {
       k = i;
     }
   }
   temp.add(_rank.get(k));
   _rank.remove(k);
 }
 _rank = temp;
}

public ArrayList<Character> getRank() {
  return _rank;
}

// Accessor for _name
public String getName() {
  return _name;
}

// Changes _name
public String setName(String name) {
  String old = _name;
  _name = name;
  return old;
}

//sorts the characters based on how much they like the protagonist (likeabliity)
// public void sortRank(){
//
// }

}
