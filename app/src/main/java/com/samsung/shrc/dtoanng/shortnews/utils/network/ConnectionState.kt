package com.samsung.shrc.dtoanng.shortnews.utils.network

sealed class ConnectionState {
    data object Available: ConnectionState()
    data object Unavailable: ConnectionState()
}