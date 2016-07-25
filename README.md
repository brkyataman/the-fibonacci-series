# the-fibonacci-series

##1.Rekürsif Metod

Algoritma n'den 1. ve 2. fibonacci sayısına gelene kadar her elemanı hesaplamak için kendini çağırır. Fakat hiç de verimli bir metod değildir çünkü fonksiyonun her kendini çağırışında önceden hesaplanmış eleman tekrar tekrar hesaplanmak zorunda kalır.

    F(n) = F(n-1) + F(n-2) = F(n-2) + F(n-3) + F(n-3) + F(n-4) = ....
    F(n) = O(2^(n-3)) + O(2^(n-4))

Yukarıda gösterildiği gibi n. sayıyı bulabilmek için ondan önceki iki eleman hesaplanmalıdır. O iki eleman içinde onlardan önce gelen iki eleman hesaplanmalıdır. Bu süreç F(1) ve F(2)'ye kadar devam eder. Yani n. sayıyı bulmak için 2^(n-2) adet sayı bulmak gerekir. Elbette harcanan zamanda -2 ifadesinin yeri olmayacağı için rekürsif metodun 'time complexity'si aşağıdaki gibi bulunur.

    F(n) = O(2^n)

##2.Iteratif Metod

Bu metodda sonuca her elemanı toplaya toplaya gidilir. Dağdan aşağıya yuvarlanan bir kartopuna benzetilebilir. Her adımda cevap giderek büyür ve en sonunda doğru cevaba ulaşılır. Iteratif metodda dinamik programlama kullanılmaktadır, yani bir kere bulunan bir eleman daha sonra kullanılacağı zaman yeniden hesaplanmaz çünkü hafızadan daha silinmemiştir. Bu da rekürsif metoda göre hız anlamında çok büyük bir avantaj sağlar. Dinamik programlama benim programımda 'firstElem' ve 'secondElem' integer değerleriyle sağlanmıştır. İlk adımda gerekli olan eleman sadece daha sonraki adımda tekrar kullanılacağı için sadece o iki adımda saklanır ve daha sonra asla çağrılmayacağı için silinir.

For döngüsün n-3 kere dönmektedir daha sonra doğru sonuca varılmaktadır. Bu da demektir ki iteratif metodun 'time complexity'si:

    F(n) = O(n)

##3.Üssel Matris Metodu

'Exponentiation by squaring' tekniği bu metodda kullanılmaktadır. Yani bir sayıyı bulabilmek için ona giden kuvvetlerden yararlanılır. Örneğin 2^8 sayını bulmak için (2x2x2x2x2x2x2x2) yerine (2^2 * 2^2) ve daha sonra (2^4 * 2^4) kullanılır. Böylece (2x2x2) yani 2^3 bulunmaz böylece hızlanılmış olunur.

Bunu Fibonacci serisine uygulamak için şu yöntem kullanılır:

