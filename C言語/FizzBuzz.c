/*実行方法
/コンソールにてプログラムがあるディレクトリに移動し
/"gcc FizzBuzz.c"を実行しコンパイルを行う/
/a.outが作成される為、コンソールにて"./a.out"を実行 /   
*/

#include <stdio.h>
int main(){
/* ループ:1以上100以下でiは増加 */
 for (int i = 1; i <= 100; i++) {
    /* 条件式 3かつ５で割り切れる場合はFizzBuzzを出力する*/
    if(i % 3 == 0 && i % 5 == 0){
        /*出力する際に改行を行う場合は"\n"をつける*/
        printf("FizzBuzz\n");
    }else if (i % 3 == 0) {
        printf("Fizz\n");
    }else if (i % 5 == 0){
        printf("Buzz\n");
    }else {
        printf("%d\n",i);
   }
 }
}