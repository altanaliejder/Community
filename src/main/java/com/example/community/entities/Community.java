package com.example.community.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

//community -> id, name, school_id, category_id
@Data
@AllArgsConstructor
@Entity
@NoArgsConstructor
@Table(name = "communities")
public class Community {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    @OneToMany(mappedBy = "community")
    private List<UserCommunity> userCommunities;
}
