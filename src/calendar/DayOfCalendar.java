package calendar;

import gymevents.Event;

import java.util.ArrayList;

/**
 * Created by dmitry on 10/27/14.
 * One or multiple events can be attached to the one day
 */
public class DayOfCalendar {
    private ArrayList<Event> events = new ArrayList<Event>();

    public void addEvent(Event event){
        events.add(event);
    }
}
