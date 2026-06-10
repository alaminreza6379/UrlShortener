package com.torloksz.urlshortener.controller;

import com.torloksz.urlshortener.dto.RequestDTO;
import com.torloksz.urlshortener.dto.ResponseDTO;
import com.torloksz.urlshortener.entity.UrlMapping;
import com.torloksz.urlshortener.service.ShortenerService;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class Controller {
    private final ShortenerService shortenerService;

    @PostMapping("/shorten")
    public ResponseDTO shorten(@RequestBody RequestDTO request) {
        UrlMapping urlMapping = shortenerService.generate(request.url());
        return new ResponseDTO(
          urlMapping.getUrl(),
          "http://localhost:8080/api/"+urlMapping.getShortUrl()
        );
    }
    @GetMapping("/{code}")
    public void generate(@PathVariable String code, HttpServletResponse response) throws IOException {
        UrlMapping urlMapping = shortenerService.getByShortCode(code);
        response.sendRedirect(urlMapping.getUrl());
    }
}
