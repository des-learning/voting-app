package com.example.application.models;

import jakarta.persistence.*;

import java.util.Objects;

// https://vaadin.com/docs/latest/building-apps/application-layer/persistence/repositories/jpa
@Entity
@Table(name = "votes")
public class Vote {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "vote")
    private Integer vote;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getVote() {
        return vote;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVote(Integer vote) {
        this.vote = vote;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vote vote1 = (Vote) o;
        return Objects.equals(getId(), vote1.getId()) && Objects.equals(getName(), vote1.getName()) && Objects.equals(getVote(), vote1.getVote());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getVote());
    }
}
