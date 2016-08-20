package adapter.engine

import adapter.adaptee.CarInfo

/**
 * Created by eko on 16/08/16.
 */
interface Printable {
    fun printing(): String?
}

class Printer {

    fun doPrint(printable: Printable?) {
        printable?.printing()
    }


    fun doSomething(param: String?): String {
        val carInfo = CarInfo("Toyota", "Alphard", 2015)
        println("${carInfo.model} ${carInfo.brand} ${carInfo.year}")

        with(carInfo) {
            println("$model $brand $year")

        }

        return param ?: ""
    }
}