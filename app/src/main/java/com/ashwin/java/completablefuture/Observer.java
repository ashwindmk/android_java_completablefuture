package com.ashwin.java.completablefuture;

import java.util.List;

/**
 * For observing changes throughout the lifecycle of a component
 */
public interface Observer {
    void onChange(List<String> words);
}
