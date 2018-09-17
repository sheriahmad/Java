import java.util.*;
// IMPORT LIBRARY PACKAGES NEEDED BY YOUR PROGRAM
// SOME CLASSES WITHIN A PACKAGE MAY BE RESTRICTED
// DEFINE ANY CLASS AND METHOD NEEDED
// CLASS BEGINS, THIS CLASS IS REQUIRED
public class AmazonPrimeAir
{
   public static List<String> subStringsKDist(String inputString, int num)
    {
        Set<String> result = new HashSet<>();
        for (int i = 0; i <= inputString.length() - num; i++) {
            String subString = inputString.substring(i, i + num);
            if (subString.chars().distinct().count() == subString.length()) {
                result.add(subString);
            }
        }
        return new ArrayList<>(result);
    }

    public static List<List<Integer>> optimalUtilization(int maximumOperatingTravelDistance,
                                           List<List<Integer>> forwardShippingRouteList,
                                           List<List<Integer>> returnShippingRouteList) {

        List<List<Integer>> found = new ArrayList<>();
        List<List<Integer>> optimal = new ArrayList<>();
        int optimalDistant = 0;
        for (List forward : forwardShippingRouteList) {
            for (List retrn : returnShippingRouteList) {
                int totalDistant = (int) forward.get(1) + (int) retrn.get(1);
                if (totalDistant > optimalDistant && totalDistant <= maximumOperatingTravelDistance) {
                    optimalDistant = totalDistant;
                }
                List<Integer> shipping = new ArrayList<>();
                if (totalDistant == maximumOperatingTravelDistance) {
                    shipping.add((int) forward.get(0));
                    shipping.add((int) retrn.get(0));
                    found.add(shipping);
                } else if (totalDistant < maximumOperatingTravelDistance && totalDistant >= optimalDistant) {
                    if (!optimal.isEmpty()) {
                        optimal.remove(0);
                    }
                    shipping.add((int) forward.get(0));
                    shipping.add((int) retrn.get(0));
                    optimal.add(shipping);
                }
            }
        }
        if (found.isEmpty()) {
            return optimal;
        }
        return found;
    }
}