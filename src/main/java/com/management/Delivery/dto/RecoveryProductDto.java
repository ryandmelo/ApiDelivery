package com.management.Delivery.dto;

import java.util.List;

public record RecoveryProductDto(

        Long id,

        String name,

        String description,

        String category,

        List<RecoveryProductVariationDto> productVariations,

        Boolean available

) {
}