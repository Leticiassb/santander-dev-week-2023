package me.dio.controller.dto;

import me.dio.domain.model.Feature;

public record FeatureDto(Long id, String icon, String description) {

    public FeatureDto(Feature model){
        this(model.getId(), model.getIcon(), model.getDescription());
    }

    public Feature toModel(){
        Feature model = new Feature();
        model.setIcon(this.icon);
        model.setId(this.id);
        model.setDescription(this.description);
        return model;
    }
}
