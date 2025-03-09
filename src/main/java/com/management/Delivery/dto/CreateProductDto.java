package com.management.Delivery.dto;

import java.util.List;

public record CreateProductDto(

        String name,

        String description,

        String category,

        List<CreateProductVariationDto> productVariations,

        Boolean available

) {
}