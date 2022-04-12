package com.bjpowernode.scheduler;

import com.bjpowernode.entity.Book;
import com.bjpowernode.entity.Bookborrow;
import com.bjpowernode.entity.User;
import com.bjpowernode.mapper.BookDao;
import com.bjpowernode.mapper.UserDao;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.Trigger;
import org.springframework.scheduling.TriggerContext;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;
import org.springframework.scheduling.support.CronTrigger;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;


@EnableScheduling
@Component
@Slf4j
public class BorrowLasttime implements SchedulingConfigurer {

    private String cron = "*/50 * * * * ?";

    @Resource
    private UserDao userDao;

    @Override
    public void configureTasks(ScheduledTaskRegistrar taskRegistrar) {



        //任务线程，在run方法中添加业务逻辑
        Runnable task = new Runnable() {

            @Override
            public void run() {
                System.out.println(userDao.selectUserById(1));
            }
        };

        //触发器，灵活的设置cron表达式
        Trigger trigger = new Trigger() {
            @Override
            public Date nextExecutionTime(TriggerContext triggerContext) {

                CronTrigger cronTrigger = new CronTrigger(cron);
                Date nextExecTime = cronTrigger.nextExecutionTime(triggerContext);
                return nextExecTime;
            }
        };
        taskRegistrar.addTriggerTask(task, trigger);
    }
}
