class Solution {
    public String solution(String m, String[] musicinfos) {
        String answer = "(None)";
        int maxTime = 0;
        
        m = convert(m);
        
        for (String info : musicinfos) {
            String[] part = info.split(",");
            int playtime = toMin(part[1]) - toMin(part[0]);
            String title = part[2];
            String sheet = convert(part[3]);
            
            StringBuilder played = new StringBuilder();
            for (int i = 0; i < playtime; i++) {
                played.append(sheet.charAt(i % sheet.length()));
            }
            
            if (played.toString().contains(m) && playtime > maxTime) {
                maxTime = playtime;
                answer = title;
            }
        }
        return answer;
    }
    
    private int toMin(String time) {
        String[] hm = time.split(":");
        return Integer.parseInt(hm[0]) * 60 + Integer.parseInt(hm[1]);
    }
    
    private String convert(String s) {
        return s.replace("C#", "c")
                .replace("D#", "d")
                .replace("F#", "f")
                .replace("G#", "g")
                .replace("A#", "a");
    }
}