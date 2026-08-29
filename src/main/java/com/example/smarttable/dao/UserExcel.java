package com.example.smarttable.dao;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

@Data
public class UserExcel {
    @ExcelProperty("用户名")
    private String name;

    @ExcelProperty("年龄")
    private Integer age;

    @ExcelProperty("电话")
    private String phone;
}
