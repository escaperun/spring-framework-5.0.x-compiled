package com.study.demo;

import com.sun.xml.internal.txw2.output.IndentingXMLFilter;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

/**
 * @author luyang
 * @ClassName Test
 * @description 〈功能详细描述〉
 * @time 2019/5/1217:26
 * @modificationHistory <记录修改历史记录 who where what>
 */
@Controller
@ComponentScan("com.study.demo")
public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext();
		annotationConfigApplicationContext.register(IndexDao.class);
		annotationConfigApplicationContext.refresh();
		IndexDao indexDao = annotationConfigApplicationContext.getBean(IndexDao.class);
		indexDao.hello();
	}
}
