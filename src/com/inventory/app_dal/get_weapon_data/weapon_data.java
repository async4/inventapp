package com.inventory.app_dal.get_weapon_data;

import com.inventory.app_components.app_weapons.weapon;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class weapon_data {
    private static ArrayList<weapon> pistols_data; // pistol verileri
    private static ArrayList<weapon> smgs_data; // smg verileri
    private static ArrayList<weapon> rifles_data; // rifle verileri

    public static void get_weapon_data() {
        // Veritabanindan (*) tüm column lari weapon_properties adli
        // table dan cekmek icin kullanacagimiz sql sorgu komutu.
        String sql = "SELECT * FROM weapons_properties";

        // Veritabanina baglanti gerceklestiriyoruz ve bir baglanti degiskeni elde ediyoruz.
        Connection connection = connect_weapons_db.connect();

        // Her defasinda ust uste verilerin eklenmemesi icin fonksiyon her
        // cagrildiginda verilerin tutulacagi dizi yeniden olusturulur.
        pistols_data = new ArrayList<weapon>();
        smgs_data = new ArrayList<weapon>();
        rifles_data = new ArrayList<weapon>();

        // Veritabani ile baglanti saglanmasi durumunda...
        try (connection;
             // Statement sinifi basit bir sql sorgusu calistirmak icin kullanilir.
             Statement statement  = connection.createStatement();

             // Veritabanindan gelen tüm degerleri tutacak olan degisken.
             ResultSet result_set    = statement.executeQuery(sql)){
                    while (result_set.next()) {
                        // Columnlar alinir.
                        String category = result_set.getString("CATEGORY");
                        String name = result_set.getString("NAME");
                        int magazine_capacity = result_set.getInt("MAGAZINE_CAPACITY");
                        int total_magazine_capacity = result_set.getInt("TOTAL_MAGAZINE_CAPACITY");
                        int damage = result_set.getInt("DAMAGE");
                        int range_of_fire = result_set.getInt("RANGE_OF_FIRE");
                        int wait_after_shot = result_set.getInt("WAIT_AFTER_SHOT");
                        int reload_time = result_set.getInt("RELOAD_TIME");
                        int fire_mode = result_set.getInt("FIRE_MODE");
                        String weapon_image = result_set.getString("WEAPON_IMAGE");

                        // Yeni bir weapon sinifindan nesne uretilir ve elimizde bir adet weapon nesnesi olusur.
                        weapon weapon = new weapon(category, name, new int[]{magazine_capacity, total_magazine_capacity},
                                                   damage, range_of_fire, wait_after_shot, reload_time,
                                                   fire_mode, weapon_image, "null");

                        // Olusan weaponin suanlık icin hangi veriye aktaracagimizi bilemiyoruz.
                        // Bunun icin veriyi bellege yazmadan once tipini sorgulamamiz gerekiyor.

                        if (category.compareTo("pistol") == 0) {
                            pistols_data.add(weapon);
                         }

                         if (category.compareTo("smg") == 0) {
                             smgs_data.add(weapon);
                         }

                        if (category.compareTo("rifle") == 0) {
                            rifles_data.add(weapon);
                        }
                    }
                 } catch (SQLException e) {
                     e.printStackTrace();
                 }

                // Baglanti ile isimiz bittikten sonra kapatiyoruz.
                 try {
                     connection.close();
                 } catch (SQLException e) {
                       e.printStackTrace();
                }
           }

    // Uretilen pistol verileri gonderilir.
    public static ArrayList<weapon> getPistols_data() {
        return pistols_data;
    }

    // Uretilen smg verileri gonderilir.
    public static ArrayList<weapon> getSmgs_data() {
        return smgs_data;
    }

    // Uretilen rifle verileri gonderilir.
    public static ArrayList<weapon> getRifles_data() {
        return rifles_data;
    }
}
