import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
* Hacker Rank Challenge Java Prep
* Java Comparator
* Given an array of  Player objects, write a comparator that sorts them in order of decreasing score; 
* if  or more players have the same score, sort those players alphabetically by name. 
* To do this, you must create a Checker class that implements the Comparator interface, 
* then write an int compare(Player a, Player b) method implementing the Comparator.compare(T o1, T o2) method.
* 
*
* @author  lrasata
* @version 1.0
* @since   2021-12-30
*/
public class Checker implements Comparator<Player>{

	@Override
	public int compare(Player p1, Player p2) {
		if (p1.score < p2.score) {
			return 1;
		}
		if (p1.score > p2.score) {
			return -1;
		}
		if (p1.score == p2.score) {
			List<String> namesList = new ArrayList<String>();
			namesList.add(p1.name);
			namesList.add(p2.name);
			Collections.sort(namesList);
			if(p1.name.equals(namesList.get(0))) {
				return -1;
			} else {
				return 1;
			}
		}
		return 0;
	}

}
