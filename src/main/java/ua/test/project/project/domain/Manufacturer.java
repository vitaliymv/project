package ua.test.project.project.domain;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

@Setter
@Getter

@Entity
@Table(name = "manufact")
public class Manufacturer {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "name", nullable = false, unique = true)
    private String name;

    @OneToMany(mappedBy = "manufacturer", fetch = FetchType.EAGER,
                                    cascade = CascadeType.ALL)
    private List<Model> models;

}
