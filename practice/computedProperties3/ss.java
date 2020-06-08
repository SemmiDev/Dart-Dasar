package com.belajar.spring.demo;

import com.belajar.spring.demo.model.DataBean;
import com.belajar.spring.demo.model.OtherBean;
import com.belajar.spring.demo.model.SampleBean;
import com.belajar.spring.demo.model.SayHello;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BelajarConfigurasi {
    @Bean(name = "sam")
    public DataBean createDataBean(){
        DataBean bean = new DataBean("Sammi Aldhi Yanto",19,"XII MIPA 1");
        return bean;
    }

    @Bean(name = "ferdi")
    public DataBean createDataBean2(){
        DataBean bean = new DataBean("Ferdi Syukroni",19,"XII MIPA 4");
        return bean;
    }


    // injections
    @Bean
    public SampleBean createSampleBean(@Qualifier("sam") DataBean dataBean){
        SampleBean bean = new SampleBean(dataBean);
        return bean;
    }

    @Bean
    public OtherBean createOtherBean(@Qualifier("ferdi") DataBean dataBean, SampleBean sampleBean) {
        OtherBean otherBean = new OtherBean(dataBean,sampleBean);
        return otherBean;
    }
//    @Bean
//    public SayHello createSayHello(){
//        return new SayHello();
//    }
}