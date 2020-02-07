package com.hung.kotlincoroutinesexample

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking


fun mainDemo() = runBlocking {

    launch {
       delay(200L)
        print("1")
    }

    coroutineScope {
        launch {
            kotlinx.coroutines.delay(500L)
            print(2)
        }

        kotlinx.coroutines.delay(100L)
        print(3)
    }
    print(4)

}