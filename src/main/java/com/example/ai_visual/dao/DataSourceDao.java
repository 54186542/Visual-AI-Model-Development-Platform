// DataSourceDao.java
package com.example.ai_visual.dao;

import com.example.ai_visual.model.DataSourceModel;

import java.util.List;

public interface DataSourceDao {
    List<DataSourceModel> getAllDataSources();
    DataSourceModel getDataSourceById(int id);
    void createDataSource(DataSourceModel dataSource);
    void updateDataSource(DataSourceModel dataSource);
    void deleteDataSource(int id);
}
