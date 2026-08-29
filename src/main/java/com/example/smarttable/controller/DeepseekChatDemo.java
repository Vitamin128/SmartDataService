package com.example.smarttable.controller;


import com.example.smarttable.dao.UserExcel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.print.attribute.standard.MediaSize;
import java.awt.*;
import java.io.IOException;

@Slf4j
@RestController
@RequestMapping("/ai")
@Validated
public class DeepseekChatDemo {

    @PostMapping(value = "/upload",consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity<UserExcel> chat(@RequestParam("file") MultipartFile file) throws IOException {
        UserExcel UserExcelObject=new UserExcel();

        UserExcelObject.setAddress("SHANGHAI");
        UserExcelObject.setPhone("12312345344");
        UserExcelObject.setName("LISI");
        UserExcelObject.setAge(10);
        return ResponseEntity.ok(UserExcelObject);
    }
}
