package com.sz.mapper;

import com.sz.admin.ScorePage;
import com.sz.admin.Scores;
import com.sz.entity.II;
import com.sz.entity.Score;
import com.sz.entity.ScoreExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface ScoreMapper {
    int insertScore(Score score);

    int selectScore(int id);

    List<Scores> selectByUserAll(II ii);

    List<ScorePage> selectByScorePage(int id);


}