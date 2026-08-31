package com.example.smarttable;

import com.example.smarttable.File.Student;
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

    @Test
    void ExcelOperation()
    {
//        Student student_person=new Student("CHUHAO","GAN","2729583308@QQ.COM");
//        log.info("student_person:{}",student_person.say());
//        log.info("student_person:{}",student_person.walk());
//        log.info("student_person:{}",student_person.whoami());
        var name="dasdas";

    }

}
