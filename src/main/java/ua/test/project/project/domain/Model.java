package ua.test.project.project.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
@ToString

@Entity

@Table(name = "model")
public class Model {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String name;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "manufacturer_id", nullable = false)
    private Manufacturer manufacturer;

    @OneToMany(mappedBy = "model", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private Set<Parts> parts;

}
