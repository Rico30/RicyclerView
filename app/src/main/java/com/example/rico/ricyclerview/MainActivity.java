package com.example.rico.ricyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ImageView gambarResep ;
    TextView namaResep ;
    TextView deskrip;
    RecyclerView recyclerView ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gambarResep = (ImageView)findViewById(R.id.img_resep);
        namaResep = (TextView)findViewById(R.id.nama_resep);
        deskrip = (TextView)findViewById(R.id.deskripsi);
        recyclerView = (RecyclerView)findViewById(R.id.rsp_mkn);

    LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
    recyclerView.setLayoutManager(linearLayoutManager);

    String[] namaResep = {"Ikan",
                        "Udang",
                        "Kerang",
                        "Kepiting",
                        "Lobster"};
    int[] gambarResep = {R.drawable.ikan,
                        R.drawable.udang,
                        R.drawable.kerang,
                        R.drawable.kapiting,
                        R.drawable.lobster};
    String[] deskripsi = {"1.Ikan",
                        "Udang Goreng",
                        "Tauco Kerang",
                        "Kepiting Saus Tiram Pedas",
                        "Lobster Pedas Manis"};
    int[] gambarDetail = {R.drawable.ikanrica,
                        R.drawable.udang_gt,
                        R.drawable.kerang_t,
                        R.drawable.kepiting_st,
                        R.drawable.lobster_pm};
    String[] resepDetail = {"Bahan-bahan/bumbu-bumbu : \n" +
                            "\t\t •\t 2 buah ikan baronang belah dua melebar tidak putus \n" +
                            "\t\t •\t 1 sendok teh air jeruk lemon \n" +
                            "\t\t •\t 1/2 sendok teh garam \n" +
                            "\t\t •\t 1/2 sendok teh merica bubuk \n" +
                            "\t\t •\t 6 lembar daun jeruk dibuang tulangnya \n" +
                            "\t\t •\t 15 buah cabai merah keriting cincang kasar \n" +
                            "\t\t •\t 2 buah tomat merah buang biji, cincang kasar \n" +
                            "\t\t •\t 1 sendok teh garam \n" +
                            "\t\t •\t 2 sendok teh gula merah \n" +
                            "\t\t •\t 1 sendok makan air asam jawa (dari 1 sendok teh asam jawa dan 2 sendok makan air, larutkan) \n" +
                            "\t\t •\t 2 buah jeruk limau \n" +
                            "\t\t •\t 100 ml minyak untuk menumis \n\n" +

                            "Bumbu Halus: \n" +
                            "\t\t •\t 20 butir bawang merah \n" +
                            "\t\t •\t 10 buah cabai rawit merah \n" +
                            "\t\t •\t 4 cm jahe \n\n" +

                            "Cara Pengolahan : \n" +
                            "\t\t •\t Lumuri ikan baronang dengan air jeruk lemon, garam, dan merica bubuk. Diamkan 15 menit. \n" +
                            "\t\t •\t Tumis bumbu halus dan daun jeruk sampai harum. Angkat. Tambahkan cabai merah keriting, tomat merah, garam, gula merah dan air asam. Aduk rata. \n" +
                            "\t\t •\t Lumuri ikan dengan bumbu. Diamkan 20 menit. \n" +
                            "\t\t •\t Bakar ikan sampai matang sambil dioles sisa bumbu. \n" +
                            "\t\t •\t Sajikan ikan dengan sisa bumbu, jeruk limau, dan pelengkapnya.",


                            "Bahan-bahan/bumbu-bumbu : \n" +
                            "\t\t •\t 1/2 kg udang buang kepala dan kulitnya kemudian kerat kerat punggungnya, bersihkan dengan air bersih \n" +
                            "\t\t •\t 1/2 sendok teh merica \n" +
                            "\t\t •\t 100 gram tepung terigu \n" +
                            "\t\t •\t 1/2 sendok teh garam \n" +
                            "\t\t •\t 2 sendok makan air perasan jeruk lemon \n" +
                            "\t\t •\t 1 sendok teh kecap ikan \n" +
                            "\t\t •\t 150 ml air \n" +
                            "\t\t •\t 2 siung bawang putih haluskan \n" +
                            "\t\t •\t Tepung panis secukupnya \n" +
                            "\t\t •\t Minyak untuk menggoreng \n\n" +

                            "Cara Pengolahan : \n" +
                            "\t\t •\t Bersihkan udang lalu cuci hingga bersih, setelah itu lumuri dengan bawang putih yang telah do haluskan, air jeruk lemon dan kecap ikan hingga rata, setelah itu diamkan udang selama 10 menit. \n" +
                            "\t\t •\t Untuk membuat bahan pencelup : campur tepung terigu, air, merica dan garam, aduk hingga rata, sisihkan. \n" +
                            "\t\t •\t Celup udang ke dalam bahan pencelup, lalu gulingkan di atas tepung panir hingga rata, goreng di dalam minyak panas dengan api sedang hingga kuning keemasan, angkat dan tiriskan. \n" +
                            "\t\t •\t Udang goreng siap disajikan",

                            "Bahan-bahan/bumbu-bumbu : \n" +
                            "\t\t •\t 250 gr kerang batu - kupas dan keluarkan isinya dan cucilah dengan bersih \n" +
                            "\t\t •\t 2 buah tahu sutera, lalu potonglah menjadi 16 bagian\n" +
                            "\t\t •\t 2 lembar daun salam \n" +
                            "\t\t •\t 1 buah tomat merah segar, lalu iris sesuai selera Anda \n" +
                            "\t\t •\t 5 butir bawang merah, lalu iris tipis \n" +
                            "\t\t •\t 2 siung bawang putih, lalu iris tipis juga \n" +
                            "\t\t •\t 6 buah cabai hijau besar, dan irislah serong tipis\n" +
                            "\t\t •\t 10 cabai rawit merah, dan irislah serong tipis \n" +
                            "\t\t •\t 1 sendok makan tauco medan \n" +
                            "\t\t •\t 1/2 sdt gula pasir \n" +
                            "\t\t •\t 1/4 sdt garam \n" +
                            "\t\t •\t Minyak secukupnya untuk menumis \n" +
                            "\t\t •\t 2 ruas jari lengkuas, dan memarkan \n\n" +

                            "Cara Pengolahan : \n" +
                            "\t\t •\t Pertama Panaskanlah minyak dalam wajan, lalu tumis bawang merah dan bawang putih yang telah diiris-iris tipis tadi sampai ada aroma harum. \n" +
                            "\t\t •\t Kemudian Masukkan potongan cabai, tomat, tauco, lengkuas, daun salam, gula, garam, lalu aduklah sampai merata \n" +
                            "\t\t •\t Setelah itu masukkan kerang yang telah bersih tadi ke dalam wajan bersama bumbu yang telah merata, dan aduk lah sebentar, tambahkan 500 ml air dan tahu yang sudah dipotong-potong menjadi 16 bagian.Biarkan hingga kerang matang dan bumbunya meresap, tidak perlu diaduk secara berulang-ulang agar tahu tidak mudah hancur.\n" +
                            "\t\t •\t Setelah matang lalu angkat dan sajikann.",

                            "Bahan-bahan/bumbu-bumbu : \n" +
                            "\t\t •\t 5 ekor kepiting yang masih segar ( ukuran besar ) \n" +
                            "\t\t •\t 5 sendok makan saus tiram \n" +
                            "\t\t •\t 3 sendok makan saus tomat \n" +
                            "\t\t •\t 15 buah cabe rawit ( haluskan sedikit kasar ) atau sesuai selera\n" +
                            "\t\t •\t 1/2 sendok teh merica bubuk \n" +
                            "\t\t •\t Garam secukupnya \n" +
                            "\t\t •\t Gula pasir secukupnya \n" +
                            "\t\t •\t Penyedap rasa secukupnya \n" +
                            "\t\t •\t Sir secukupnya \n" +
                            "\t\t •\t Minyak untuk menumis secukupnya \n\n" +

                             "Bumbu : \n" +
                             "\t\t •\t 3 siung bawang ( putih haluskan )\n" +
                             "\t\t •\t 6 butir bawang merah ( haluskan ) \n" +
                             "\t\t •\t 2 buah cabe merah segar ( buang bijinya, haluskan ) \n" +
                             "\t\t •\t 3 cm jahe ( memarkan ) \n" +
                             "\t\t •\t 1 batang serai ( memarkan ) \n" +
                             "\t\t •\t 2 cm lengkuas ( memarkan ) \n" +
                             "\t\t •\t 3 lembar daun salam ( dicuci bersih ) \n\n" +

                            "Cara Pengolahan : \n" +
                            "\t\t •\t Cuci kepiting sampai benar-benar bersih \n" +
                            "\t\t •\t Rebus kepiting yang sudah bersih dalam air yang mendidih sampai matang ( angkat, tiriskan ) \n" +
                            "\t\t •\t Tumis bumbu yang dihaluskan dengan sedikit minyak dalam wajan sampai harum \n" +
                            "\t\t •\t Masukkan jahe, batang serai, dan lengkuas yang sudah dimemarkan \n" +
                            "\t\t •\t Tambahkan daun salam yang sudah dicuci bersih \n" +
                            "\t\t •\t Tuang air kedalam bumbu yang ditumis secukupnya tunggu sampai mendidih \n" +
                            "\t\t •\t Masukkan kepiting yang sudah direbus kedalam bumbu \n" +
                            "\t\t •\t Kemudian masukkan saus tomat, saus tiram, cabe rawit yang sudah dihaluskan sedikit kasar dan semua bumbu ( merica bubuk, gula pasir, garam dam penyedap rasa ) sambil diaduk sampai tercampur rata tunggu sampai matang \n" +
                            "\t\t •\t Kepiting saus tiram siap disajikan",

                            "Bahan-bahan/bumbu-bumbu : \n" +
                            "\t\t •\t Udang lobster disigar tengah namun tidak sampai terbelah menjadi 2 \n" +
                            "\t\t •\t Siapkan udang lobster,  \n" +
                            "\t\t •\t kemudian di belah menjadi dua bagian mengikuti panjangnya bukan lebarnya \n" +
                            "\t\t •\t Bawang putih, bisa dicincang halus atau di haliskan dengan diulek atau bisa juga di geprak agar gepeng dengan pisau \n" +
                            "\t\t •\t Cabai merah dan cabai rawit sesuai selera kemudian di cincang halus \n" +
                            "\t\t •\t Jeruk nipis, ambil sari airnya\n" +
                            "\t\t •\t Minyak goreng secukupnya \n\n" +

                            "Cara Pengolahan : \n" +
                            "\t\t •\t Bersihkan lobster dengan air mengalir\n" +
                            "\t\t •\t Belah menjadi dua lobster, namun jangan sampai terpisah \n" +
                            "\t\t •\t Teteskan sedikit jeruk nipis di bagian dalam udang lobster\n" +
                            "\t\t •\t Panaskan minyak goreng\n" +
                            "\t\t •\t Tumis bawang putih dan cabai hingga harum \n" +
                            "\t\t •\t Masukan dan campur saus dengan tumisan,  \n" +
                            "\t\t •\t Aduk hingga merata dan tunggu hingga harum\n" +
                            "\t\t •\t Masukan air mineral kedalam tunggu hingga sedikit mendidih\n" +
                            "\t\t •\t Masukan udang lobster yang telah dibersihkan kemudian tunggu hingga air surut\n" +
                            "\t\t •\t Disajikan dalam piring \n" +
                            "\t\t •\t Dan beri beberapa tetesan jeruk nipis di sekeliling airnnya " };

    ArrayList<Resep> resepArrayList = new ArrayList<>();

    for ( int i = 0 ; i<namaResep.length; i++){
        Resep resep = new Resep(namaResep[i], deskripsi[i], gambarResep[i], gambarDetail[i], resepDetail[i]);
        resepArrayList.add(resep);
    }


    ResepAdapter resepAdapter=
            new ResepAdapter( this ,resepArrayList);
    recyclerView.setAdapter(resepAdapter);
    }
}
