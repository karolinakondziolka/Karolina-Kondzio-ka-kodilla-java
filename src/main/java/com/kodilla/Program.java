import java.util.*;
import java.lang.*;
import java.io.*;
import java.time.*;

class Program
{
    public static void main (String[] args)
    {
        class Clock
        {
            LocalTime clockTime;



            public Clock(int hour, int minute)
            {
                this.clockTime = LocalTime.of(hour,minute);
            }

            public LocalTime getClockTime()
            {
                return clockTime;
            }

            public void addMinute()
            {
                this.clockTime=this.clockTime.plusMinutes(1);
            }

        }

        Clock clock1 = new Clock(4,30);
        Clock clock2 = new Clock(5,23);
        Clock clock3 = new Clock(8,49);
        Clock clock4 = new Clock(11,59);

        LinkedList<Clock> listOfClocks = new LinkedList <Clock>();
        listOfClocks.add(clock1);
        listOfClocks.add(clock2);
        listOfClocks.add(clock3);
        listOfClocks.add(clock4);

        System.out.println(clock1.getClockTime());
        System.out.println(clock2.getClockTime());
        System.out.println(clock3.getClockTime());
        System.out.println(clock4.getClockTime());

        System.out.println("Adding 1 minute to each clock");

        for(Clock theClock: listOfClocks)
        {
            System.out.println(theClock.clockTime.plusMinutes(1));
        }



    }
}


