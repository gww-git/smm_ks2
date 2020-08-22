package com.sz.service.impl;

import com.sz.admin.ScorePage;
import com.sz.admin.Scores;
import com.sz.entity.II;
import com.sz.entity.Score;
import com.sz.mapper.ScoreMapper;
import com.sz.service.IScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScoreServiceimpl implements IScoreService{

    @Autowired
    private ScoreMapper scoreMapper;

    @Override
    public int insertScore(Score score) {
         scoreMapper.insertScore(score);
         return score.getScoreid(); //获取插入记录的id
    }

    @Override
    public int selectByScore(int id) {
        return scoreMapper.selectScore(id);
    }

    @Override
    public List<Scores> selectByUserAll(II ii) {
        return scoreMapper.selectByUserAll(ii);
    }


    @Override
    public List<ScorePage> selectByScorePage(int id) {
        return scoreMapper.selectByScorePage(id);
    }
}
