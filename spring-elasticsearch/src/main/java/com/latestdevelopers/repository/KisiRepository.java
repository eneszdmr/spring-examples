package com.latestdevelopers.repository;

import com.latestdevelopers.Entity.Kisi;
import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Repository
public interface KisiRepository extends ElasticsearchRepository<Kisi,String> {

    @Query("{\"bool\":{\"must\": [{\"match\" :{\"ad\" : \"70\"}}]}}")
    List<Kisi> getByCustomQuery(String search);

    List<Kisi> findByAdLikeOrSoyadLike(String ad,String soyad);
}
