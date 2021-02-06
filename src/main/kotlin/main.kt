fun main() {
    val student1 = Student("Przemysław", "Stokłosa")
    student1.addMessage("Pierwsza wiadomosc")

    val student2 = Student("Piotr","Stokłosa")
    student2.addMessage("Druga wiadomosc")

    val messages = wiadomosciWSIZ.getInstance()
    messages.printAll()

}

