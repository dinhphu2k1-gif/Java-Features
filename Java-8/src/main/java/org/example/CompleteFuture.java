package org.example;

import java.util.concurrent.CompletableFuture;

public class CompleteFuture {
    private void test() {
        CompletableFuture.supplyAsync(() -> {
            // Code which might throw an exception
            return "Some result";
        }).thenApply(result -> {
            return "processed result";
        }).thenApply(result -> {
            return "result after further processing";
        }).thenAccept(result -> {
            // do something with the final result
        });
    }
}
