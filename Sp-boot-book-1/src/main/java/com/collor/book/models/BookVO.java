package com.collor.book.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder

//Entity 객체(database 에 table), 테이블과 같음
@Entity
// Table 의 이름을 지정하고 싶을때
// 지정하지 않으면 BookVO 가 이름이 됨
@Table(name = "tbl_books")
public class BookVO {
    @Id
    // 칼럼의 이름을 다른걸 쓰고싶을때(가급적이면 권장x), 13자리 값으로 지정
    // @Column(name = "b_isbn", length = 13)
    @Column(name = "isbn", length = 13)
    private String isbn;

    private String title;
    private String link;
    private String image;
    private String author;
    private String discount;
    private String publisher;
    private String pubdate;
    private String description;
}
