package br.com.cpqd.asr.constant

import br.com.cpqd.asr.constant.CharsetConstants.Companion.NETWORK_CHARSET

class ByteArrayContants {
    companion object {

        val SPACE: ByteArray = " ".toByteArray(NETWORK_CHARSET)

        val CRLF: ByteArray = "\r\n".toByteArray(NETWORK_CHARSET)

        val COLON: ByteArray = ":".toByteArray(NETWORK_CHARSET)

    }
}