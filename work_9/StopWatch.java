import java.util.Date;
public class StopWatch{
	private Date startTime;
	private Date endTime;
	StopWatch(){
		startTime = new Date(System.currentTimeMillis());
	}
	void start(){
		startTime = new Date(System.currentTimeMillis());
	}
	void stop(){
		endTime = new Date(System.currentTimeMillis());
	}
	long getElapsedTime(){
		return endTime.getTime() - startTime.getTime();
	}
}