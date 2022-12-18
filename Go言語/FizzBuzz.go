/*Go言語 Version:go1.17.2
実行方法：
コンソールにてプログラムがあるディレクトリに移動
コンソールにて"go build FizzBuzz.go"を実行
FizzBuzzファイルが作成される為
コンソールにて"./FizzBuzz"を実行
*/

package main

import "fmt"

func main() {
	//ループ文
	for i := 1; i <= 100; i++ {
		if i%3 == 0 && i%5 == 0 {
			//改行つきでコンソールに表示、Printfで文字列を表示(数字は表示できない)
			fmt.Println("FizzBuzz")
		} else if i%3 == 0 {
			fmt.Println("Fizz")
		} else if i%5 == 0 {
			fmt.Println("Buzz")
		} else {
			fmt.Println(i)
		}
	}
}
