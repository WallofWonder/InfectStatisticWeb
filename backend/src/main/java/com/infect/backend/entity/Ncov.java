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
public class Ncov {

    List<NewsList> newsList;

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    public static class NewsList {

        List<New> news;

        Desc desc;

        @Data
        @AllArgsConstructor
        @NoArgsConstructor
        @Builder
        public static class New {
            int id;
            String pubDateStr;
            String title;
            String summary;
            String infoSource;
            String sourceUrl;
        }

        @Data
        @AllArgsConstructor
        @NoArgsConstructor
        @Builder
        public static class Desc {
            long modifytime;
            int currentconfirmedcount;
            int confirmedcount;
            int suspectedcount;
            int curedcount;
            int deadcount;
            int seriouscount;

            int suspectedincr;
            int currentconfirmedincr;
            int confirmedincr;
            int curedincr;
            int deadincr;
            int seriousincr;
        }
    }


}
