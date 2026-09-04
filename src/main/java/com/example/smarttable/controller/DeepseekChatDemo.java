package com.example.smarttable.controller;


import com.example.smarttable.dao.User;
import com.example.smarttable.dao.UserExcel;
import com.example.smarttable.service.ChatService;
import lombok.extern.slf4j.Slf4j;
import org.apache.xmlbeans.impl.xb.xsdschema.Attribute;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestClient;
import org.springframework.web.multipart.MultipartFile;

import javax.print.attribute.standard.MediaSize;
import java.awt.*;
import java.io.IOException;

@Slf4j
@RestController
@RequestMapping("/ai")
@Validated
public class DeepseekChatDemo {

    @Autowired
    private ChatService chatService;
//    private ChatClient chatClient;

    @PostMapping(value = "/upload",consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public String chat(@RequestParam("file") MultipartFile file) throws IOException {
        chatService.readAsExcel(file);
        return "成功";
    }

    @GetMapping("/select/{id}")
    public User SpringCloudcall(@PathVariable Integer id)
    {
        RestClient client=RestClient.create();
        String url="http://localhost:8080/user/select/"+id.toString();
        return client.get().uri(url).retrieve().body(User.class);
    }
}
