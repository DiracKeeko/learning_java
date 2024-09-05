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

    public static String removeAllStyles(String content) {
        // 删除所有 <style> 标签和它们的内容
        // content = content.replaceAll("<style[^>]*>[\\s\\S]*?</style>", "");

        // 删除特定的 CSS 样式
        content = content.replaceAll("\\.paragraphFormat\\s*\\{[^}]*\\}", "");
        content = content.replaceAll("img\\s*\\{[^}]*\\}", "");
        content = content.replaceAll("table\\s*\\{[^}]*\\}", "");
        content = content.replaceAll("table\\s*td\\s*\\{[^}]*\\}", "");

        return content;
    }

}
