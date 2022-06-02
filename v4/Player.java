/*
AKH+D: Hugo Jenkins, Ariella Katz, Kaitlin Ho, Boary, Tom, Apple
APCS pd6
FP -- Are You a Player?
2022-05-26
*/

import java.util.ArrayList;
public class Player{

private ArrayList<Character> _rank;

public Player() {
  _rank = new ArrayList<Character>();
  _rank.add(new Brad());
  _rank.add(new Jessica());
  _rank.add(new Richard());
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

//sorts the characters based on how much they like the protagonist (likeabliity)
// public void sortRank(){
//
// }

}
