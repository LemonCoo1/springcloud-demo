package com.xc.monitoradmin;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.test.context.junit4.SpringRunner;

import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import java.util.Properties;

@RunWith(JUnit4.class)
public class MonitorAdminApplicationTests {

    @Test
    public void contextLoads() throws AddressException {
        JavaMailSenderImpl javaMailSender = new JavaMailSenderImpl();
        javaMailSender.setHost("smtp.163.com");//指定用来发送Email的邮件服务器主机名
        javaMailSender.setPort(587);//默认端口，标准的SMTP端口
        javaMailSender.setUsername("xcong94@163.com");//用户名
        javaMailSender.setPassword("Xcong886696");//密码

        Properties properties = new Properties();
        properties.setProperty("mail.debug","false");
        properties.setProperty("mail.smtp.auth","true");
        properties.setProperty("mail.smtp.ssl.enable","true");
        javaMailSender.setJavaMailProperties(properties);

        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();

        //发件人
        String from="xcong94@163.com";
        //设置自定义发件人昵称
        String nick="SpringBoot Admin";

        simpleMailMessage.setFrom(String.valueOf(new InternetAddress(nick+" <"+from+">")));
        //收件人
        simpleMailMessage.setTo("xucong@baiseng.com");
        //主题
        simpleMailMessage.setSubject("服务状态变更");
        //正文
        simpleMailMessage.setText("");
        javaMailSender.send(simpleMailMessage);

    }

}
