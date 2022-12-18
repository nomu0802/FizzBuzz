#
# R version 4.1.2
# 実行方法:
# コンソールにてプログラムがあるファイルに移動する
# コンソールにて"rscript FizzBuzz.r"を実行する
#

    # ループ分
    for(i in 1:100){
        #条件分岐
        if( i %% 3 ==0 && i %% 5 == 0){
            # 出力
            print("FizzBuzz")
        }else if(i %% 3 == 0){
            print("Fizz")
        }else if(i %% 5 ==0){
            print("Buzz")
        }else{
            print(i)
        }
    }


