# KotlinClass
クラス

## 処理
クラスで`Hello World`と出力します。

## コード
```
class Greeting(val word: String) {
    fun helloworld() {
        println(word)
    }
}

fun main(args: Array<String>) {
    val gree = Greeting("Hello World")
    gree.helloworld()
}
```

## 出力結果  
```
Hello World
```

## 開発環境
| 開発ツール |  |
|:-|:-|
| OS | Windows10 |
| 仮想化ソフト | Oracle VM VirtualBox 5.2 |
| 構築ソフト | Vagrant 2.0.2 |
| 仮想化上OS | CentOS 6.9 |
| SSHクライアント | PuTTY 0.6.8 |
| FTPクライアント | Cyberduck 6.3.5 |
| エディタ | Atom 1.24.0 |
| 開発言語 | Kotlin 1.2.31 |
