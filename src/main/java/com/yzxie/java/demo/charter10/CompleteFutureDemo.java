package com.yzxie.java.demo.charter10;

import java.util.concurrent.CompletableFuture;

/**
 * @author xieyizun
 * @date 22/6/2019 17:38
 * @description:
 */
public class CompleteFutureDemo {

    public static void main(String[] args) {
        CompletableFuture<Object> future = new CompletableFuture<>();
        future.complete("complete");
        future.thenApply(v -> {
            System.out.println("print: " + v);
            return v;
        });
    }
}
