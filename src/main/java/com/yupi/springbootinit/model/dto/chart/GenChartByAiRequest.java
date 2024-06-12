package com.yupi.springbootinit.model.dto.chart;

import lombok.Data;

import java.io.Serializable;

/**
 * 文件上传请求
 *
 * 

 */
@Data
public class GenChartByAiRequest implements Serializable {

    /**
     * 业务
     */
    private String name;
    private String goal;
    private String chartType;

    private static final long serialVersionUID = 1L;
}