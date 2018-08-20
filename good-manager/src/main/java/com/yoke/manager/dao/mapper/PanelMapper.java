package com.yoke.manager.dao.mapper;

import com.yoke.manager.pojo.Panel;
import com.yoke.manager.pojo.PanelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface PanelMapper extends Mapper<Panel> {
    long countByExample(PanelExample example);

    int deleteByExample(PanelExample example);

    List<Panel> selectByExample(PanelExample example);

    int updateByExampleSelective(@Param("record") Panel record, @Param("example") PanelExample example);

    int updateByExample(@Param("record") Panel record, @Param("example") PanelExample example);
}