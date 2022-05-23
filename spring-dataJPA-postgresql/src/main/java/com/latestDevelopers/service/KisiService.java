package com.latestDevelopers.service;

import com.latestDevelopers.dto.KisiDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface KisiService {

    KisiDto save(KisiDto kisiDto);

    void delete(long id);

    List<KisiDto> getall();

    Page<KisiDto> getall(Pageable pageable);
}
