// DataSourceService.java
package com.example.ai_visual.service;

import com.example.ai_visual.model.DataSourceModel;
import java.util.List;

public interface DataSourceService {
    List<DataSourceModel> getAllDataSources();
    DataSourceModel getDataSourceById(int id);
    void createDataSource(DataSourceModel dataSource);
    void updateDataSource(DataSourceModel dataSource);
    void deleteDataSource(int id);
}

