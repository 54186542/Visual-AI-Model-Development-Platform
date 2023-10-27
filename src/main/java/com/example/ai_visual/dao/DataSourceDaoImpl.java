package com.example.ai_visual.dao;

import com.example.ai_visual.model.DataSourceModel;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DataSourceDaoImpl implements DataSourceDao {
    @Override
    public List<DataSourceModel> getAllDataSources() {
        return null;
    }

    @Override
    public DataSourceModel getDataSourceById(int id) {
        return null;
    }

    @Override
    public void createDataSource(DataSourceModel dataSource) {

    }

    @Override
    public void updateDataSource(DataSourceModel dataSource) {

    }

    @Override
    public void deleteDataSource(int id) {

    }
    // 实现接口方法
}

