package com.infect.backend.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProvinceVO {
    String provinceShortName;
    int currentConfirmedCount;
    int confirmedCount;
    int curedCount;
    int deadCount;
    int currentconfirmedincr;
    int confirmedincr;
    int curedincr;
    int deadincr;
}
