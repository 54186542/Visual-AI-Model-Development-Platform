package com.example.ai_visual;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import java.util.*;

@RestController
public class ModelController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/invokeModel")
    public String invokeModel() {
        String url = "http://localhost:8000/predict/";

        double[][] my2DArray = new double[28][28];

// 使用随机数填充数组
        for (int i = 0; i < 28; i++) {
            for (int j = 0; j < 28; j++) {
                my2DArray[i][j] = Math.random(); // 这里用随机数填充，你可以用其他数据
            }
        }


        Map<String, Object> map = new HashMap<>();
        map.put("data", my2DArray);

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<Map<String, Object>> request = new HttpEntity<>(map, headers);
        ResponseEntity<String> response = restTemplate.postForEntity(url, request, String.class);

        return "Response from model: " + response.getBody();
    }
}
