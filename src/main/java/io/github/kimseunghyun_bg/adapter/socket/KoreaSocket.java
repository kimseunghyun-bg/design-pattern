package io.github.kimseunghyun_bg.adapter.socket;

import io.github.kimseunghyun_bg.adapter.plug.KoreaPlugStandard;

public class KoreaSocket {
    public void plugin(KoreaPlugStandard koreaPlugStandard){
        System.out.println("Volt: "+ koreaPlugStandard.getVolt());
    }
}
