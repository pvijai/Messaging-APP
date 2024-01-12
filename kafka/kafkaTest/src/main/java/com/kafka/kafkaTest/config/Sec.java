package com.kafka.kafkaTest.config;

public class Sec {
    public static boolean isEqual(byte digesta[], byte digestb[]) {
        if (digesta.length != digestb.length)
            return false;

        for (int i = 0; i < digesta.length; i++) {
            if (digesta[i] != digestb[i]) {
                return false;
            }
        }
        return true;
    }
}
