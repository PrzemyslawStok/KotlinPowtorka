class wiadomosciWSIZ(){
    val messages = listOf<message>()

    companion object{
        private var INSTANCE: wiadomosciWSIZ? = null

        fun getInstance(): wiadomosciWSIZ {
            if(INSTANCE==null)
                INSTANCE = wiadomosciWSIZ()

            return INSTANCE!!
        }
    }

    fun addMessage(message: message){

    }

    fun printAll(){

    }

}
