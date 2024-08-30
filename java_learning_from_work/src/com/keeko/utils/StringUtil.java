package com.keeko.utils;

public class StringUtil {
    /*
    * 使用正则表达式 </?[^>]+> 来匹配所有 HTML 标签。
        </? 匹配开头的 < 或 </，[^>]+ 匹配所有不包含 > 的字符，最后的 > 关闭标签。
        将匹配的部分替换为 ""，即删除 HTML 标签。
    * */
    public static String stripHTMLTags(String content) {
        if (content == null || content.isEmpty()) {
            return content;
        }
        return content.replaceAll("</?[^>]+>", "");
    }
}
