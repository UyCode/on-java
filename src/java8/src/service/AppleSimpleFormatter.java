package java8.src.service;

import java8.src.entity.Apple;

/**
 * @author ahmatjan(UyCode)
 * @email Hyper-Hack@outlook.com
 * @since 7/20/2021 12:12 AM
 */

public class AppleSimpleFormatter implements AppleService{

    @Override
    public String accept(Apple apple) {
        return "An apple of " + apple.getWeight() + "g";
    }
}
