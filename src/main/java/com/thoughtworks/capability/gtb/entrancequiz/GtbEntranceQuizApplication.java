package com.thoughtworks.capability.gtb.entrancequiz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// TODO GTB-知识点: * 需要了解下三层架构
// TODO GTB-知识点: * 缺少Controller类
// TODO GTB-完成度: * 只实现了分组的核心逻辑，没有提供任何接口
// TODO GTB-知识点: * 违反面向对象，Member和Group没有对应的类
// TODO GTB-完成度: * 完成度太低，其它维度无法正常考察
// TODO GTB-知识点: - 需要掌握Spring MVC相关注解
@SpringBootApplication
public class GtbEntranceQuizApplication {

	public static void main(String[] args) {
		SpringApplication.run(GtbEntranceQuizApplication.class, args);
	}

}
