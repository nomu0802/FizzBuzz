//.NET 5.0 SDK
//コンパイラーはMono
/*
実行方法:
コンソールにてプログラムがあるディレクトリに移動
コンソールにて"mcs FizzBuzz.cs"を実行
FizzBuzz.exeが作成される。
コンソールにて"mono FizzBuzz.exe"を実行
*/

using System;

public class FizzBuzz{
  public static void Main(){

    for(int i = 1; i <= 100; i++){
        if(i % 3 == 0 & i% 5 == 0){
          Console.WriteLine("FizzBuzz");
        }else if(i % 3 == 0){
          Console.WriteLine("Fizz");
        }else if(i % 5 == 0){
          Console.WriteLine("Buzz");
        }else{
          Console.WriteLine(i);
        }

    }
  
  }
}