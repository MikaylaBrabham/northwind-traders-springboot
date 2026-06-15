package com.pluralsight.northwind_traders_.springboot.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;
public class session {
    //added from wrkb 9

    @Entity
    @Table(name = "sessions")
    public class Session {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String title;
        private String speaker;
        private LocalDateTime startTime;
        private LocalDateTime endTime;
        private String room;
        private String track;
// Getters and setters omitted
    }
}
