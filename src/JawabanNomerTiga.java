import java.util.Random;
import java.util.Scanner;

public class JawabanNomerTiga {
    public class SoalNomorTiga {
        int jumBus = 4;
        String[] InfoBus = {"01-Top Level", "02-MiddleLevel", "03-RegularStaff", "04-Staff"};
        public static String[] TopLevel = new String[10];
        public static int[] C01 = new int[10];
        public static String[] MiddleLevel = new String[10];
        public static int[] C02 = new int[10];
        public static String[] RegularLevel = new String[10];
        public static int[] C03 = new int[10];
        public static String[] Staff = new String[10];
        public static int[] C04 = new int[10];

        public static void bus() {
            int totalTopLevel = 0;
            int totalSisa = 0;
            for (int index = 0; index < TopLevel.length; index++) {
                if (TopLevel[index] != null) {
                    totalTopLevel++;
                }
            }
            int totalMiddleLevel =0;
            for (int index = 0; index < MiddleLevel.length; index++) {
                if (MiddleLevel[index] != null) {
                    totalMiddleLevel++;
                }
            }
            int totalRegularLevel = 0;
            for (int index = 0; index < RegularLevel.length; index++) {
                if (RegularLevel[index] != null) {
                    totalRegularLevel++;
                }
            }
            int totalStaff = 3;
            for (int index = 0; index < Staff.length; index++) {
                if (Staff[index] != null) {
                    totalStaff++;
                }
            }

            System.out.println("total Top Level =" + totalTopLevel + "|total Middle Level =" + totalMiddleLevel + "|total Regular Level =" + totalRegularLevel + "|total Staff =" + totalStaff);
            System.out.println();


        }
        public static void  CheckIndexArray(int[] myArray, String[] bus){
            int indexNow = 0;
            for(int index=0;index< myArray.length;index++){
                {
                    indexNow=index+1;
                }
            }
            if (indexNow<myArray.length){
            }

        }
        public static void SimpanNIK(int angkaRandom, String Bus){
            switch (angkaRandom){
                case 1:
                    CheckIndexArray(C01,TopLevel);
                    System.out.println("Anda Masuk ke Bus Top Level");
                    bus();
                    break;
                case 2:
                    CheckIndexArray(C02,MiddleLevel);
                    System.out.println("Anda Masuk Ke Bus Middle Level");
                    bus();
                    break;
                case 3:
                    CheckIndexArray(C03,RegularLevel);
                    System.out.println("Anda Masuk Ke Bus Regular Level");
                    bus();
                    break;
                case 4:
                    CheckIndexArray(C04,Staff);
                    System.out.println("Anda Masuk Ke Bus Staff");
                    bus();
                    break;
            }
        }
        public static void inputNIK(){
            Scanner inputdata = new Scanner(System.in);
            while(true){
                System.out.println("NIK =");
                String inputNIK = inputdata.nextLine();
                if(inputNIK.isBlank()){
                    System.out.println("NIK WAJIB DIISI");
                    inputNIK();
                }else{
                    Random hasilRandom = new Random();
                    int JenisRandom = hasilRandom.nextInt(3)+1;
                    SimpanNIK(JenisRandom,inputNIK);
                }
            }
        }

        public static void main(String[] args) {
            while (true) {
                SoalNomorTiga.inputNIK();
            }
        }}
}




