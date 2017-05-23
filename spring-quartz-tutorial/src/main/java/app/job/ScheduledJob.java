package app.job;

import app.service.MyService;
import org.quartz.JobDataMap;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.quartz.QuartzJobBean;

public class ScheduledJob extends QuartzJobBean {

	private MyService service;

	@Override
	protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
		System.out.println("Inside Job Execution");

		JobDataMap jobDataMap = context.getMergedJobDataMap();
		String arg1 = jobDataMap.getString("arg1");
		String arg2 = jobDataMap.getString("arg2");
		service.doProcessing(arg1, arg2);
	}

	public void setService(MyService service) {
		this.service = service;
	}
}
