package com.keeko;

import com.keeko.utils.StringUtil;

public class TrimContent {
    public static void main(String[] args) {
        String content = "<div>今天，大消费板块集体走强，反弹行情是否可期?对此，中国银河证券财富星首席投资顾问高乐认为， 大消费反弹条件具备，" +
                "反转还需看地产。中信证券黄岑栋认为，大消费反弹源自于政策预期，但反转需要改变消费者预期。</div>" +
                "五矿证券投资顾问梁承伟认为，消费股反弹难改整体趋势。\n\n\n    .paragraphFormat{\n        text-indent: 2em;\n        margin-top: 6px;\n        margin-bottom: 6px;\n        position: relative;\n    }\n    img{\n        display: block;\n        margin: 0 auto;\n    }\n    table{\n        border: 1px solid black;\n        border-collapse: collapse;\n    }\n    table td{\n        border: 1px solid black;\n    }\n";
        String withoutHTMLTagContent = StringUtil.stripHTMLTags(content);
        System.out.println(withoutHTMLTagContent);
        String res = StringUtil.removeAllStyles(withoutHTMLTagContent);
        System.out.println(res);
    }
}
