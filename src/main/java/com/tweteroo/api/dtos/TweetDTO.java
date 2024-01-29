package com.tweteroo.api.dtos;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class TweetDTO{
    @NotBlank
    private int userId;

    @NotBlank
    private String tweet;
}
