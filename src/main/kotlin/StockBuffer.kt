import java.io.BufferedReader
import java.io.InputStream
import java.io.InputStreamReader
import java.net.URL
import java.util.*
import java.util.stream.Stream
import javax.swing.text.html.HTML

fun main() {

    var day: String = "20210624"
    var url: String =
        String.format(
            "https://www.twse.com.tw/exchangeReport/BWIBBU_d?response=csv&date=%s&selectType=ALL", day
        )

    var inputStream: InputStream = URL(url).openStream()
    var bufferReader: BufferedReader = BufferedReader(InputStreamReader(inputStream, "Big5"))
    var stream: Stream<String> = bufferReader.lines()
    println("0:證券代號,1:證券名稱,2:殖利率(%),3:股利年度,4:本益比,5:股價淨值比,6:財報年/季")


    stream.filter { r -> r.split(",").toTypedArray().size >= 7 }
        .map { r -> r.replace("\"", "") }
        //先過濾掉符號
        .filter { r -> r.split(",").toTypedArray()[2].matches("-?\\d+(\\.\\d+)?".toRegex()) }
        .filter { r -> r.split(",").toTypedArray()[4].matches("-?\\d+(\\.\\d+)?".toRegex()) }
        .filter { r -> r.split(",").toTypedArray()[5].matches("-?\\d+(\\.\\d+)?".toRegex()) }
    //殖利率
            .filter { r : String->
                val y = r.split(",").toTypedArray()[2].toDouble()
                 y > 7.0
             }
                //本益比
            .filter { r : String ->
                val pe = r.split(",")[4].toDouble()
                pe < 10
            }
            //淨值比
            .filter {r : String ->
                val pb = Optional.of(r.split(",").toTypedArray()[5].toDouble())
                pb.get()<1
            }
            .forEach(System.out::println)


}
