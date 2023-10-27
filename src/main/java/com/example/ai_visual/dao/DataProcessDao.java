//DataProcessDao
package com.example.ai_visual.dao;

public interface DataProcessDao {
    // 同样的 CRUD 操作

    void processData(int dataSourceId);

    void cleanData(int dataSourceId);

    void transformData(int dataSourceId);
    // 其他与数据处理相关的方法


}