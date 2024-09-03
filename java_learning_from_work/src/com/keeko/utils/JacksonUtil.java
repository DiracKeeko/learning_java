package com.keeko.utils;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;
import java.util.TimeZone;

public class JacksonUtil {

    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

    private static final SimpleModule LOCAL_DATE_TIME_MODULE = new SimpleModule()
            .addSerializer(LocalDateTime.class, new LocalDateTimeSerializer())
            .addDeserializer(LocalDateTime.class, new LocalDateTimeDeserializer());

    public static final String dateFormatToken = "yyyy-MM-dd HH:mm:ss";

    static {
        // 避免字段在json字符串中存在，但在java对象中不存在对应属性错误
        OBJECT_MAPPER.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        // 允许将空数组反序列化为null
        OBJECT_MAPPER.configure(DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT, true);
        // 允许将未知枚举反序列化为null
        OBJECT_MAPPER.configure(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL, true);

        // 避免空bean序列化为json的错误
        OBJECT_MAPPER.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
        // 避免时间字段输出时间戳
        OBJECT_MAPPER.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
        OBJECT_MAPPER.registerModule(LOCAL_DATE_TIME_MODULE);

        // 不输出null字段
        OBJECT_MAPPER.setDefaultPropertyInclusion(JsonInclude.Include.NON_NULL);
        // 转为camelCase
        OBJECT_MAPPER.setPropertyNamingStrategy(PropertyNamingStrategies.SNAKE_CASE);
        OBJECT_MAPPER.setTimeZone(TimeZone.getDefault());

        // 日期格式统一 yyyy-MM-dd HH:mm:ss
        OBJECT_MAPPER.setDateFormat(new SimpleDateFormat(dateFormatToken));
    }

    private JacksonUtil() {
    }

    public static ObjectMapper getMapper() {
        return OBJECT_MAPPER;
    }

    public static ObjectNode createObjectNode() {
        return OBJECT_MAPPER.createObjectNode();
    }

    public static ArrayNode createArrayNode() {
        return OBJECT_MAPPER.createArrayNode();
    }

    /**
     * 将字符串解析为Json对象
     * @param text
     * @return ObjectNode
     */
    public static ObjectNode parseObject(String text) {
        try {
            if (text == null || text.isEmpty()) {
                return JsonNodeFactory.instance.objectNode();
            } else {
                return (ObjectNode) OBJECT_MAPPER.readTree(text);
            }
        } catch (Exception e) {
            throw new RuntimeException("String json deserialization exception.", e);
        }
    }

    /**
     * json string to object
     *
     * @param json json string
     * @param type type reference
     * @param <T>
     * @return return parse object
     */
    public static <T> T parseObject(String json, TypeReference<T> type) {
        if (StringUtils.isEmpty(json)) {
            return null;
        }
        try {
            return OBJECT_MAPPER.readValue(json, type);
        } catch (Exception e) {
            log.error("json to map exception!", e);
        }
        return null;
    }

    /**
     * 将字符串解析为Json数组
     * @param text
     * @return ArrayNode
     */
    public static ArrayNode parseArray(String text) {
        if (text == null || text.isEmpty()) {
            return JsonNodeFactory.instance.arrayNode();
        }

        try {
            // Read the JSON tree and ensure it's an ArrayNode
            return (ArrayNode) OBJECT_MAPPER.readTree(text);
        } catch (ClassCastException e) {
            throw new IllegalArgumentException("The provided JSON is not an array.", e);
        } catch (Exception e) {
            throw new RuntimeException("JSON deserialization exception.", e);
        }
    }

    public static String toJsonString(Object object) {
        try {
            return OBJECT_MAPPER.writeValueAsString(object);
        } catch (Exception e) {
            throw new RuntimeException("Object to json string deserialization exception.", e);
        }
    }

    public static String toJsonString(Object object, SerializationFeature feature) {
        try {
            ObjectWriter writer = OBJECT_MAPPER.writer(feature);
            return writer.writeValueAsString(object);
        } catch (Exception e) {
            throw new RuntimeException("Object to json string deserialization exception.", e);
        }
    }

    public static Map<String, String> toMap(String json) {
        return parseObject(json, new TypeReference<Map<String, String>>() {
        });
    }

    public static class LocalDateTimeSerializer extends JsonSerializer<LocalDateTime> {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(dateFormatToken);

        @Override
        public void serialize(LocalDateTime value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
            gen.writeString(value.format(formatter));
        }
    }

    public static class LocalDateTimeDeserializer extends JsonDeserializer<LocalDateTime> {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(dateFormatToken);

        @Override
        public LocalDateTime deserialize(JsonParser p, DeserializationContext context) throws IOException {
            return LocalDateTime.parse(p.getValueAsString(), formatter);
        }
    }
}
