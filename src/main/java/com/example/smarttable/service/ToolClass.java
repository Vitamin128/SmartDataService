package com.example.smarttable.service;

import lombok.Data;

@Data
public class ToolClass<T> {
    T variable;

    public ToolClass(T variable) {
        this.variable = variable;
    }
}
