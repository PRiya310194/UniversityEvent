package com.example.universityEvent.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Event {
    int eventId;
    String eventName;
    String locationOfEvent;
    String date;
    String startTime;
    String endTime;

}
