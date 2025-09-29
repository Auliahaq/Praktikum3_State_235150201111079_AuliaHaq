# Praktikum 3 – State Jetpack Compose

## 1. Implementasi State di Aplikasi
- **Counter Plus–Minus**  
  Menggunakan `remember { mutableStateOf(0) }` untuk menyimpan nilai counter.  
  Setiap kali tombol tambah atau kurang ditekan, nilai `count` berubah dan UI langsung ter-*recompose* menampilkan nilai terbaru tanpa perlu pemanggilan ulang manual.

- **Tombol Toggle Warna**  
  Memanfaatkan `remember { mutableStateOf(true) }` sebagai penanda warna.  
  Klik pada `Box` membalik nilai boolean sehingga warna otomatis berganti dari merah ke hijau atau sebaliknya.

- **Profil Interaktif (Follow/Unfollow)**  
  Menyimpan status `isFollowed` sebagai state.  
  Saat tombol ditekan, nilai state berubah sehingga teks tombol dan indikator status ikut berubah secara real-time.

Ketiga fitur tersebut menunjukkan pola kerja **state-driven UI** di Jetpack Compose: perubahan data pada state langsung memicu *recomposition* komponen yang membacanya.

---

## 2. Analisis: Mengapa Compose Lebih Sederhana dari XML Tradisional
Jetpack Compose menawarkan pendekatan deklaratif yang **berbasis state**, sehingga:
- **Tidak perlu `findViewById` atau `setText()`**. Kita cukup mendeskripsikan UI sesuai data saat ini; Compose yang mengatur pembaruan tampilan ketika state berubah.
- **Kode lebih ringkas dan mudah dirawat**. Setiap UI didefinisikan sebagai fungsi Kotlin, tanpa file layout XML terpisah.
- **Reusability dan Testing lebih mudah**. Composable bisa dibuat stateless (dengan state hoisting) sehingga dapat diuji dan dipakai ulang di berbagai tempat.

Dalam konteks tugas ini, ketiga fitur (Counter, Toggle Warna, dan Profil) dapat ditulis dalam satu file Kotlin dengan jumlah kode yang jauh lebih sedikit dan lebih mudah dibaca dibanding implementasi XML tradisional yang membutuhkan layout, binding, dan listener terpisah.
