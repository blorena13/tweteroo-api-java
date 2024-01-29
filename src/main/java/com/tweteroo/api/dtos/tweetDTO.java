package com.tweteroo.api.dtos;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class tweetDTO {
    @NotBlank
    private String tweet;
}
