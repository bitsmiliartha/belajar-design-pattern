package adapter

import adapter.adaptee.CarInfo
import adapter.engine.Printable
import adapter.engine.Printer
import retrofit2.Retrofit

/**
 * Created by eko on 16/08/16.
 */
class CarInfoAdapter(val carInfo: CarInfo?) : Printable {

    override fun printing(): String? {
        return if (carInfo != null) carInfo.toString() else null
    }

}

object AdapterTest {
    fun main(args: Array<String>) {
        val printer = Printer()

        printer.doPrint(CarInfoAdapter(CarInfo("Toyota", "Innova", 2015)))

        val retrofit = Retrofit.Builder()
                .build()

    }
}