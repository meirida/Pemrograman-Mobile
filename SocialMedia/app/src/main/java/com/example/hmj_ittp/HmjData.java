package com.example.hmj_ittp;

import com.example.hmj_ittp.Hmj;

import java.util.ArrayList;

public class HmjData extends Hmj {

    public static String[][] data = new String[][]{
            {"0", "WhatsApp",
                    "WhatsApp Messenger adalah aplikasi pesan untuk ponsel cerdas (smartphone) dengan basic mirip BlackBerry Messenger. WhatsApp Messenger merupakan aplikasi pesan lintas platform yang memungkinkan kita bertukar pesan tanpa biaya SMS, karena WhatsApp Messenger menggunakan paket data internet yang sama untuk email, browsing web, dan lain-lain.",
                    "https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcRG6o7vlaa_9NkkOY2Onisjuxo9k3MgP-kdPWLkNSHXYslpPA_J"},
            {"1", "Instagram",
                    "Instagram (juga disebut IG atau Insta) adalah sebuah aplikasi berbagi foto dan video yang memungkinkan pengguna mengambil foto, mengambil video, menerapkan filter digital, dan membagikannya ke berbagai layanan jejaring sosial, termasuk milik Instagram sendiri",
                    "https://logo-logos.com/wp-content/uploads/2016/10/Instagram_logo_icon.png"},
            {"2", "Facebook",
                    "Facebook, Inc. adalah sebuah layanan jejaring sosial berkantor pusat di Menlo Park, California, Amerika Serikat yang diluncurkan pada bulan Februari 2004. Hingga September 2012, Facebook memiliki lebih dari satu miliar pengguna aktif, lebih dari separuhnya menggunakan telepon genggam.",
                   "https://img.icons8.com/officel/2x/facebook-new.png"},
            {"3", "Twitter",
                    "Twitter adalah layanan jejaring sosial dan mikroblog daring yang memungkinkan penggunanya untuk mengirim dan membaca pesan berbasis teks hingga 140 karakter akan tetapi pada tanggal 07 November 2017 bertambah hingga 280 karakter yang dikenal dengan sebutan kicauan (tweet).",
                    "https://img.icons8.com/bubbles/2x/twitter.png"},
            {"4", "Line",
                    "LINE adalah sebuah aplikasi pengirim pesan instan gratis yang dapat digunakan pada berbagai platform seperti telepon cerdas, tablet, dan komputer. LINE difungsikan dengan menggunakan jaringan internet sehingga pengguna LINE dapat melakukan aktivitas seperti mengirim pesan teks, mengirim gambar, video, pesan suara, dan lain lain. LINE diklaim sebagai aplikasi pengirim pesan instan terlaris di 42 negara.",
                    "https://cdn.icon-icons.com/icons2/1228/PNG/512/1492692181-6line_83530.png"},
            {"5", "Telegram",
                    "Telegram adalah sebuah aplikasi layanan pengirim pesan instan multiplatform berbasis awan yang bersifat gratis dan nirlaba. Klien Telegram tersedia untuk perangkat telepon seluler (Android, iOS, Windows Phone, Ubuntu Touch) dan sistem perangkat komputer (Windows, OS X, Linux).[13] Para pengguna dapat mengirim pesan dan bertukar foto, video, stiker, audio, dan tipe berkas lainnya. Telegram juga menyediakan pengiriman pesan ujung ke ujung terenkripsi opsional.",
                    "https://egoodwater.com/egoodwater/wp-content/uploads/2018/08/telegram-logo.png"},
            {"6", "Snapchat",
                    "Snapchat adalah aplikasi pesan foto yang dikembangkan Evan Spiegel, Bobby Murphy, dan Reggie Brown[3] saat masih kuliah di Universitas Stanford. Dengan aplikasi ini, pengguna dapat mengambil foto, merekam video, menambahkan teks dan lukisan, dan mengirimkannya ke daftar penerima yang ditentukan pengguna. ",
                    "https://pngmind.com/wp-content/uploads/2019/08/Snapchat-Logo-Png-Transparent-Background.png"},
            {"7", "Google+",
                    "Google+ atau Google Plus adalah jejaring sosial yang dioperasikan oleh Google Inc. Google+ diluncurkan pada 28 Juni 2011 dengan sistem undangan untuk diuji coba. Pada hari tersebut, pengguna Google+ diizinkan untuk mengundang teman di atas 18 tahun, untuk membuat akun.",
                    "https://upload.wikimedia.org/wikipedia/commons/thumb/7/7b/Google_Plus_logo.svg/512px-Google_Plus_logo.svg.png"},
            {"8", "WeChat",
                    "WeChat adalah layanan komunikasi pesan suara dan teks telepon seluler (ponsel) yang dikembangkan oleh Tencent di Tiongkok. Aplikasi ini dapat digunakan pada beberapa sistem operasi, seperti Android, iPhone, BlackBerry, Windows Phone, dan platform Symbian. Bahasa yang didukung termasuk Bahasa Inggris, Hanzi tradisional/disederhanakan, Indonesia, Spanyol, Portugis, Thailand, Vietnam, dan Rusia. WeChat didukung pada Wi-Fi, 3G, dan data 4G jaringan.",
                    "https://i.pinimg.com/originals/de/ff/3e/deff3ef948e66ccc20849bd45b15146d.png"},
            {"9", "LinkedIn",
                    "LinkedIn adalah situs web jaringan sosial yang berorientasi bisnis, terutama digunakan untuk jaringan profesional. Sampai April 2018 Linkedin menyatakan memiliki lebih dari 546 juta pengguna di lebih dari 200 negara dan wilayah di seluruh dunia, meliputi 150 industri dan lebih dari 400 bidang ekonomi yang diklasifikasi menurut jasanya. Sedangan Statista.com menyatakan hingga April 2018, Linkedin memilik 260 juta pengguna aktif.",
                    "https://upload.wikimedia.org/wikipedia/commons/thumb/e/e9/Linkedin_icon.svg/1024px-Linkedin_icon.svg.png"}
    };

    public static ArrayList<Hmj> getListData(){
        ArrayList<Hmj> list = new ArrayList<>();
        for (String[] aData : data) {
            Hmj hmj = new Hmj();
            hmj.setId(Integer.parseInt(aData[0]));
            hmj.setName(aData[1]);
            hmj.setDescription(aData[2]);
            hmj.setPhoto(aData[3]);

            list.add(hmj);
        }
        return list;
    }
}
