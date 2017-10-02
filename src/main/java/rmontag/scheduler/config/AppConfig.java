package rmontag.scheduler.config;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;

import rmontag.scheduler.scheduling.MyBean;

@Configuration
@EnableScheduling // All bean methods annotated with @Scheduled will be registered for scheduling
public class AppConfig implements SchedulingConfigurer {

	@Bean
	public MyBean myBean() {
		return new MyBean();
	}
	
	@Override
    public void configureTasks(ScheduledTaskRegistrar taskRegistrar) {
        taskRegistrar.setScheduler(taskExecutor());
    }
 
    @Bean(destroyMethod="shutdown")
    public Executor taskExecutor() {
        return Executors.newScheduledThreadPool(10);
    }
}
