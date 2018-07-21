package net.kapil.urlgenerator.service;

import net.kapil.urlgenerator.dto.UrlShortenerRequestDto;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UrlServiceTest {

    @Autowired
    private UrlService urlService;

    @Test
    public void generateShortUrlAndSave() throws Exception {
        final var url = "http://localhost:9090/api/ping";
        var requestDto = UrlShortenerRequestDto.builder().originalUrl(url).build();
        final var responseDto = urlService.generateAndSaveUrl(requestDto);
        assertThat(responseDto.getShortenUrl()).isNotNull().isNotEmpty();
    }
}
