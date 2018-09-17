// IMPORT LIBRARY PACKAGES NEEDED BY YOUR PROGRAM
// SOME CLASSES WITHIN A PACKAGE MAY BE RESTRICTED
// DEFINE ANY CLASS AND METHOD NEEDED
import java.util.List;
import java.util.*;
// CLASS BEGINS, THIS CLASS IS REQUIRED
public class AmazonSteakHouses
{
    // METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
    List<List<Integer>> nearestXsteakHouses(int totalSteakhouses, 
                                         List<List<Integer>> allLocations, 
                                         int numSteakhouses)
	{
	    
        List<List<Integer>> res = new ArrayList<>();
        Map<Double, ArrayList<List<Integer>>> distanceMap = new TreeMap<>();

        for (List<Integer> coordinates : allLocations) {

            int x = coordinates.get(0);
            int y = coordinates.get(1);

            double distance = Math.sqrt(x * x + y * y);
            if (!distanceMap.containsKey(distance)) {
                distanceMap.put(distance, new ArrayList<>());
            }
            distanceMap.get(distance).add(coordinates);
        }

        for (List<List<Integer>> coordinateList : distanceMap.values()) {

            for (List<Integer> coordinates : coordinateList) {

                if (numSteakhouses > 0) {
                    res.add(coordinates);
                    numSteakhouses--;
                } else {
                    return res;
                }
            }

        }

        return res;
    }
}