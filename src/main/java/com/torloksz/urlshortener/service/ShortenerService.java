package com.torloksz.urlshortener.service;

import com.torloksz.urlshortener.dto.RequestDTO;
import com.torloksz.urlshortener.entity.UrlMapping;
import com.torloksz.urlshortener.repository.UrlRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.security.SecureRandom;

@Service
@RequiredArgsConstructor
public class ShortenerService {

    private final UrlRepository urlRepository;
    private static final String CHARS = "1234567890qwertyuioplkjhgfdsazxcvbnmQWERTYUIOPLKJHGFDSAZXCVBNM";
    private static final SecureRandom secure = new SecureRandom();

    public UrlMapping generate(String url) {

        String shortUrl;
        do{
            shortUrl = generateCode((int)(Math.random()*100%10)+1);
        } while(urlRepository.findByShortUrl(shortUrl).isPresent() || shortUrl.isEmpty());

        UrlMapping urlMapping = UrlMapping.builder()
                .url(url)
                .shortUrl(shortUrl)
                .clicked(0)
                .build();
        return urlRepository.save(urlMapping);
    }

    public UrlMapping getByShortCode(String shortUrl){
        UrlMapping urlMapping = urlRepository.findByShortUrl(shortUrl)
                .orElseThrow(()->new RuntimeException("URL NOT FOUND SIR..."));

        urlMapping.setClicked(urlMapping.getClicked()+1);
        urlRepository.save(urlMapping);

        return urlMapping;
    }

    public String generateCode(int len) {
        StringBuilder sb = new StringBuilder();
        for(int i=1;i<=len;i++) {
            sb.append((char)(CHARS.charAt(secure.nextInt(CHARS.length()))));
        }
        return sb.reverse().toString();
    }
}
