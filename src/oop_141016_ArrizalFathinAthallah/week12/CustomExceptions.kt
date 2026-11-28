package oop_141016_ArrizalFathinAthallah.week12

class InsufficienFundsException(
    val amount: Double,
    val balance: Double
) : Exception("Attempted $amount, balance: $balance")