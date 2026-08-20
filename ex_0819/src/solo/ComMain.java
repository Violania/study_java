package solo;

public class ComMain {
    public static void main(String[] args) {

        Computer[] com = new Computer[5];
        for (int i = 0; i < com.length; i++) {
            com[i] = new Computer();
        }
        com[0].setCpu("e3 1220");
        com[0].setGpu("gt520");
        com[0].setRam("8gb");
        com[0].setSsd("128gb");

        com[1].setCpu("4415u");
        com[1].setGpu("hd610");
        com[1].setRam("8gb");
        com[1].setSsd("256gb");

        com[2].setCpu("5200u");
        com[2].setGpu("hd5500");
        com[2].setRam("8gb");
        com[2].setSsd("256gb");

        com[3].setCpu("11320h");
        com[3].setGpu("mx450");
        com[3].setRam("16gb");
        com[3].setSsd("512gb");

        com[4].setCpu("7700hq");
        com[4].setGpu("gtx1050");
        com[4].setRam("12gb");
        com[4].setSsd("256gb");

        com[0].setCpu("1220");
        com[0].setGpu("gt520");
        com[0].setRam("16gb");
        com[0].setSsd("256gb");

        for (int i = 0; i < com.length; i++) {
            System.out.printf("%s\t %s\t %s\t %s\t\n", com[i].getCpu(), com[i].getGpu(), com[i].getRam(),com[i].getSsd()  );
        }



    }
}
