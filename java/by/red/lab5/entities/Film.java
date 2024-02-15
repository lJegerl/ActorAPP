package by.red.lab5.entities;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "film")
public class Film {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "film_id")
    private int id;
    @Column(name = "name")
    private String name;
    @Basic
    @Temporal(TemporalType.DATE)
    @Column(name = "START_DATE")
    private Date startDate;

    public Film() {
        super();
    }

    public Film(String name, Date startDate) {
        super();
        this.name = name;
        this.startDate = startDate;
    }


    public Film(int id, String name, Date startDate) {
        super();
        this.id = id;
        this.name = name;
        this.startDate = startDate;
    }

    @ManyToMany(
            cascade = {CascadeType.PERSIST, CascadeType.MERGE}
    )
    @JoinTable(
            name = "film_actor",
            joinColumns = {@JoinColumn(name = "film_id")},
            inverseJoinColumns = {@JoinColumn(name = "actor_id")}
    )
    private List<Actor> actors;

    public int getId() {
        return id;
    }

    public Date getStartDate() {
        return startDate;
    }

    public String getName() {
        return name;
    }

    public List<Actor> getActors() {
        return actors;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public void setActors(List<Actor> actors) {
        this.actors = actors;
    }
}
