public class CapsLock {
    public String solution(String s) {
        boolean capital = false;
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c == 'a' || c == 'A') {
                capital = !capital;
            }
            else if (c > 'a' && c <= 'z') {
                sb.append(capital ? Character.toUpperCase(c) : c);
            }
            else if (c > 'A' && c <= 'Z') {
                sb.append(capital ? Character.toLowerCase(c) : c);
            }
            else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
