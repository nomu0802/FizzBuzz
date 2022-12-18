#実行方法
#コンソールにてプログラムがあるディレクトリに移動する
#コンソールにて" perl FizzBuzz.pl"を実行する

my $i;

for ($i = 1; $i < 100; $i++){
  if($i % 3 == 0 && $i % 5 == 0){
    print "FizzBuzz\n";
  }elsif($i % 3 == 0){
      print "Fizz\n";
  }elsif($i % 5 == 0){
      print"Buzz\n";
  }else{
      print"$i\n";
  }
}