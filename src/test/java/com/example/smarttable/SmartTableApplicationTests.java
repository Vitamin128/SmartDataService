package com.example.smarttable;

import com.alibaba.excel.EasyExcel;
import com.example.smarttable.dao.UserExcel;
import com.example.smarttable.service.ToolClass;
import lombok.extern.slf4j.Slf4j;
import org.apache.poi.ss.formula.functions.T;
import org.junit.jupiter.api.Test;
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
        Integer number=10;
        ToolClass<Integer> object=new ToolClass<Integer>(number);
        List<ToolClass<Integer>> list1=new ArrayList<>();
        list1.add(object);
        for(ToolClass<Integer> object1 : list1)
        {
            System.out.println(object1.getVariable());
        }

    }

}
