package net.kapil.urlgenerator.service;

import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
public class UrlShortenerServiceImpl implements UrlShortenerService {
    private static final int RADIX = 36;
    private static final String PIPE = "-";
    private static final String PREFIX = "http://tinyurl/";

    @Override
    public String getShortUrl(final String originalUrl) {
        return shortenUrl(originalUrl);
    }

    private String shortenUrl(final String url) {
        if (StringUtils.isEmpty(url)) {
            throw new InvalidURLException("The URL must not be null or empty.");
        }

        boolean isSupportedProtocol = ProtocolType.contains(url);
        if (!isSupportedProtocol) {
            throw new InvalidURLException("The given URL contains invalid protocol.");
        }

        String hexValue = Integer.toString(url.hashCode(), RADIX);
        if (hexValue.startsWith(PIPE)) {
            hexValue = hexValue.substring(1);
        }

        return PREFIX + hexValue;
    }
}
