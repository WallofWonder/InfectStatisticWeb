package com.infect.backend.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class NcovCity {

    List<News> newsList;

    /**
     * 省疫情
     */
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    public static class News {
        String provinceShortName;
        int currentConfirmedCount;
        int confirmedCount;
        int suspectedCount;
        int curedCount;
        int deadCount;
        List<City> cities;

        /**
         * 市疫情
         */
        @Data
        @AllArgsConstructor
        @NoArgsConstructor
        @Builder
        public static class City {
            String cityName;
            int currentConfirmedCount;
            int confirmedCount;
            int suspectedCount;
            int curedCount;
            int deadCount;
        }
    }
}
