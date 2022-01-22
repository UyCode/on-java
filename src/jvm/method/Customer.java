package jvm.method;

/**
 * @author ahmatjan(UyCode)
 * @email Hyper-Hack@outlook.com
 * @since 1/22/2022 11:02 PM
 */

public interface Customer {

    /**
     * 被编译为invokeinterface
     * @return
     */
    boolean isVIP();
}
