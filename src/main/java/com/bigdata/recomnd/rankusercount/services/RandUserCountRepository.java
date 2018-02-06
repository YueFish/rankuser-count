package com.bigdata.recomnd.rankusercount.services;

import com.bigdata.recomnd.rankusercount.entity.RankUserCount;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface RandUserCountRepository extends MongoRepository<RankUserCount, String>{
    @Override
    List<RankUserCount> findAll();

    @Query("{'pid':?0}")
    List<RankUserCount> findByPid(String pid);
}
