package org.example.domain.posts;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor      //기본 생성자 자동 추가
@Entity     //테이블과 링크될 클래스임을 나타낸다
            //클래스의 카멜케이스 이름(ex - SalesManager.java) <-> 테이블의 언더스코어 네이밍(ex - sales_manager table) 매칭
public class Posts {

    @Id     //해당 테이블의 PK 필드를 나타냄
    @GeneratedValue(strategy = GenerationType.IDENTITY)     //PK의 생성 규칙을 나타냄. IDENTITY는 기본키 생성을 DB에 위임
    private Long id;

    @Column(length = 500,nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    @Builder
    public Posts(String title, String content, String author){
        this.title = title;
        this.content = content;
        this.author = author;
    }


}
