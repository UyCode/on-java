package base.exception;

import java.io.PrintStream;
import java.io.PrintWriter;

/**
 * @author Hyper
 * @email Hyper-Hack@outlook.com
 * @since 4/6/2021/16:10:10
 */

public interface ThrowableClass {

    /**
     * @return the detail message of the exception
     */
    public String getMessage();

    public String getLocalizedMessage();

    /**
     * @return simple explanation of the exception
     */
    @Override
    String toString();


    /**
     * @print the exception message to the standard console.
     */
    void printStackTrace();

    void printStackTrace(PrintStream stream);

    void printStackTrace(PrintWriter stream);


    /*synchronized*/ Throwable fillInStackTrace();


}
