package com.example.smarttable.service;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.example.smarttable.dao.UserExcel;
import lombok.extern.slf4j.Slf4j;

@Slf4j
class UserListener extends AnalysisEventListener<UserExcel> {
    @Override
    public void invoke(UserExcel datas, AnalysisContext context) {
        log.info("开始读取数据:" + datas);
    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext context) {
        log.info("数据读取结束");
    }
}
