package com.flatironschool.fizzbuzz;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by altyus on 6/26/14.
 */
public class FizzBuzz {

    private Integer startNumber;
    private Integer endNumber;

    public FizzBuzz(Integer start, Integer end){
       this.startNumber = start;
        Log.d("tag","THIS IS MY MESSAGE");
        this.endNumber = end;
    }

    public Integer getStartNumber() {
        return startNumber;
    }

    public void setStartNumber(Integer startNumber) {
        this.startNumber = startNumber;
    }

    public Integer getEndNumber() {
        return endNumber;
    }

    public void setEndNumber(Integer endNumber) {
        this.endNumber = endNumber;
    }

    //Start Here
    public String[] fizzBuzzes() {
        Integer realStart = this.getStartNumber();
        Integer realEnd = this.getEndNumber();
        Integer numberOfItems = realEnd-realStart+1;

        if (realStart <0 || realEnd <0)
        {
            realStart = 0;
            numberOfItems=100+1;
        }

        String[] answer = new String[numberOfItems];

        for (Integer i=0; i<numberOfItems; i++)
        {
            if (realStart==0)
            {
                answer[i]=realStart.toString();
            } else if (realStart%15==0)
            {
                answer[i] = "FizzBuzz";
            } else if (realStart%5 ==0)
            {
                answer[i] = "Buzz";
            } else if (realStart%3 == 0)
            {
                answer[i] = "Fizz";
            } else
            {
                answer[i] = realStart.toString();
            }
            realStart++;
        }

        return answer;
    }

}
