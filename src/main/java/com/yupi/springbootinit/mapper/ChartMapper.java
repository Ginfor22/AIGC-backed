package com.yupi.springbootinit.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yupi.springbootinit.model.entity.Chart;

import java.util.List;
import java.util.Map;

/**
* @author lemon
* @description 针对表【chart(图表信息表)】的数据库操作Mapper
* @createDate 2024-04-16 15:11:56
* @Entity com.yupi.springbootinit.model.entity.Chart
*/
public interface ChartMapper extends BaseMapper<Chart> {
    List<Map<String, Object>> queryChartData(String querySql);

}





