package rmontag.scheduler.scheduling;

import org.springframework.scheduling.annotation.Scheduled;

public class MyBean {

	@Scheduled(fixedRate=5000)
	public void printMessage() {
		System.out.println("Ping [" + Thread.currentThread().getName() + "] " + System.currentTimeMillis());
	}
}
