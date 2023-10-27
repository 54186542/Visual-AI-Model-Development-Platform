package com.example.ai_visual.service;

import com.example.ai_visual.dao.DataProcessDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DataProcessServiceImpl implements DataProcessService {

    @Autowired
    private DataProcessDao dataProcessDao;

    public void someServiceMethod(int dataSourceId) {
        dataProcessDao.processData(dataSourceId);
        dataProcessDao.cleanData(dataSourceId);
        // ...
    }
}
