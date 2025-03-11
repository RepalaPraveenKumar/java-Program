package advanced_concepts;

import java.security.SecureRandom;
import java.util.Base64;

public class SecureTokenGenerator {
    public static void main(String[] args) {
        SecureRandom secureRand = new SecureRandom();
        byte[] token = new byte[16]; // 128-bit security token
        secureRand.nextBytes(token);
        String secureToken = Base64.getEncoder().encodeToString(token);
        System.out.println("Generated Secure Token: " + secureToken);
    }
}