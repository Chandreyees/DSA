package StackAndQueue.Easy;

import java.util.List;

public class GameOfTwoStacks {

    public static int twoStacks(int maxSum, List<Integer> a, List<Integer> b) {
        return getResult(a,b,maxSum,0,0);
    }

    private static int getResult(List<Integer> a, List<Integer> b, int maxSum, int sum, int counter) {
       getResult(a.subList(1,a.size()-1),b,maxSum,sum+a.get(0),counter+1);
       return 1;
    }
}
