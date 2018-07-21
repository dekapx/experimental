package net.kapil.urlgenerator.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class UrlShortenerResponseDto {
    private String shortenUrl;
}
