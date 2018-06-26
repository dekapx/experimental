package com.dekapx.springbootdocker.service;

import com.dekapx.springbootdocker.dto.ServerDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ServerServiceImpl implements ServerService {
    @Override
    public ServerDto find(final long id) {
        return ServerDto.builder()
                .id(1L)
                .name("Dell PowerEdge T20")
                .build();
    }

    @Override
    public List<ServerDto> findAll() {
        final List<ServerDto> dtos = new ArrayList<>();
        dtos.add(ServerDto.builder()
                .id(1L)
                .name("Dell PowerEdge T20")
                .build());
        dtos.add(ServerDto.builder()
                .id(2L)
                .name("Lenovo ThinkServer TS140")
                .build());
        dtos.add(ServerDto.builder()
                .id(3L)
                .name("Supermicro SuperWorkstation 5039A-IL")
                .build());
        dtos.add(ServerDto.builder()
                .id(4L)
                .name("Fujitsu Primergy TX1310 M1")
                .build());
        dtos.add(ServerDto.builder()
                .id(5L)
                .name("HP Proliant Microserver Gen8")
                .build());
        dtos.add(ServerDto.builder()
                .id(5L)
                .name("HP Proliant Microserver Gen8")
                .build());
        dtos.add(ServerDto.builder()
                .id(6L)
                .name("Lenovo ThinkServer TS440")
                .build());
        dtos.add(ServerDto.builder()
                .id(7L)
                .name("HP Proliant ML350 Gen 9")
                .build());
        dtos.add(ServerDto.builder()
                .id(8L)
                .name("Scan 3XS SER-T25")
                .build());
        dtos.add(ServerDto.builder()
                .id(9L)
                .name("Asus TS500")
                .build());
        return dtos;
    }
}
