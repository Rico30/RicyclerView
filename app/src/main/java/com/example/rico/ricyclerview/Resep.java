package com.example.rico.ricyclerview;

/**
 * Created by Rico on 01-Oct-17.
 */

public class Resep {
    private String namaResep;
    private int gambarResep;
    private String deskripsiResep;
    private int gambarDetail;
    private String resepDetail;

    public Resep(String namaResep, String deskripsiResep, int gambarResep, int gambarDetail, String resepDetail) {
        this.namaResep = namaResep;
        this.gambarResep = gambarResep;
        this.deskripsiResep = deskripsiResep;
        this.gambarDetail = gambarDetail;
        this.resepDetail = resepDetail;
    }

    public String getNamaResep() {
        return namaResep;
    }

    public int getGambarResep() {
        return gambarResep;
    }

    public String getDeskripsiResep() {
        return deskripsiResep;
    }

    public int getGambarDetail() {
        return gambarDetail;
    }

    public String getResepDetail() {
        return resepDetail;
    }
}
