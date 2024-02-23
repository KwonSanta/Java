package ch02.lecture.p02type;

public class C07Character {
    public static void main(String[] args) {
        /*char a = 99;
        char b = 120;
        char c = 65535;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);*/

        /*char k = 0xac00;
        char l = 0xd7a3;
        System.out.println("k = " + k);
        System.out.println("l = " + l);*/

        int o = 0x1f607;
        char[] emoji = Character.toChars(o);
        String emojis = new String(emoji);
        System.out.println("emojis = " + emojis);

        // 1fx3a4 : 마이크 모양 이모지 출력
        int aa = 0x1f3a4;
        char[] emoji2 = Character.toChars(aa);
        String emojis2 = new String(emoji2);
        System.out.println("emojis2 = " + emojis2);
    }
}
