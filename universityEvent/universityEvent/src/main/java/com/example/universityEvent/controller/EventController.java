package com.example.universityEvent.controller;

import com.example.universityEvent.model.Event;
import com.example.universityEvent.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v2/event")
public class EventController {
    @Autowired
    private EventService eventService;
    @GetMapping("find-all")
    public List<Event> findAllEvent(){
        return eventService.findAll();
    }
    @GetMapping("find-event/id/{id}")
    public Event findEventById(@PathVariable int id){
        return EventService.findById(id);
    }
@PostMapping("/add-event")
    public void addEvent(@RequestBody Event event){
        eventService.addNewEvent(event);
}
@DeleteMapping("delete-event/id/{id}")
    public void deleteEvn(@PathVariable int id){
         eventService.deleteEvent(id);
}
@GetMapping("/find-event/date/{date}")
    public Event findEventByDate(@PathVariable String date){
        return eventService.findByDate(date);
}
}
