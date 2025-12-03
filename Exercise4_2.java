public class Exercise4_2 {

  // Her satirin sonuna calisma sirasi yorumlarini ekleyin.

    public static void main(String[] args) {
        zippo("rattle", 13);//1
    }

    public static void baffle(String blimp) {
        System.out.println(blimp);//5
        zippo("ping", -5);//6
    }

    public static void zippo(String quince, int flag) {
        if (flag < 0) {//7
            System.out.println(quince + " zoop");//8
        } else {
            System.out.println("ik");//2
            baffle(quince);//3  // quince = "rattle"
            System.out.println("boo-wa-ha-ha");//9
        }
    }
}
/*program ciktisi
ik
rattle
ping zoop
boo-wa-ha-ha*/

//tüm satırlar sadece bir kere çalıştı
