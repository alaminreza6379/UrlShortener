package com.torloksz.urlshortener.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "url_shortened")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UrlMapping {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(nullable = false,length = 1000)
    private String url;

    @Column(nullable = false,length = 10,unique = true)
    private String shortUrl;

    private int clicked;

}
