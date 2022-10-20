package com.elf.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GType {
    private Integer id;
    private String typeName;
    private Integer pid;
    private List<GType> children;
}
