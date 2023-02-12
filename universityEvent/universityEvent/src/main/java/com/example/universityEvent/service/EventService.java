package com.example.universityEvent.service;

import com.example.universityEvent.model.Event;
import com.example.universityEvent.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Service
public class EventService {
    private static List<Event> events = new ArrayList<>();
    private static int eventCount = 0;

    static {
        events.add(new Event(++eventCount, "party", "Ranchi", "10feb", "12;00 pm", "04:00 pm"));
        events.add(new Event(++eventCount, "Marriage", "Patna", "11feb", "12;00 pm", "04:00 pm"));
        events.add(new Event(++eventCount, "wedding function ", "Ranchi", "10feb", "12;00 pm", "04:00 pm"));
        events.add(new Event(++eventCount, "Bithday party", "Ranchi", "10feb", "12;00 pm", "04:00 pm"));
    }

    public List<Event> findAll() {
        return events;
    }

    public static Event findById(int id) {
        Predicate<? super Event> predicate = student -> student.getEventId() == id;
        Event event = events.stream().filter(predicate).findFirst().get();
        return event;
    }

    public void addNewEvent(Event event) {
        events.add(event);
    }

    public void deleteEvent(int id) {
        Predicate<? super Event> predicate = event -> event.getEventId() == id;
        events.removeIf(predicate);
    }

    public static Event findByDate(String date) {
        Predicate<? super Event> predicate = student -> student.getDate() == date;
        Event event = events.stream().filter(predicate).findFirst().get();
        return event;
    }
}