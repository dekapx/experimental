package net.kapil.urlgenerator.service;

import net.kapil.urlgenerator.domain.UrlEntity;
import net.kapil.urlgenerator.dto.UrlShortenerRequestDto;
import net.kapil.urlgenerator.dto.UrlShortenerResponseDto;
import net.kapil.urlgenerator.repository.UrlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;

@Service
public class UrlServiceImpl implements UrlService {
    @Autowired
    private UrlShortenerService urlShortenerService;

    @Autowired
    private UrlRepository urlRepository;

    @Autowired
    public UrlServiceImpl(final UrlShortenerService urlShortenerService) {
        this.urlShortenerService = urlShortenerService;
    }

    @Override
    public UrlShortenerResponseDto generateAndSaveUrl(final UrlShortenerRequestDto requestDto) {
        final var shortUrl = urlShortenerService.getShortUrl(requestDto.getOriginalUrl());

        final UrlEntity urlEntity = new UrlEntity();
        urlEntity.setOriginalUrl(requestDto.getOriginalUrl());
        urlEntity.setShortenUrl(shortUrl);
        urlEntity.setLastUpdateDate(new Timestamp(System.currentTimeMillis()));
        urlRepository.save(urlEntity);



        UrlShortenerResponseDto responseDto = UrlShortenerResponseDto.builder().shortenUrl(shortUrl).build();

        return responseDto;
    }
}
