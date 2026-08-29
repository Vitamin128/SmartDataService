package com.example.smarttable;

import com.alibaba.excel.EasyExcel;
import com.example.smarttable.dao.UserExcel;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@SpringBootTest
class SmartTableApplicationTests {

    @Test
    void contextLoads() {
        StringBuilder stringbuild=new StringBuilder("你好\n");
        stringbuild.append(1);
        stringbuild.append(10);
        String ST=stringbuild.toString();

    }

    @Test
    void ExcelOperation()
    {
        List<UserExcel> list=new ArrayList<>();
        UserExcel user=new UserExcel();
        user.setName("LISI1");
        user.setAge(10);
        user.setPhone("12541854168");
        user.setAddress("SHANGHAI");
        list.add(user);

        EasyExcel.write("D://Documents/Smart.xlsx",UserExcel.class)
                .sheet("Sheet1").doWrite(list);

    }

}
