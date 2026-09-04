package com.example.smarttable.dao;

//import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class User {

//    @TableId(type = IdType.AUTO)
    private Long id;

    private String username;

    private Integer age;

    private String phone;

    private String email;

    private String status;

//    @TableLogic
    private Integer deleted;

//    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;

//    @TableField(fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime updateTime;
}