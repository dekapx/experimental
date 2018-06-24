package com.dekapx.springbootdocker.service;

import com.dekapx.springbootdocker.dto.ServerDto;
import org.springframework.stereotype.Service;

@Service
public class ServerServiceImpl implements ServerService {
    @Override
    public ServerDto findById(long id) {
        return ServerDto.builder()
                .id(1L)
                .name("Dell PowerEdge T20")
                .build();
    }
}
