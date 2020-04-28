package ua.test.project.project.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter


@Entity

@Table(name = "parts")
public class Parts {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String name;

    private String description;

    @Column(nullable = false)
    private Float price;

    @Column(nullable = false)
    private Integer count;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "model_id", nullable = false)
    private Model model;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "category_id", nullable = false)
    private Category category;

    @ManyToMany
    @JoinTable(name="parts_in_bucket",
            joinColumns = @JoinColumn(name="part_id", referencedColumnName="id"),
            inverseJoinColumns = @JoinColumn(name="bucket_id", referencedColumnName="id"))
    private Set<Bucket> buckets = new HashSet<>();
}