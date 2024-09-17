import kotlin.properties.PropertyDelegateProvider
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

open class SmartDevices(val name: String, val category: String) {

    var deviceStatus = "Off"
        protected set

    open val deviceType = "Unknown"

    open fun turnOn() {
        deviceStatus = "On"
    }

    open fun turnOff() {
        deviceStatus = "Off"
    }


}

class SmartTV(val deviceName: String) : SmartDevices(name = deviceName, category = "Electronics") {


    override val deviceType = "Smart TV"

    override fun turnOn() {
        deviceStatus = "TV turned On"
    }
    override fun turnOff() {
        deviceStatus = "TV turned Off"
    }

    fun increaseVolume


}

class RangeRegulator(
    initialValue: Int,
    private var maxRange: Int,
    private var minRange: Int,
): ReadWriteProperty<Any?, Int>{

    private var fieldData = initialValue
    override fun getValue(thisRef: Any?, property: KProperty<*>): Int {
        return fieldData
    }

    override fun setValue(thisRef: Any?, property: KProperty<*>, value: Int) {
        if (value in minRange..maxRange){
            fieldData = value
        }
    }


}
