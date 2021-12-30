
/**
* Hacker Rank Challenge Java Prep
* Java Comparator
* Given an array of  Player objects, write a comparator that sorts them in order of decreasing score; 
* if  or more players have the same score, sort those players alphabetically by name. 
* To do this, you must create a Checker class that implements the Comparator interface, 
* then write an int compare(Player a, Player b) method implementing the Comparator.compare(T o1, T o2) method.
* 
*
* @author  hacker rank
* @version 1.0
* @since   2021-12-30
*/
public class Player {
    String name;
    int score;
    
    Player(String name, int score){
        this.name = name;
        this.score = score;
    }

}
