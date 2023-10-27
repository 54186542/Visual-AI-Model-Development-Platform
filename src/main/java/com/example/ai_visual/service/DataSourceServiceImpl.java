// DataSourceServiceImpl.java
package com.example.ai_visual.service;

import com.example.ai_visual.dao.DataSourceDao;
import com.example.ai_visual.model.DataSourceModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DataSourceServiceImpl implements DataSourceService {

    @Autowired
    private DataSourceDao dataSourceDao;

    @Override
    public List<DataSourceModel> getAllDataSources() {
        return dataSourceDao.getAllDataSources();
    }

    @Override
    public DataSourceModel getDataSourceById(int id) {
        return dataSourceDao.getDataSourceById(id);
    }

    @Override
    public void createDataSource(DataSourceModel dataSource) {
        dataSourceDao.createDataSource(dataSource);
    }

    @Override
    public void updateDataSource(DataSourceModel dataSource) {
        dataSourceDao.updateDataSource(dataSource);
    }

    @Override
    public void deleteDataSource(int id) {
        dataSourceDao.deleteDataSource(id);
    }

}
