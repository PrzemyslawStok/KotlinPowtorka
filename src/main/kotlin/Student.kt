class Student(val name: String, val surname: String) {

    fun printMessages() {
        val wiadomosciWSIZ = wiadomosciWSIZ.getInstance()
        wiadomosciWSIZ.printAll()
    }

    fun addMessage(messageText: String) {
        //tutaj może być singleton wiadomosciWSIZ
        val message = message(messageText, toString())
        val wiadomosciWSIZ = wiadomosciWSIZ.getInstance()

        wiadomosciWSIZ.addMessage(message)

    }

    override fun toString(): String {
        return "Student(name='$name', surname='$surname')"
    }


}
