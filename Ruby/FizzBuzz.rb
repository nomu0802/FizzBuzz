#
#実行方法
#コンソールにてプログラムがあるディレクトリに移動する
#コンソールにて"ruby FizzBuzz.rb"を実行する
#

for i in 1..100 do
    if i % 3 == 0 && i % 5 == 0
        #改行あり出力printだと改行なし
        puts("FizzBuzz")
    elsif i % 3 == 0
        puts("Fizz")
    elsif i % 5 == 0
        puts("Buzz")
    else
        puts(i)
    end 
end