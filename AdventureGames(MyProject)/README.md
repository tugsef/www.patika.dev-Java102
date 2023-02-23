# MACERA OYUNU
JAVA ile nesne tabanlı bir oyun yapıyoruz.

  - **KARAKTERLER** 



    -![image](https://user-images.githubusercontent.com/39422788/221043593-bd47194a-2451-49a5-af1f-891d9195c3f0.png)


  - **CANAVARLAR**



    ![image](https://user-images.githubusercontent.com/39422788/221043957-284d7b35-9e49-4ac0-b669-75271514b584.png)




  - **SİLAHLAR**


	![image](https://user-images.githubusercontent.com/39422788/221044216-aa6f176a-390f-453e-9921-d0e90301bcda.png)



  - **ZIRHLAR**


	![image](https://user-images.githubusercontent.com/39422788/221044309-6430669b-fd31-4e6a-b4fa-adf376aeb52d.png)



  - **MEKANLAR**
    - Güvenli Ev
    
       *Özellik : Can Yenileniyor*
      
       *Mağara*
       
       *Canavar : Zombi (1-3 Ade)*
       
       *Özellik : Savaş + Ganimet*
       
       *Eşya : Yemek (Food)*
       
    - ORMAN
    
       *Canavar : Vampir (1-3 Adet)*
       
       *Özellik : Savaş + Ganimet*
       
       *Eşya : Odun (Firewood)*

    - NEHİR
    
       *Canavar : Ayı (1-3 Adet)*
       
       *Özellik : Savaş + Ganimet*
       
       *Eşya : Su (Water)*
    
  - **MAĞAZA**  
     
       *Özellik : Destekleyici Eşyalar Satın Almak*
       
       *Silah : Tabanca,Kılıç,Tüfek*
       
       *Zırh : Hafif,Orta,Ağır*
    
  
 
   ## SINIF DİYAGRAMI
  ![image](https://user-images.githubusercontent.com/39422788/221045991-cce85884-baa9-4840-bda6-bc3c59af54db.png)
  
  
  # ÖDEVLER
  
  1 - Oyunu bitirebilmek için savaş bölgelerindeki tüm düşmanlar temizlendikten sonra bölgeye özel ödülü oyunucun envanterine eklenmelidir. Eğer oyuncu tüm ödülleri toplayıp "Güvenli Eve" dönebilirse oyunu kazanır. Ayrıca ödül kazanılan bölgeye tekrar giriş yapılamaz.
  
  Bölge Ödülleri :
  
   - Mağara => Yemek (Food)
   - Orman => Odun (Firewood)
   - Nehir => Su (Water)
  
  2 - Oyuncu bir canavarla karşılaştığında ilk hamleyi kimin yapacağını, %50 şans ile belirlenmesi. (Şuan ki durumda ilk vuran her zaman oyuncu)
  
  3 - Yeni bir savaş bölgesi eklenmeli. Bu bölgenin amacı yenilen rakiplerden rastgele para, silah veya zırh kazanma ihtimali olması.

 - Bölge Adı : Maden
 - Canavar : Yılan (1-5 Adet)
   - ID : 4
   - HASAR : Rastgele (3 ve 6 arası)
   - SAĞLIK 12
   - PARA : Yok (Onun yerine eşya kazanma ihtimali)
    
  - Özellik : Savaş ve Ganimet
  - Eşya : Para, Silah veya Zırh
  
  Yenilen bir rakiplerden düşen eşyalar :
  
  - *Silah Kazanma İhtimali : 15%*
    - Tüfek Kazanma İhtimali : 20%
    - Kılıç Kazanma İhtimali : 30%
    - Tabanca Kazanma İhtimali : 50%
    
  - *Zırh Kazanma İhtimali : 15%*
    - Ağır Zırh Kazanma İhtimali : 20%
    - Orta Zırh Kazanma İhtimali : 30%
    - Hafif Zırh Kazanma İhtimali : 50%	
    
  - *Para Kazanma İhtimali : 25%*
    - 10 Para Kazanma İhtimali: 20%
    - 5 Para Kazanma İhtimali: 30%
    - 1 Para Kazanma İhtimali: 50%
    
  - *Hiç birşey kazanamama ihtimali : 45%*

> PROJE [Orta Seviye Java ile Web Development Patikası JAVA 102](https://app.patika.dev/sefad) dersi kapsamında verilen senaryoya çerçevesinde kodlanmıştır.
