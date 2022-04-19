package com.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table
@Getter
@Setter
@JsonIdentityInfo(
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "id"
)
public class Quiz {
    @Id
    @GeneratedValue
    private int id;
    @Column
    private String title;

    @OneToMany(mappedBy = "quiz", fetch = FetchType.EAGER)
    @ToString.Exclude
    private List<Question> questions = new ArrayList<>();

}
