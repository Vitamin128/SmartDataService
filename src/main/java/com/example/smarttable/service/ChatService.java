package com.example.smarttable.service;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.ExcelReader;
import com.alibaba.excel.read.metadata.ReadSheet;
import com.example.smarttable.dao.UserExcel;
import lombok.Locked;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.List;

@Service
@Slf4j
public class ChatService {
    public String readAsExcel(MultipartFile file) throws IOException {
        StringBuilder stringBuilder=new StringBuilder("原始的Excel数据\n");
        byte[] fileBytes=file.getBytes();
        List<UserExcel>rows=EasyExcel.read(new ByteArrayInputStream(fileBytes),UserExcel.class,null).sheet(0).doReadSync();
        for(UserExcel row:rows)
        {
            System.out.println(row.getName());
            System.out.println(row.getAddress());
            System.out.println(row.getAge());
            System.out.println(row.getPhone());
        }
        return " ";
    }
}
