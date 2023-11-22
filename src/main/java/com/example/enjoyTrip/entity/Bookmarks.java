package com.example.enjoyTrip.entity;

import javax.persistence.*;

import lombok.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Builder
//마이페이지
//user_id로 북마크 한것들 불러오기.
//불러오면 attraction_id로 조회해서 뿌려주기.
public class Bookmarks {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bookmark_id")
    private int id;

//    @OneToOne(fetch = FetchType.LAZY)
    @Column(name = "attraction_id")
    private int attractionId;

    @ManyToOne
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "user_id")
    private User user;
    


}
