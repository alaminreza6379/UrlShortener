package com.torloksz.urlshortener.repository;

import com.torloksz.urlshortener.entity.UrlMapping;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UrlRepository extends JpaRepository<UrlMapping, Integer> {
    Optional<UrlMapping> findByShortUrl(String shortUrl);
}
