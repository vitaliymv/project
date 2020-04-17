package ua.test.project.project.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@ToString

@Entity
@Table(name = "bucket")
public class Bucket {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private Float price;

    @ManyToMany(fetch = FetchType.EAGER, mappedBy = "buckets")
    private Set<Parts> parts = new HashSet<>();

    @OneToOne(optional = false)
    @JoinColumn(name="user_id", unique = true, nullable = false, updatable = false)
    private User user;

}
