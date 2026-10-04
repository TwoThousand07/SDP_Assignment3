public class Main {
    public static void main(String[] args) {
        int passed = 0;
        int totalChecks = 4;

        // T1: A1 with I1
        Device tv1 = new TvDevice();
        Remote basic1 = new BasicRemote("R1", tv1);
        String res1 = basic1.execute();
        boolean pass1 = res1.contains("TV") && res1.contains("30");
        System.out.printf("T1 %s | BasicRemote + TvDevice | result=%s\n", pass1 ? "PASS" : "FAIL", res1);
        if (pass1) passed++;

        // T2: A1 with I2
        Device radio1 = new RadioDevice();
        Remote basic2 = new BasicRemote("R2", radio1);
        String res2 = basic2.execute();
        boolean pass2 = res2.contains("Radio") && res2.contains("30");
        System.out.printf("T2 %s | BasicRemote + RadioDevice | result=%s\n", pass2 ? "PASS" : "FAIL", res2);
        if (pass2) passed++;

        // T3: A2 with I1
        Device tv2 = new TvDevice();
        Remote quiet1 = new QuietRemote("Q1", tv2);
        String res3 = quiet1.execute();
        boolean pass3 = res3.contains("TV") && res3.contains("5");
        System.out.printf("T3 %s | QuietRemote + TvDevice | result=%s\n", pass3 ? "PASS" : "FAIL", res3);
        if (pass3) passed++;

        // T4: A2 with I2
        Device radio2 = new RadioDevice();
        Remote quiet2 = new QuietRemote("Q2", radio2);
        String res4 = quiet2.execute();
        boolean pass4 = res4.contains("Radio") && res4.contains("5");
        System.out.printf("T4 %s | QuietRemote + RadioDevice | result=%s\n", pass4 ? "PASS" : "FAIL", res4);
        if (pass4) passed++;

        System.out.printf("SUMMARY: %d/%d PASS\n", passed, totalChecks);
    }
}