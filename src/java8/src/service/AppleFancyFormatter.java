package java8.src.service;

import java8.src.entity.Apple;

/**
 * @author ahmatjan(UyCode)
 * @email Hyper-Hack@outlook.com
 * @since 7/20/2021 12:05 AM
 */

public class AppleFancyFormatter implements AppleService{

    @Override
    public String accept(Apple apple) {

        String weights = apple.getWeight() > 150 ? "Heavy" : "light";
        return "A " + weights +
                " " + apple.getColor() + " apple";
    }
}
