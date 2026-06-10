package com.torloksz.urlshortener.dto;

public record ResponseDTO(
        String url,
        String shortUrl
) {
}
