package com.infect.backend.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CityVO {
    String cityname;
    int currentconfirmedcount;
    int confirmedcount;
    int curedcount;
    int deadcount;
}
