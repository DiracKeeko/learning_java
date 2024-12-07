package com.keeko;


import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.index.query.BoolQueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.builder.SearchSourceBuilder;
import org.elasticsearch.search.sort.SortOrder;

public class EsCase01 {

    /**
     * ES表，字段信息
     */
    public static final String FUND_ES_INDEX = "fund_opinion";
    public static final String FUND_ES_INDEX_TIME = "release_day";
    public static final String FUND_ES_INDEX_FIELD_TYPE = "type.keyword";

    public static void main(String[] args) {

    }

    public void esSearch01() {
        /*
        // 发送请求 ( ElasticSearch 7.6 的写法)
        // 条件筛选，某个字段指定特殊值
        BoolQueryBuilder queryBuilder = QueryBuilders.boolQuery()
                .must(QueryBuilders.termQuery(FUND_ES_INDEX_FIELD_TYPE, "偏股混合型"));

        // 排序 与  取值限制
        SearchSourceBuilder searchSource = new SearchSourceBuilder()
                .query(queryBuilder)
                .sort(FUND_ES_INDEX_TIME, SortOrder.DESC) // 发布时间倒序排列
                .size(1); // 限制数量

        SearchRequest searchRequest = new SearchRequest(FUND_ES_INDEX).source(searchSource);
        */
        // 发送请求 ( ElasticSearch 7.6 的写法)
        // SearchResponse response = esClient.search(searchRequest, RequestOptions.DEFAULT);
    }
}
