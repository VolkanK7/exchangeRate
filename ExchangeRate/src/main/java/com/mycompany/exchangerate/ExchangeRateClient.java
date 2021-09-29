package com.mycompany.exchangerate;

import com.google.gson.*;
import com.google.gson.reflect.TypeToken;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Map;

public class ExchangeRateClient {
    
    //currencyMap adında daha sonra kullanılmak üzere bir HashMap tanımlaması yapıyoruz.
    private static Map<String,String> currencyMap = new HashMap<>(); 
    /* JSON verilerini MAP verilerine dönüştüreceğimiz için jsonToMap fonksiyon tanımlaması yapıyoruz 
    ve içerisine parametre olarak str adında String nesnesi veriyoruz.
    Daha sonra JSON nesnesini Java stringine çevirmemize yarayan 'Gson' kütüphanesnden yeni bir nesne üretiyoruz.
    Gson kütühanesinin 'fromJson' sınıfından yararlanarak 'jsonToMap' fonksiyonuna gönderilen
    'str' parametresine parse işlemi gerçekleştiriyoruz. */
    public static Map<String,Object>jsonToMap(String str){
        Map<String,Object>map=new Gson().fromJson(str, new TypeToken<HashMap<String,Object>>() {}.getType());
        return map;
    }
    /* main class içerisinden ulaşabilmek için 'getRate' public sınıfı üretip içerisine parametre olarak 'currency'
    String nesnesini koyuyoruz. */
    public Map<String,String> getRate(String currency){
        
        //API bağlantıları için api key ve URL'mizi tanımlıyoruz.
        String apiKey="f03bb04a9c4704022ba355a2";
        String URL="https://prime.exchangerate-api.com/v5/"+apiKey+"/latest/"+currency;  
        
        //Tanımladığımız URL'den JSON verilerini çekmek için URL'e bağlantı işlemlerini gerçekleştiriyoruz
        try {
            //StringBuilder sınıfından daha sonra kullanmak için result adında bir nesne üretiyoruz.
            StringBuilder result=new StringBuilder();
            URL url = new URL(URL);
            //URL bağlantı işlemleri için URLConnection sınıfından 'conn' adında nesne oluşturuyoruz.
            URLConnection conn = url.openConnection();
            //Veriyi sorunsuz okumak için BufferedReader sınıfından 'rd' adında nesne üretiyoruz.
            //Stream okuması gerçekleştireceğimiz için bağlantımızı vererek okuma gerçekleştiriyoruz.
            BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            /*Okunan verileri while döngüsü ile 'result' nesnesine StringBuilder'ın append
             özelliği ile tamamını yazdırıyoruz.*/
            String line;
            while((line=rd.readLine()) != null){
                result.append(line);
            }
            //İşlemler bitince okuma işlemini durduruyoruz.
            rd.close();    
            
            /*Okuma ve çekme işlemleri tamamlanınca elimizdeki JSON verisini parse etmek için daha önce 
            yazdığımız 'jsonToMap' fonksiyonuna parametre olarak 'result' ile birlikte JSON verisinden
            çekmek istediğimiz kısmı yolluyoruz. Ardından dönen veriyi tempMap'e yolluyoruz*/
            Map<String,Object>tempMap=jsonToMap(jsonToMap(result.toString()).get("conversion_rates").toString());
            /*Parse edilerek istediğimiz formata gelen veriyi main class içerisinde kullanabilmek için
            for döngüsü ile tempMap içerisindeki hazır veriyi currencyMap'e yolluyoruz.*/
            for (Map.Entry<String, Object> iter : tempMap.entrySet()) {
                    currencyMap.put(iter.getKey(), String.valueOf(iter.getValue()));
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return currencyMap;
    }
}
