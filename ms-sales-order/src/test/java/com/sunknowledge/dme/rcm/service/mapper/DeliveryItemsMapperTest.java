package com.sunknowledge.dme.rcm.service.mapper;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DeliveryItemsMapperTest {

    private DeliveryItemsMapper deliveryItemsMapper;

    @BeforeEach
    public void setUp() {
        deliveryItemsMapper = new DeliveryItemsMapperImpl();
    }
}
