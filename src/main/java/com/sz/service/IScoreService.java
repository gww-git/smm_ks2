package com.sz.service;

import com.sz.admin.ScorePage;
import com.sz.admin.Scores;
import com.sz.entity.II;
import com.sz.entity.Score;

import java.util.List;

public interface IScoreService {

    public int insertScore(Score score);

    public int selectByScore(int id);

    public List<Scores> selectByUserAll(II ii);

    List<ScorePage> selectByScorePage(int id);
}
