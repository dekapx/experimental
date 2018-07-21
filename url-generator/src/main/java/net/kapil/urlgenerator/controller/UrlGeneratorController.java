package net.kapil.urlgenerator.controller;

import net.kapil.urlgenerator.dto.UrlShortenerRequestDto;
import net.kapil.urlgenerator.service.UrlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.HttpStatus.CONFLICT;

@RestController
@RequestMapping("/api")
public class UrlGeneratorController {
    @Autowired
    private UrlService urlService;

    @PostMapping(value = "/createUrl")
    public ResponseEntity createUrl(@RequestBody final UrlShortenerRequestDto requestDto) {
        final var responseDto = urlService.generateAndSaveUrl(requestDto);
        return new ResponseEntity(responseDto, HttpStatus.OK);
    }

    @ExceptionHandler
    @ResponseStatus(CONFLICT)
    public String handleException(final Exception e) {
        return e.getMessage();
    }
}
