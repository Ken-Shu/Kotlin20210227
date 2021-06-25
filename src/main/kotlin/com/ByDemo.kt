package com

class ByDemo {
    interface Base {
        fun show()
    }

    class BaseImpl : Base {
        override fun show() {
            print("BaseImpl::show()")
        }
    }
        class BaseProxy(base: Base) : Base by base {
            fun showOther() {
                print("BaseImpl::showOther()")
            }
        }

    fun mainGo(){
        val base = BaseImpl()
        BaseProxy(base).show()
        BaseProxy(base).showOther()
    }
}