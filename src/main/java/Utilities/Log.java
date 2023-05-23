package Utilities;

import java.util.logging.Logger;

public class Log {

    // Initialize Log4j logs
    private static Logger Log = Logger.getLogger(Log.class.getName());//

    // This is to print log for the beginning of the test case
    public static void startTestCase(String sTestCaseName){
        Log.info("****************************************************************************************");
        Log.info("$$$$$$$$$$$$$$$$$$$$$                 "+sTestCaseName+ "       $$$$$$$$$$$$$$$$$$$$$$$$$");
        Log.info("****************************************************************************************");
    }

    //This is to print log for the ending of the test case
    public static void endTestCase(String sTestCaseName){
        Log.info("XXXXXXXXXXXXXXXXXXXXXXX             "+"-E---N---D-"+"             XXXXXXXXXXXXXXXXXXXXXX");
    }

    public static void info(String message) {
        Log.info(message);
    }
}
