package com.rk.docker.sample;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class JenkinsDemo {
    public static void main(String[] args) {
        System.out.println("welcome");
        String str="twitter";
        List<String> list = Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter(i -> i.getValue() > 1).map(Map.Entry::getKey).toList();

        System.out.println(list);

    }


}
