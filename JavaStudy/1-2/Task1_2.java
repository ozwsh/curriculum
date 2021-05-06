/**
 * Task1-2 : 課題内容
 *
 * 本課題では、配列の使い方を学んでいきましょう。
 * 問①から問⑥まであります。
 * 指定された値と変数名を守って記述してください。
 *
 * 問⑤,⑥については、コメントを入れてください。
 *
 */
public class Task1_2 {

    public static void main(String[] args) {

        String[] country = new String[3];        
        
        country[0] = "JAPAN";

        country[1] = "AMERICA";

        country[2] = "KOREA";
         
        System.out.println(country.length);
        
        String[] strArray = new String[3];

        strArray[0] = "りんご";

        strArray[1] = "もも";

        strArray[2] = "ぶどう";
           
        System.out.println( strArray[1] );
        
        /* ⑤下記の処理について、何をしているのかコメントを記入してください。
         *  [要素数が5のint型の配列intArrayを10, 20, 30, 40, 50に上書き]
         */
        int[] intArray = { 10, 20, 30, 40, 50 };

        // ⑥下記の処理について、何をしているのかコメントを記入してください。
        // [int型の配列intArrayの2,4番目の要素値を出力]
        System.out.println(intArray[1] + intArray[4]);

    }
}