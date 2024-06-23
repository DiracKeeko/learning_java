package com.keeko;


import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.keeko.entity.User;

import java.util.List;

// 操作嵌套的 JSONArray
public class FastjsonCase14JSONArray {
    public static void main(String[] args) {
        String jsonString = "{\"id\":1,\"name\":\"John Doe\",\"addresses\":[{\"city\":\"New York\",\"zipcode\":\"10001\"},{\"city\":\"Los Angeles\",\"zipcode\":\"90001\"}]}";

        // 从字符串解析为 JSONObject
        JSONObject jsonObject = JSONObject.parseObject(jsonString);

        // 获取嵌套的 JSONArray
        JSONArray jsonArray = jsonObject.getJSONArray("addresses"); // 从JSONObject中获取JSONArray

        // 遍历 JSONArray
        for (int i = 0; i < jsonArray.size(); i++) {
            JSONObject addressObject = jsonArray.getJSONObject(i);
            String city = addressObject.getString("city");
            String zipcode = addressObject.getString("zipcode");
            System.out.println("city: " + city + ", zipcode: " + zipcode);
        }
        // 输出:
        // city: New York, zipcode: 10001
        // city: Los Angeles, zipcode: 90001
    }
}
