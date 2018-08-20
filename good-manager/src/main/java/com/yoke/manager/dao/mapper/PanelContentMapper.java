package com.yoke.manager.dao.mapper;

import com.yoke.manager.pojo.PanelContent;
import com.yoke.manager.pojo.PanelContentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface PanelContentMapper extends Mapper<PanelContent> {
    long countByExample(PanelContentExample example);

    int deleteByExample(PanelContentExample example);

    List<PanelContent> selectByExample(PanelContentExample example);

    int updateByExampleSelective(@Param("record") PanelContent record, @Param("example") PanelContentExample example);

    int updateByExample(@Param("record") PanelContent record, @Param("example") PanelContentExample example);
}