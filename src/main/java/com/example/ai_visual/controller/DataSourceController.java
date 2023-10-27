// DataSourceController.java
package com.example.ai_visual.controller;

import com.example.ai_visual.model.DataSourceModel;
import com.example.ai_visual.service.DataProcessService;
import com.example.ai_visual.service.DataSourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/data-source")
public class DataSourceController {

    @Autowired
    private DataSourceService dataSourceService;

    @Autowired
    private DataProcessService dataProcessService;

    @GetMapping("/all")
    public List<DataSourceModel> getAllDataSources() {
        return dataSourceService.getAllDataSources();
    }

    @GetMapping("/{id}")
    public DataSourceModel getDataSourceById(@PathVariable int id) {
        return dataSourceService.getDataSourceById(id);
    }

    @PostMapping("/create")
    public void createDataSource(@RequestBody DataSourceModel dataSource) {
        dataSourceService.createDataSource(dataSource);
    }

    @PostMapping("/update")
    public void updateDataSource(@RequestBody DataSourceModel dataSource) {
        dataSourceService.updateDataSource(dataSource);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteDataSource(@PathVariable int id) {
        dataSourceService.deleteDataSource(id);
    }

    @PostMapping("/process/{id}")
    public String processData(@PathVariable int id) {
        dataProcessService.someServiceMethod(id);
        return "Data processed successfully.";
    }


}
