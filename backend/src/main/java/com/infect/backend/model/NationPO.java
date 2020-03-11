package com.infect.backend.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * nation
 * @author
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class NationPO implements Serializable {
    private Integer id;

    /**
     * 更新时间戳
     */
    private Long modifytime;

    /**
     * 现有确诊
     */
    private Integer currentconfirmedcount;

    /**
     * 累计确诊
     */
    private Integer confirmedcount;

    /**
     * 疑似病例
     */
    private Integer suspectedcount;

    /**
     * 治愈
     */
    private Integer curedcount;

    /**
     * 死亡
     */
    private Integer deadcount;

    /**
     * 现有重症
     */
    private Integer seriouscount;

    /**
     * 疑似新增
     */
    private Integer suspectedincr;

    /**
     * 现有确诊新增
     */
    private Integer currentconfirmedincr;

    /**
     * 累计确诊新增
     */
    private Integer confirmedincr;

    /**
     * 治愈新增
     */
    private Integer curedincr;

    /**
     * 死亡新增
     */
    private Integer deadincr;

    /**
     * 重症新增
     */
    private Integer seriousincr;

    private static final long serialVersionUID = 1L;
}
