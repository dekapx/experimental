package com.dekapx.springbootdocker.service;

import com.dekapx.springbootdocker.dto.ServerDto;

public interface ServerService {
    ServerDto findById(long id);
}
