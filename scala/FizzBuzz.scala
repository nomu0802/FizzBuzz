/*実行方法
プログラムファイルがあるディレクトリにて scala FizzBuzz.scalaをコンソールにて実行
*/
 
//object==シングルトンオブジェクト、staticがない
 object FizzBuzz{
    //defはメソッド宣言
      def main(args: Array[String]){
        //ループ
        for (i <- 1 to 100) {
          //条件式
          if(i % 3 == 0 && i % 5 == 0){
            //改行あり出力
            println("FizzBuzz")
          } else if(i % 3 == 0){
            println("Fizz")
          } else if(i % 5 == 0){
            println("Buzz")
          } else{
            println(i)
          }
        }
      }
  }