package oop_141016_ArrizalFathinAthallah.week06

fun main() {
    val lamp = SmartLamp("L001", "Ruang Tamu")
    val speaker = SmartSpeaker("S001", "Google Nest Dapur")
    val cctv = SmartCCTV("C001", "Ezviz Garasi")

    val hub = SmartHomeHub()

    hub.addDevice(lamp)
    hub.addDevice(speaker)
    hub.addDevice(cctv)

    hub.activateSecurityMode()
    hub.turnOffAllSwitches()
}

