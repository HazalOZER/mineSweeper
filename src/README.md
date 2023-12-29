# Mayın Tarlası

- Projede iki sınıf oluştuldu
### Main
- Main metotu içerisinde MineSweeper sınıfından nesne oluşturuldu
- Game metodu çağırıldı.

### MineSweeper
- MineSweeper sınıfında birden fazla metotda kullanılan değişkenler sınıf içerisinde tanımlandı.
- Aşağıdaki metotlar oluşturuldu;

#### CreateMatris metodu
- Scanner sınıfından oluşturuduğumuz nesne ile kullanıcıdan satır ve sütun bilgileri alındı
- En küçük 2x2 boyutlarında matris girene kadar istem döngüye alındı.Aksi halde kullannıcıya mesaj verildi
- Dizi boyutu oyuncuda görünecen boarda ve arka planda işleyecen olan map'e atandı
- makeBoard metodu çağırıldı, board ve map mayınsız bir şekilde oluşturuldu.
- Satır ve sütun bilgileriyle mayın sayısı bulundu

#### makeBoard metodu
- İç içe for ile dizi elemanlarına "- " değeri atandı

#### creatMap metodu
- Random sınıfından nesne oluşturuldu
- Mayın sayısı kadar for döngüsü oluşturuldu
- Satır ve sütun sayılarına sınırları içerisinde rastgele değer atandı
- Rastgele gelen kordinatın "* " 'a eşit olup olmadığı kontrol edildi;
  - Eşit değilse atama yapıldı.
  - Eşitse i--; ile döngüde hak kaybı olmaması sağlandı

#### select metodu
- Mayınsız eleman sayısı bulundu. Metot içerisine tanımlanan count değişkenine atandı.
- do-while metodu ile count 0 olana kadar kullanıcı döngü içersinde tutuldu.
  - Satır ve sütun sayısı dizi sınırları içerisinde olacak şekilde kullanıcıdan istendi. Aksi halde uyarı verildi ve tekrar istendi
    - Satır ve sütun sayma sayılarına göre sıralandı. ilk satır için indeksi olan 0 sayısı değil 1 sayılsı girilecek şekilde atama yapıldı
      - Seçilen kordinat mapte "* " elemanına eşitse break komutu ile döngüden çıkıldı
      - Seçilen kordinat mapte "- " elemanına eşitse counter metodu çağırıldı.
        - Seçimi göstermek ve kontrol sağlamak için Mape "S " ataması yapıldı.
        - count--; ile oyun hakkı(boş eleman) düşürüldü
      - Seçilen kordinat "* "veya "- " değilse("S ", seçilmiş) daha önce seçtiği uyarısı verildi. Kullanıcıdan tekrar seçim yapması sağlandı
      - isWin metodu ile kontrol sağlandı. kullanıcıya ilgili mesay verildi
      - Oyun sonu printArray metodu ile map yazdırıldı

#### counter metodu
- Flag =0 tanımlandı
- Satır için koşullar yazıldı, for ile satır döndürüldü
- Sütunları gezmek için colCheck parametreli metodu çağırıldı
- Board üzerinde ilgili satıra flag+" "; ile etrafındaki mayın sayısı yazdırıldı

#### colCheck(int i) metodu
- Sütun için koşullar yazdırıldı for ile sütunlar döndürüldü
- Kordinatlar "* " eşitliği sağlanırsa flag++ ile bir arttıldı

#### printArray (String[][] arr) metodu
- ForEach ile parametre olarak girilen 2 boyutlu dizi ekrana yazdırıldı

#### isWin (int count) metodu

- Kazanma koşulu değerlendirildi
- Oyun sonu mesajı ekrana yazdırıldı.
- Return ile sonuç döndürüldü

#### game metodu

- İlgili metotlar çağırıldı
