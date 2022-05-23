package com.latestDevelopers.service.impl;

import com.latestDevelopers.dto.KisiDto;
import com.latestDevelopers.entity.Adres;
import com.latestDevelopers.entity.Kisi;
import com.latestDevelopers.repo.AdresRepository;
import com.latestDevelopers.repo.KisiRepository;
import com.latestDevelopers.service.KisiService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class KisiServiceImpl implements KisiService {
    private final KisiRepository kisiRepository;
    private final AdresRepository adresRepository;

    @Override
    @Transactional
    public KisiDto save(KisiDto kisiDto) {

        Kisi kisi = new Kisi();
        kisi.setAdi(kisiDto.getAdi());
        kisi.setSoyadi(kisiDto.getSoyadi());
        final Kisi kisiDb = kisiRepository.save(kisi);

        List<Adres> liste = new ArrayList<>();
        kisiDto.getAdresler().forEach(item -> {
            Adres adres = new Adres();
            adres.setAdres(item);
            adres.setAdresTip(String.valueOf(Adres.AdresTip.DIGER));
            adres.setAktif(true);
            adres.setKisi(kisiDb);
            liste.add(adres);
        });

        adresRepository.saveAll(liste);
        kisiDto.setId(kisiDb.getId());
        return kisiDto;
    }

    @Override
    public void delete(long id) {

    }

    @Override
    public List<KisiDto> getall() {
        List<Kisi> kisiler = kisiRepository.findAll();

        List<KisiDto> kisiDtos = new ArrayList<>();
        kisiler.forEach(it -> {
            KisiDto kisiDto = new KisiDto();
            kisiDto.setId(it.getId());
            kisiDto.setAdi(it.getAdi());
            kisiDto.setSoyadi(it.getSoyadi());
            kisiDto.setAdresler(it.getAdresler().stream()
                    .map(Adres::getAdres).collect(Collectors.toList()));
            kisiDtos.add(kisiDto);
        });

        return kisiDtos;
    }

    @Override
    public Page<KisiDto> getall(Pageable pageable) {
        return null;
    }
}
