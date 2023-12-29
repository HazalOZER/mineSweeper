import java.util.Random;
import java.util.Scanner;

public class MineSweeper {

    Scanner scan = new Scanner(System.in);//Scanner class çağırılıdı

    //Değişkenler(Nitelikler)
    int rowNumber, colNumber;
    String[][] map;
    String[][] board;
    int rowSelect;
    int colSelect;
    int mineLimit;
    int flag;

    //Metotlar(Davranışlar )

    void createMatris() {

        do {

            System.out.print("Satır :");
            this.rowNumber = scan.nextInt();

            System.out.print("Sütun :");
            this.colNumber = scan.nextInt();
            //Kullanıcıdan satır ve sütun değerleri alındı

            if (this.rowNumber >= 2 && this.colNumber >= 2) {//satır ve sütunun 2den büyük olması şartı denetlendi

                this.map = new String[this.rowNumber][this.colNumber];
                this.board = new String[this.rowNumber][this.colNumber];
                //map ve boardun sınırları belirlendi

            } else {

                System.out.println("Satır ve sütun seçimleri 2 ve üzeri olmalıdır. Lütfen en az 2 değeri giriniz");

                //2den küçük girilmesi durumunda uyarı mesajı verildi
            }
        } while (this.rowNumber < 2 || this.colNumber < 2);
        //2den küçük olduğu sürece  döngüye alındı


        makeBoard(this.board);
        makeBoard(this.map);
        // map ve board mayınsız olarak ("- ") atama yapıldı

        this.mineLimit = this.rowNumber * this.colNumber / 4;//mayın sayısı bulundu


    }
    void makeBoard(String[][] arr) {

        //İç içe for ile Parametre olarak girilen dizinin tüm elemanlarına "- " değeri atandı

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {

                arr[i][j] = "- ";
            }
        }
    }
    void createMap() {

        Random random = new Random(); //Random sınıfından nesne oluşturuldu

        for (int i = 0; i < mineLimit; i++) { //mayın sayısı kadar döngü sağlandı

            int a = random.nextInt(this.rowNumber);
            int b = random.nextInt(this.colNumber); //satır ve sütun numaraları için rastgele sayı oluşturuldu

            if (map[a][b].equals("* ")) {//kordinatın daha önce oluşturulup oluşturulmadığı kontrol edildi
                i--;//oluşturulmuş kordinatlarda döngüye tekrar girebilmek için i bir azaltıldı
            } else {
                map[a][b] = "* ";//kordinat daha önce oluşturulmamışsa mayın ataması yapıldı
            }
        }
    }

    void select() {

        int count = (this.rowNumber * this.colNumber) - this.mineLimit;// oyun hakkı eleman sayısı-mayınlar hesabı ile belirlendi

        do {

            printArray(this.board);//board kullanıcı ekranına basıldı

            System.out.println("Satır :");
            this.rowSelect = scan.nextInt() - 1; // satır sayısını kullanıcı için 1den başlatıldı, indeks dönüşümü kodda sağlandı

            System.out.println("Sütun :");
            this.colSelect = scan.nextInt() - 1; //sütun sayısını kullanıcı için 1 den başlatıldı, indeks dönüşümü kodda sağlandı

            if ((this.rowSelect < this.rowNumber && this.rowSelect >= 0) && (this.colSelect < this.colNumber && this.colSelect >= 0)) {
                // kordinatın dizi sınırları içerisinde olup olmadığı kontrolü yapıldı

                if ((this.map[this.rowSelect][this.colSelect]).equals("* ")) {

                    break; //mayınlı kordinat seçildiğinde döngüden çıkılması sağlandı

                } else if ((this.map[rowSelect][colSelect]).equals("- ")) {

                    counter();//counter metotu çağırıldı

                    this.map[this.rowSelect][this.colSelect] = "S ";
                    //oyun sonu map'i yazdırırken daha temiz bir görüntü için, mapteki kordinata selected/seçilmiş kısaltması olarak "S " atandı,

                    count--; //sadece seçilmemiş boş kordinatlarda oyun hakkı bir azaltıldı

                } else {
                    System.out.println("Bu kordinatı daha önce girdiniz lütfen girilmemiş kordinat giriniz.");//daha önce seçilmiş konrdinatlar için uyarı mesajı verildi
                }

            } else {
                System.out.println("Lütfen seçiminizi oyun sınırları içerisinde yapınız.");// Oyun sınırları içerisinde giriş yapmayan kullanıcıya uyarı mesajı verildi
            }

        } while (count != 0); // oyun hakkı bitene kadar döngüye alındı

        if (isWin(count)) {//isWin metotu çağırıldı
            System.out.println("Kazandınız!");
        } else {
            System.out.println("Mayına Bastınız!");//İlgili mesaj kullanıcıya verildi
        }
        printArray(map);//oyun sonu map yazdırıldı
    }

    void counter() {

        this.flag = 0;//kaç mayın olduğu flag değişkeni ile saydırıldı.

        //Önce satır koşullarına bakıldı.

        if (rowSelect == 0) {

            //satırlar for i ile döndürüldü
            for (int i = this.rowSelect; i < this.rowSelect + 2; i++) {

                //sütunları gezmek için tanımlanan metot çağırıldı.

                colCheck(i);
            }

        } else if (this.rowSelect == this.rowNumber - 1) {

            for (int i = this.rowSelect - 1; i < this.rowNumber; i++) {

                colCheck(i);

            }

        } else {
            for (int i = rowSelect - 1; i < rowSelect + 2; i++) {
                colCheck(i);
            }

        }


        this.board[rowSelect][colSelect] = flag + " ";// flag ile sayılan mayın sayısı seçilen kutucuğa yazdırıldı
    }

    void colCheck(int i) {

        //Sütun koşullarına bakıldı

        if (colSelect == 0) {
            for (int j = colSelect; j < colSelect + 2; j++) {

                //for ile kordinatlar gezdirildi

                if (this.map[i][j].equals("* ")) {
                    flag++;//mayın olan kordinatlar için bayrak bir arttırıldı
                }
            }
        } else if (colSelect == colNumber - 1) {
            for (int j = colSelect - 1; j < colNumber; j++) {
                if (this.map[i][j].equals("* ")) {
                    flag++;
                }
            }
        } else {
            for (int j = colSelect - 1; j < colSelect + 2; j++) {
                if (this.map[i][j].equals("* ")) {
                    flag++;
                }
            }
        }
    }

    void printArray(String[][] arr) {

        //ForEach ile parametre olarak girilen 2 boyutlu dizi ekrana yazdırıldı

        for (String[] row : arr) {
            for (String col : row) {
                System.out.print(col);
            }
            System.out.println();
        }
    }



    boolean isWin(int count) {

        //Kazanma koşulu değerlendirildi

        System.out.println("Oyun Sonu!");

        // parametre olarak girilen count sıfır ise true, değilse false değer döndürüldü

        return count == 0;
    }

    void game() {

        //Metotlar çağırıldı

        this.createMatris();
        this.createMap();
        this.select();
    }
}
