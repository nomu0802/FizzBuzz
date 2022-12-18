
//実行方法
//コンソールにてプログラムがあるディレクトリに移動する
//コンソールにて「tsc FizzBuzz.ts 」を実行
//FizzBuzz.jsが作成される
// コンソールにて「node FizzBuzz.js」を実行する

//ループ
for (var i = 1; i <= 100; i++) { 
    //条件分岐
    if(i % 3 == 0 && i % 5 == 0){
        console.log("FizzBuzz");  
    }else if(i % 3 == 0){
        console.log("Fizz");
    }else if (i % 5 == 0){
        console.log("Buzz");
    }else{
        console.log(i);
    }
  }