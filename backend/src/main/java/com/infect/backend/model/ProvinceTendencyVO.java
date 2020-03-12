package com.infect.backend.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProvinceTendencyVO {

    List<String> dates = new ArrayList<>();
    Serie currentConfirmed = new Serie();
    Serie confirmed = new Serie();
    Serie cured = new Serie();
    Serie dead = new Serie();

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class Serie {
        String name;
        List<Integer> data = new ArrayList<>();
    }
}
