package com.automation.services.endpoints;

import java.util.HashSet;
import java.util.Set;

public class Database {

    private static Set<String> authCodes = new HashSet<>();
    private static Set<String> tokens = new HashSet<>();

    public static void addAuthCode(String authCode) {
        authCodes.add(authCode);
    }

    public static boolean isValidAuthCode(String authCode) {
        return authCodes.contains(authCode);
    }

    public static void addToken(String token) {
        tokens.add(token);
    }
    
    public static boolean isValidToken(String token) {
        return tokens.contains(token);
    }
}