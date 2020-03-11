package com.infect.backend.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class NationVO {

    String modifytime;

    /**
     * 现有确诊
     */
    int currentconfirmedcount;

    /**
     * 累计确诊
     */
    int confirmedcount;

    /**
     * 疑似病例
     */
    int suspectedcount;

    /**
     * 治愈
     */
    int curedcount;

    /**
     * 死亡
     */
    int deadcount;

    /**
     * 现有重症
     */
    int seriouscount;

    /**
     * 疑似新增
     */
    int suspectedincr;

    /**
     * 现有确诊新增
     */
    int currentconfirmedincr;

    /**
     * 累计确诊新增
     */
    int confirmedincr;

    /**
     * 治愈新增
     */
    int curedincr;

    /**
     * 死亡新增
     */
    int deadincr;

    /**
     * 重症新增
     */
    int seriousincr;
}
