package com.infect.backend.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class NationVO {
    private List<NationalProvinceVO> provinces;

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    public static class NationalProvinceVO {
        String name;
        int value;
    }
}
