/*
実行方法
コンソールにてプログラムがあるディレクトリに移動し
"javac FizzBuzz.java"を実行
FizzBuzz.classファイルが作成されるのでコンソールにて
"java FizzBUzz"を実行
*/

public class FizzBuzz {
    public static void main(String[] args) {
        //ループ:初期値1,100以下でiは増加
        for(int i = 1; i <= 100; i++ ){
            //条件式３かつ５で割り切れる場合は"FizzBuzz"を出力する
            if(i % 3 == 0 && i % 5 == 0){
                //javaの場合はprintlnで改行込みで出力をする
                System.out.println("FizzBuzz");
            }else if(i % 3 == 0){
                System.out.println("Fizz");
            }else if(i % 5 == 0){
                System.out.println("Buzz");
            }else{
                System.out.println(i);
            }
        }
    }
}
