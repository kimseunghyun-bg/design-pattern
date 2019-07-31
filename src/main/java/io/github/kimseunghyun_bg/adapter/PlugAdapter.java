package io.github.kimseunghyun_bg.adapter;

import io.github.kimseunghyun_bg.adapter.plug.JapanPlug;
import io.github.kimseunghyun_bg.adapter.plug.KoreaPlugStandard;

public class PlugAdapter implements KoreaPlugStandard {
    JapanPlug japanPlug;

    public PlugAdapter(JapanPlug japanPlug) {
        this.japanPlug = japanPlug;
    }

    @Override
    public String getVolt() {
        return japanPlug.getVolt();
    }
}
