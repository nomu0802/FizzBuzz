#実行方法
#プログラムファイルがあるディレクトリにて python3 FizzBuzz.pyをコンソールにて実行


    #ループ処理rangeが範囲
for i in range(1,101):
    #条件式
    if(i % 3 == 0 | i % 5 == 0):
        result = "FizzBuzz" 
    elif(i % 3 == 0):
        result = "Fizz"
    elif(i % 5 == 0):
        result = "Buzz"
    else:
        result = i
    #出力
    print(result)    