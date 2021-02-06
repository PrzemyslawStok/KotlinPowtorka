class wiadomosciWSIZ private constructor(){
    val messages = mutableListOf<message>()

    companion object{
        private var INSTANCE: wiadomosciWSIZ? = null

        fun getInstance(): wiadomosciWSIZ {
            if(INSTANCE==null)
                INSTANCE = wiadomosciWSIZ()

            return INSTANCE!!
        }
    }

    fun addMessage(message: message){
        messages.add(message)
    }

    fun printAll(){
        messages.forEach(::println)
    }

}
