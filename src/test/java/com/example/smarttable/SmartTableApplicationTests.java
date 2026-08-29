package com.example.smarttable;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

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

}
