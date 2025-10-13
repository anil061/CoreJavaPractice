package collections;

import java.util.Arrays;
import java.util.List;

public class BuyAndSell {
    public static void main(String[] args) {
        int[] list = {5,8,1,0,10,2,4,15};
        int[] ar = {};
        int index = 0;
        int day = 2;
        sumofStockMarketValues(list, index, day);
    }

    private static void sumofStockMarketValues(int[] list, int index,int day) {
        int diff = 0;
        int diff2 = 0;
        int sum1 = 0;
        int sum2 = 0;
        for(int i = index; i < list.length-1; i++){
           diff =  list[i+1]- list[i];
           if(diff > 0){
               sum1+= diff;
           }
        }
        System.out.println("sume value " + sum1);
        for(int j = day; j < list.length-1; j++){
            diff2 =  list[j+1]- list[j];
            if(diff2 > 0){
                sum2+= diff2;
            }
        }
        System.out.println("sume value " + sum2);
       int maxValues = Math.max(sum1, sum2);
        System.out.println(" maxValues "+ maxValues);
    }

    }
