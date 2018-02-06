package com.bigdata.recomnd.rankusercount;

import com.bigdata.recomnd.rankuercount.entity.RankUserCount;
import com.bigdata.recomnd.rankusercount.services.RandUserCountRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RankuserCountApplicationTests {

	@Autowired
	private RandUserCountRepository randUserCountRepository;

	@Test
	public void contextLoads() {

//		RankUserCount rankUserCount = randUserCountRepository.save(new RankUserCount("1","a12390781",2008));
		List<RankUserCount> list= randUserCountRepository.findByPid("a12390781");
		RankUserCount rankUserCount = list.get(0);
		System.out.println(rankUserCount.getCount());
	}

}
