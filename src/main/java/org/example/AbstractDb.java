package org.example;


/*abstract clean kod mantığında kodu tekrar etme veya fazla kod yazmamak adına ortak kodları abstract clasta verip
farklı olacak kısımları sadece override eederek az kod yazmayı sağlıyor.
*/
public abstract class AbstractDb {

    public  void  add(){
        System.out.println("eklendi ...");
    }
    public void  delete(){
        System.out.println("Silinidi ...");
    }

    abstract void update();
    abstract void get();
}
