package com.stackroute.Muzix.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.context.annotation.PropertySource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.mongodb.core.mapping.Document;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Document(collection = "track")

public class Track {
    @Id
    private int id;
   // @Column
    private String name;
   // @Column(name="comment")
    private String comment;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Track() {
    }

    public Track(int id, String name, String comment) {
        this.id = id;
        this.name = name;
        this.comment = comment;
    }
}