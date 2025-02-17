package com.sunknowledge.dme.rcm.service.dto.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateDropshipParameterDTO {
    UUID soUUID;
    UUID soItemUUID;
    Long vendorId;
}
