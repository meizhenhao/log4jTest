package log4jTest;

import org.apache.log4j.Logger;

public class TestLog4j {
	
	private static Logger logger = Logger.getLogger(TestLog4j.class);
	
	public static void main(String[] args) {
		
		
			logger.info("info信息");
			logger.warn("warn信息");
			logger.debug("debug信息");
			logger.error("error信息");
		
		
		
//		级别依次是：error —— warn  ——  info —— debug
		//logger.error("error信息", new NullPointerException("空指针异常"));
	}
}
