package com.ashwin.java.completablefuture;

import java.util.List;

/**
 * For getting one-time result asynchronously.
 */
public interface CompletionHandler {
    void onComplete(List<String> words);
}
