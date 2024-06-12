package com.yupi.springbootinit.manager;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class AiManagerTest {
    @Resource
    private AiManager aiManager;
    @Test
    void doChat() {
//        String answer = aiManager.doChat("张杰");
//        System.out.println(answer);
//        我发现了一个 AI 对话助手，点击链接进行聊天：https://www.yucongming.com/model/1654785040361893889?inviteUser=1678384569772007425
        String answer = aiManager.doChat(1782213821440892930L, "分析需求：\n" +
                "分析网站用户的增长情况\n" +
                "原始数据：\n" +
                "日期,用户数\n" +
                "1号,10\n" +
                "2号,20\n" +
                "3号,30\n");
        System.out.println(answer);
    }

}