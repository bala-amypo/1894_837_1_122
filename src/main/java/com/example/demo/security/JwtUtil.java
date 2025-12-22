@Component
public class JwtUtil {
    public String generateToken(String e,String r,Long id){ return "test.jwt.token"; }
    public boolean validateToken(String t){ return true; }
    public String extractEmail(String t){ return "user@mail.com"; }
    public String extractRole(String t){ return "ADMIN"; }
    public Long extractUserId(String t){ return 10L; }
}
