package rmontag.scheduler;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import rmontag.scheduler.config.AppConfig;

public class AppMain {
	@SuppressWarnings({ "unused", "resource" })
	public static void main(String args[]){
        AbstractApplicationContext  context = new AnnotationConfigApplicationContext(AppConfig.class);
    }
}
