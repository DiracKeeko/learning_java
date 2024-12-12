package com.keeko;


import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.index.query.BoolQueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.index.query.RangeQueryBuilder;
import org.elasticsearch.search.builder.SearchSourceBuilder;
import org.elasticsearch.search.sort.SortOrder;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class EsCase02 {

    /**
     * ES表，字段信息
     */
    public static final String FUND_ES_INDEX = "fund_opinion";
    public static final String FUND_ES_INDEX_TIME = "release_day";
    public static final String FUND_ES_INDEX_FIELD_TYPE = "type.keyword";

    public static void main(String[] args) {

    }

    public void esSearch02() {

        /*
        // 创建一个有时间范围查询，有条件查询的ES请求
        final LocalDateTime endTime = LocalDate.now().atTime(LocalTime.MAX);
        final LocalDateTime startTime = LocalDate.now().minusDays(14).atTime(LocalTime.MIN);

        BoolQueryBuilder queryBuilder;
        RangeQueryBuilder rangeQuery = QueryBuilders.rangeQuery(FUND_ES_INDEX).gte(startTime).lte(endTime);
        queryBuilder = QueryBuilders.boolQuery().must(rangeQuery);

        // options, summary, coreList 三者至少有一个不为空，才会被选入
        BoolQueryBuilder shouldQuery = QueryBuilders.boolQuery()
                .should(QueryBuilders.existsQuery("options"))
                .should(QueryBuilders.existsQuery("summary"))
                .should(QueryBuilders.existsQuery("coreList"));
        queryBuilder.must(shouldQuery);

        // 会议热度从高到低(降序)，会议时间从新到旧(降序) 取5条
        final int ES_QUERY_SIZE = 5;
        SearchSourceBuilder searchSource =
                new SearchSourceBuilder().query(queryBuilder)
                        .sort("heat", SortOrder.DESC)
                        .sort(FUND_ES_INDEX_TIME, SortOrder.DESC)
                        .size(ES_QUERY_SIZE);
        SearchRequest searchRequest = new SearchRequest(FUND_ES_INDEX_TIME).source(searchSource);
        */

        // 发送请求 ( ElasticSearch 7.6 的写法)
        // SearchResponse response = esClient.search(searchRequest, RequestOptions.DEFAULT);
    }
}