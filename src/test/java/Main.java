public class Main {
    public static void main(String[] args) {
        int passed = 0;
        int totalChecks = 5;

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

        // T5: Runtime switch
        Device tv3 = new TvDevice();
        Remote switchRemote = new BasicRemote("R3", tv3);
        Remote originalRef = switchRemote;
        String before = switchRemote.execute();

        Device radio3 = new RadioDevice();
        switchRemote.setImplementation(radio3);
        String after = switchRemote.execute();

        boolean sameObject = (originalRef == switchRemote);
        boolean stateUnchanged = switchRemote.getId().equals("R3");
        boolean pass5 = sameObject && stateUnchanged && before.contains("TV") && after.contains("Radio");
        System.out.printf("T5 %s sameObject=%b | stateUnchanged=%b\n", pass5 ? "PASS" : "FAIL", sameObject, stateUnchanged);
        if (pass5) passed++;

        // T6: A1 with I3
        Device proj1 = new ProjectorDevice();
        Remote basicProj = new BasicRemote("R4", proj1);
        String res6 = basicProj.execute();
        boolean pass6 = res6.contains("Projector") && res6.contains("30");
        System.out.printf("T6 %s | BasicRemote + ProjectorDevice | result=%s\n", pass6 ? "PASS" : "FAIL", res6);
        if (pass6) passed++;

        // T7: A2 with I3
        Device proj2 = new ProjectorDevice();
        Remote quietProj = new QuietRemote("Q3", proj2);
        String res7 = quietProj.execute();
        boolean pass7 = res7.contains("Projector") && res7.contains("5");
        System.out.printf("T7 %s | QuietRemote + ProjectorDevice | result=%s\n", pass7 ? "PASS" : "FAIL", res7);
        if (pass7) passed++;

        System.out.printf("SUMMARY: %d/%d PASS\n", passed, totalChecks);
    }
}