fun main() {
    val leo = pessoa(
        nome = "Leo",
        idade = 23
    )

    leo.falar()
    leo.caminhar()

    println("-------------")

    val leo2 = pessoa2(
        nome = "Leo",
        idade = 23,
        profissao = "Programador",
        cpf = "313123123131231-31231231"
    )

    println(leo2)

    val leo2Copy = leo2.copy(nome = "Leonardo")

    println(leo2Copy)
}