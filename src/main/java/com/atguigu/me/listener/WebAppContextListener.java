package com.atguigu.me.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import com.atguigu.me.util.Const;
import org.springframework.web.context.support.WebApplicationContextUtils;

/**
 * 类名称:WebAppContextListener.java
 *
 * @author xiaopeng
 */
public class WebAppContextListener implements ServletContextListener {

    public void contextDestroyed(ServletContextEvent event) {
        // TODO Auto-generated method stub
    }

    public void contextInitialized(ServletContextEvent event) {
        // TODO Auto-generated method stub
        Const.WEB_APP_CONTEXT = WebApplicationContextUtils.getWebApplicationContext(event.getServletContext());
        //System.out.println("========获取Spring WebApplicationContext");
    }

}
