package com.therouter.apt

import java.util.*

class RouteItem : Comparable<RouteItem?> {

    var path = ""

    var className: String? = ""

    var action = ""

    var description = ""

    var isDeconstructPath = true

    var params = HashMap<String, String>()
    override fun compareTo(routeItem: RouteItem?): Int {
        return if (routeItem?.className == null || className == null) {
            0
        } else routeItem.className!!.compareTo(
            className!!
        )
    }

    override fun equals(o: Any?): Boolean {
        if (this === o) return true
        if (o !is RouteItem) return false
        return path == o.path &&
                className == o.className &&
                action == o.action &&
                description == o.description &&
                isDeconstructPath == o.isDeconstructPath &&
                params == o.params
    }

    override fun hashCode(): Int {
        return Objects.hash(path, className, action, description, isDeconstructPath, params)
    }

    override fun toString(): String {
        return "RouteItem(path='$path', className=$className, action='$action', description='$description', isDeconstructPath=$isDeconstructPath, params=$params)"
    }
}