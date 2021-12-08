package com.example.gankdrama2;
import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import com.example.gankdrama2.model.Comedy;
import com.example.gankdrama2.model.Drama;
import com.example.gankdrama2.model.Fantasy;
import com.example.gankdrama2.model.Romance;

public class DataProvider {
    private static List<Drama> dramas = new ArrayList<>();

    private static List<Romance> initDataRomance(Context ctx) {
        List<Romance> romances = new ArrayList<>();
        romances.add(new Romance("Crush Landing On You", "14 Desember 2019",
                "Menceritakan kisah tentang Yoon Se Ri (Son Ye Jin) yang merupakan seorang pewaris dari keluarga kaya di Korea Selatan. Dalam sebuah insiden, paralayang yang Yoon Se Ri gunakan harus mendarat di Korea Utara karena terpaan angin kencang dan akhirnya ia berhasil diselamatkan seorang perwira Korea Utara Ri Jung Hyuk untuk Kembali ke Korea Selatan. ", R.drawable.cloy));
        romances.add(new Romance("She Was Pretty", "16 September 2015 ",
                "Drama ini bercerita tentang seorang yang bernama Sung Joon (Park Seo Joon) yang saat kecil bertubuh gendut dan juga jelek. Sung Joon memiliki teman dekat perempuan yang cantik dan juga populer bernama Hye Jin (Hwang Jung Eum).\n" +
                        "Sung Joon harus pindah ke Amerika Serikat bersama ayahnya. Setelah lima belas tahun di Amerika Serikat, Sung Joon kembali lagi ke Korea Selatan. Sung Joon yang dahulu gendut dan tidak tampan, kini berubah menjadi seorang yang tampan. \n" +
                        "Setelah kembali lagi ke Korea Selatan, Sung Joon mengatur pertemuan dengan Hye Jin ", R.drawable.swp));
        romances.add(new Romance("Go Back Couple", "13 Oktober 2017",
                "Bermula dari Choi Ban-Do dan Ma Jin-Joo adalah pasangan suami-istri. Choi Ban-Do telah terbebani dengan menjadi pencari nafkah dan Ma Jin-Joo adalah seorang ibu rumah tangga dengan harga diri rendah.\n" +
                        "Meskipun mereka saling mencintai saat mereka menikah, mereka sekarang saling membenci. Mereka berdua menyesal menikah di usia muda. Pasangan ini melakukan perjalanan waktu dan mendapati diri mereka sebagai mahasiswa berusia 20 tahun diamana saat mereka bertemu pertama kali.\n", R.drawable.gbc));
        ;
        romances.add(new Romance("Fight For My Way", "2 Juni 2017",
                "Drama ini mengisahkan Ko Dong Man yang merupakan seorang laki-laki yang bekerja sebagai seorang mantan atlit taekwondo. Pada waktu kecil dia harus mengalami pemgalaman pahit dimana beliau harus menentukan antara uang dan juga impiannya itu. Dengan kejadian itu iaharus mengalah terhadap impiannya demi menerima uang untuk membantu adik perempuannya yang sedang sakit.", R.drawable.ffmw));
        return romances;
    }

    private static List<Comedy> initDataComedy(Context ctx) {
        List<Comedy> comedies = new ArrayList<>();
        comedies.add(new Comedy("Waikiki", "5 Februari 2018 ",
                "Bercerita tentang 3 orang sahabat yaitu Kang Dong Goo,Lee Joon Ki dan Bong Doo Sik yang membuka wisma Bernama Waikiki di " +
                        "Itaewon, tempat banyak orang asing datang untuk menginap.", R.drawable.waikiki));
        comedies.add(new Comedy("Strong Women Do Bong Soon", "2017",
                "Drama ini mengisahkan tentang seorang Wanita Bernama Do Bong Soon yang memiliki kekuatan super dimana" +
                        " kekuatannya ini diturunkan dari setiap Wanita di keluarganya.", R.drawable.swdbs));
        comedies.add(new Comedy("Mr.Queen", "12 Desember 2020",
                "Mr.Queen  ini berkisahkan tentang seorang pria bernama Jang Bong Hwan yang merupakan koki istana negara, ia memiliki jiwa yang bebas yang memungkinkan dirinya entah" +
                        " bagaimana dapat masuk ke dalam tubuh ratu Kim So Yong di era Joseon.", R.drawable.mrq));
        comedies.add(new Comedy("Terius Behind Me", "27 September 2018",
                "Terius Behind Me Mengisahkan seorang wanita Go Ae Rin (Jung In Sun) yang tiba-tiba kehilangan suaminya karena terlibat dalam perang mata-mata. Bersama dengan Kim Bon / Terrius (So Ji Sub), agen ops hitam legendaris di National Intelligence Service (NIS) yang bersembunyi setelah menghilang tanpa jejak. Mereka " +
                        "berdua bekerja sama untuk mengungkap konspirasi besar yang melibatkan suami Go Ae Rin.", R.drawable.tbm));
        return comedies;
    }

    private static List<Fantasy> initDataFantasy(Context ctx) {
        List<Fantasy> fantasies = new ArrayList<>();
        fantasies.add(new Fantasy("Doom at Your Service", "10 Mei 2021 ",
                "Tak Dong-Kyeong (Park Bo-Young) merupakan seorang wanita cantik yang berprofesi sebagai editor " +
                        "untuk perusahaan web novel kisah kehidupan fiksi. Dia telah bekerja selama 6 tahun terakhir. Dia menjalani kehidupan yang buruk, mempertaruhkan hidup maupun cintanya terhadap takdir yang tidak Ia duga.", R.drawable.days));
        fantasies.add(new Fantasy("Memories of the Alhambra", "1 Desember 2018",
                "Memories of the Alhambra menceritakan kisah Yoo Jin Woo (Hyun Bin) dan Jung Hee Joo (Park Shin Hye) yang unik dan menegangkan. Yoo Jin Woo merupakan CEO Perusahaan investasi yang berjiwa keras.\n" +
                        "\n" +
                        "Dengan kemampuan dan gelarnya di bidang teknik, ia mengembangkan sebuah video game.", R.drawable.mota));
        fantasies.add(new Fantasy("High School Love On", "11 Juli 2014", "Drama ini mengisahkan malaikat bernama Le Seul Bi yang ditugaskan untuk menjaka seorang bernama Shin Woo Hyun. Dia adalah orang yang memiliki sikap dingin, namun walau sikapnya seperti itu, tak sedikit juga orang yang tertarik untuk menjadi sahabatnya.\n" +
                "\n" +
                "Suasana berubah ketika sahabat Shin Woo Hyun mengetahui bahwa dia menyukai malaikatnya itu.", R.drawable.hslo));
        fantasies.add(new Fantasy("Moorim School", "11 Januari 2016", "Mengisahkan sekolah bernama Moorim School yang tidak hanya berfokus pada nilai akademik.\n" +
                "Moorim School juga mengajarkan tentang kebajikan termaksud kejujuran, iman, perngorbanan dan komunikasi, para guru dan siswa disekolah berasal dari negara yang berbeda dan masing masing memiliki cerita mereka sendiri.", R.drawable.mschool));
        return fantasies;
    }

    private static void initAllDramas(Context ctx) {
        dramas.addAll(initDataComedy(ctx));
        dramas.addAll(initDataRomance(ctx));
        dramas.addAll(initDataFantasy(ctx));


    }

    public static List<Drama> getAllDrama(Context ctx) {
        if (dramas.size() == 0) {
            initAllDramas(ctx);
        }
        return dramas;
    }

    public static List<Drama> getDramaByGenre(Context ctx, String genre) {
        List<Drama> dramasByGenre = new ArrayList<>();
        if (dramas.size() == 0) {
            initAllDramas(ctx);
        }
        for (Drama d : dramas) {
            if ((d.getGenre().equals(genre))) {
                dramasByGenre.add(d);
            }
        }
        return dramasByGenre;
    }

}
