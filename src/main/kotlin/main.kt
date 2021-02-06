fun main() {
    val student1 = Student("Przemysław", "Stokłosa")
    student1.addMessage()

    val student2 = Student("Piotr","Stokłosa")
    student2.addMessage()

    val messages = wiadomosciWSIZ.getInstance()
    messages.printAll()

}

