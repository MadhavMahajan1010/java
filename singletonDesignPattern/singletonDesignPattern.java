/* it is primarily used where we require a centralized management system like db connection, chaching, logging etc
 * a single object is created i.e only one instance of a class
 * no multiple users because that would lead to wastage of resources
 */

package singletonDesignPattern;

class Logger {
    private static Logger logger = null;

    private Logger() {
    }; /* so at to prevent instantiation */

    public static Logger getlogger() {
        if (logger == null) {
            logger = new Logger();
        }
        return logger;
    }

    void log(String message) {
        System.out.println("Log: " + message);
    }
}

public class singletonDesignPattern {

    public static void main(String[] args) {

        Logger logger = Logger.getlogger();
        logger.log("appliation started");
    }
}
