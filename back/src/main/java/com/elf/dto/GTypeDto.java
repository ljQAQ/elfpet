package com.elf.dto;

import com.elf.domain.GType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class GTypeDto {
    private Integer value;
    private String label;
    private List<GTypeDto> children;
}
