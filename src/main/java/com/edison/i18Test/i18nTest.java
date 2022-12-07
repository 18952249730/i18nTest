package com.edison.i18Test;

import org.springframework.context.MessageSource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.UnsupportedEncodingException;
import java.util.Locale;

/**
 * 国际化的测试
 *
 * @author Edison on 2022/12/7
 */
public class i18nTest {
    public static void main(String[] args) throws UnsupportedEncodingException {
        MessageSource messageSource = new ClassPathXmlApplicationContext("applicationContext.xml");
        String message = messageSource.getMessage("argument.required", new Object[]{"userDao"}, "Required", Locale.CHINESE);
//        System.out.println(new String(message.getBytes(),"ISO8859-1"));
        System.out.println(message);
    }
}
