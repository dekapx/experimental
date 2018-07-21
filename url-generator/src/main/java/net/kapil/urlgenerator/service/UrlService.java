package net.kapil.urlgenerator.service;

import net.kapil.urlgenerator.dto.UrlShortenerRequestDto;
import net.kapil.urlgenerator.dto.UrlShortenerResponseDto;

public interface UrlService {
    UrlShortenerResponseDto generateAndSaveUrl(UrlShortenerRequestDto requestDto);
}
