import java.util.*

class message(val text: String, val author: String, val date: Date = Date()){
    override fun toString(): String {
        return "message(text='$text', author='$author', date=$date)"
    }
}
