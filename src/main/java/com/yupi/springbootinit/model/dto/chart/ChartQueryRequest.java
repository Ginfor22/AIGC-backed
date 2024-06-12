package com.yupi.springbootinit.model.dto.chart;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.yupi.springbootinit.common.PageRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * 查询请求
 *
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class ChartQueryRequest extends PageRequest implements Serializable {

    /**
     id
     */
    @TableId(type = IdType.ASSIGN_ID)
    private Long id;
private String name;
private String goal;
private  Long userId;
    /**
     * 图表数据
     */
    private String chartType;

    private static final long serialVersionUID = 1L;
}