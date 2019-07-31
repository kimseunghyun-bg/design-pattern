package io.github.kimseunghyun_bg.adapter;

import io.github.kimseunghyun_bg.adapter.plug.JapanPlug;
import io.github.kimseunghyun_bg.adapter.plug.KoreaPlug;
import io.github.kimseunghyun_bg.adapter.socket.KoreaSocket;

public class Main {
    public static void main(String[] args) {
        KoreaSocket koreaSocket = new KoreaSocket();
        koreaSocket.plugin(new KoreaPlug());

        koreaSocket.plugin(new PlugAdapter(new JapanPlug()));
    }
}
